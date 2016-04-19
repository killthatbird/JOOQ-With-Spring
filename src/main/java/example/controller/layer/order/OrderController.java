package example.controller.layer.order;

import example.base.layer.protocol.response.APIError;
import example.business.layer.order.bo.OrderBo;
import example.business.layer.order.service.OrderService;
import example.business.layer.order.vo.UserWithOrder;
import example.framework.layer.controller.BasicController;
import example.framework.layer.log.LogHelper;
import example.framework.layer.protocol.response.Result;
import example.framework.layer.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/order")
public class OrderController extends BasicController {
	@Autowired
	private OrderService orderService;

	private static final int uid=185147;

	/**
	 * 创建订单
	 *
	 * @param amount 订单金额
	 * @param remark 订单备注
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Result add(Long amount,String remark) {
		LogHelper.info("amount:{}", amount);
        OrderBo bo=new OrderBo();
        bo.setAmout(amount);
        int orderId=orderService.add(uid,bo);
        LogHelper.info("执行成功,订单号:{}", orderId);
        return new Result(orderId);
	}

	private static final Result NOT_EXISTS=new Result(APIError.ORDER_NOT_EXISTS);

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Result getOne(int orderId) {
		LogHelper.info("orderId:{}", orderId);
		if(orderId<=0){
			return NOT_EXISTS;
		}
		UserWithOrder userWithOrder=orderService.getOne(uid, orderId);
		LogHelper.info("订单信息:{}", Utils.toString(userWithOrder));
		if(userWithOrder==null){
			return NOT_EXISTS;
		}
		return new Result(userWithOrder);
	}
}

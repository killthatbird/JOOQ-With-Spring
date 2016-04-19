/**
 * This class is generated by jOOQ
 */
package example.dao.layer.rdbms.base.model;


import example.dao.layer.rdbms.base.model.tables.Order;
import example.dao.layer.rdbms.base.model.tables.OrderLog;
import example.dao.layer.rdbms.base.model.tables.SchemaVersion;
import example.dao.layer.rdbms.base.model.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in study
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table study.order
	 */
	public static final Order ORDER = example.dao.layer.rdbms.base.model.tables.Order.ORDER;

	/**
	 * 订单状态变化表
	 */
	public static final OrderLog ORDER_LOG = example.dao.layer.rdbms.base.model.tables.OrderLog.ORDER_LOG;

	/**
	 * The table study.schema_version
	 */
	public static final SchemaVersion SCHEMA_VERSION = example.dao.layer.rdbms.base.model.tables.SchemaVersion.SCHEMA_VERSION;

	/**
	 * The table study.user
	 */
	public static final User USER = example.dao.layer.rdbms.base.model.tables.User.USER;
}
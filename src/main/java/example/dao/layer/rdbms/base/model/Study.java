/**
 * This class is generated by jOOQ
 */
package example.dao.layer.rdbms.base.model;


import example.dao.layer.rdbms.base.model.tables.Order;
import example.dao.layer.rdbms.base.model.tables.OrderLog;
import example.dao.layer.rdbms.base.model.tables.SchemaVersion;
import example.dao.layer.rdbms.base.model.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Study extends SchemaImpl {

	private static final long serialVersionUID = -1702942234;

	/**
	 * The reference instance of <code>study</code>
	 */
	public static final Study STUDY = new Study();

	/**
	 * No further instances allowed
	 */
	private Study() {
		super("study");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Order.ORDER,
			OrderLog.ORDER_LOG,
			SchemaVersion.SCHEMA_VERSION,
			User.USER);
	}
}

/**
 * This class is generated by jOOQ
 */
package com.bsu.jersey.jooq.generated.tables;


import com.bsu.jersey.jooq.generated.Carshop;
import com.bsu.jersey.jooq.generated.Keys;
import com.bsu.jersey.jooq.generated.enums.BCarServiceServiceItem;
import com.bsu.jersey.jooq.generated.tables.records.BCarServiceRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BCarService extends TableImpl<BCarServiceRecord> {

    private static final long serialVersionUID = 941404593;

    /**
     * The reference instance of <code>carshop.b_car_service</code>
     */
    public static final BCarService B_CAR_SERVICE = new BCarService();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BCarServiceRecord> getRecordType() {
        return BCarServiceRecord.class;
    }

    /**
     * The column <code>carshop.b_car_service.id</code>.
     */
    public final TableField<BCarServiceRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>carshop.b_car_service.service_car_models_id</code>. 保养车型的id
     */
    public final TableField<BCarServiceRecord, UInteger> SERVICE_CAR_MODELS_ID = createField("service_car_models_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "保养车型的id");

    /**
     * The column <code>carshop.b_car_service.service_item</code>. 保养项目名
     */
    public final TableField<BCarServiceRecord, BCarServiceServiceItem> SERVICE_ITEM = createField("service_item", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.bsu.jersey.jooq.generated.enums.BCarServiceServiceItem.class), this, "保养项目名");

    /**
     * The column <code>carshop.b_car_service.start_kilometer</code>. 起始公里数，单位为万功力
     */
    public final TableField<BCarServiceRecord, UInteger> START_KILOMETER = createField("start_kilometer", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "起始公里数，单位为万功力");

    /**
     * The column <code>carshop.b_car_service.interval_kilometer</code>. 间隔公里数，单位万公里
     */
    public final TableField<BCarServiceRecord, UInteger> INTERVAL_KILOMETER = createField("interval_kilometer", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "间隔公里数，单位万公里");

    /**
     * The column <code>carshop.b_car_service.price</code>. 价格
     */
    public final TableField<BCarServiceRecord, Double> PRICE = createField("price", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.FLOAT)), this, "价格");

    /**
     * Create a <code>carshop.b_car_service</code> table reference
     */
    public BCarService() {
        this("b_car_service", null);
    }

    /**
     * Create an aliased <code>carshop.b_car_service</code> table reference
     */
    public BCarService(String alias) {
        this(alias, B_CAR_SERVICE);
    }

    private BCarService(String alias, Table<BCarServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private BCarService(String alias, Table<BCarServiceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Carshop.CARSHOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BCarServiceRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_B_CAR_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BCarServiceRecord> getPrimaryKey() {
        return Keys.KEY_B_CAR_SERVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BCarServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<BCarServiceRecord>>asList(Keys.KEY_B_CAR_SERVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BCarService as(String alias) {
        return new BCarService(alias, this);
    }

    /**
     * Rename this table
     */
    public BCarService rename(String name) {
        return new BCarService(name, null);
    }
}

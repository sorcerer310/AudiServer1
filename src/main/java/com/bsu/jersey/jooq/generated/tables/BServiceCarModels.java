/**
 * This class is generated by jOOQ
 */
package com.bsu.jersey.jooq.generated.tables;


import com.bsu.jersey.jooq.generated.Carshop;
import com.bsu.jersey.jooq.generated.Keys;
import com.bsu.jersey.jooq.generated.tables.records.BServiceCarModelsRecord;

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
public class BServiceCarModels extends TableImpl<BServiceCarModelsRecord> {

    private static final long serialVersionUID = 337298522;

    /**
     * The reference instance of <code>carshop.b_service_car_models</code>
     */
    public static final BServiceCarModels B_SERVICE_CAR_MODELS = new BServiceCarModels();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BServiceCarModelsRecord> getRecordType() {
        return BServiceCarModelsRecord.class;
    }

    /**
     * The column <code>carshop.b_service_car_models.id</code>.
     */
    public final TableField<BServiceCarModelsRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>carshop.b_service_car_models.service_car_models</code>. 车型名称
     */
    public final TableField<BServiceCarModelsRecord, String> SERVICE_CAR_MODELS = createField("service_car_models", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "车型名称");

    /**
     * Create a <code>carshop.b_service_car_models</code> table reference
     */
    public BServiceCarModels() {
        this("b_service_car_models", null);
    }

    /**
     * Create an aliased <code>carshop.b_service_car_models</code> table reference
     */
    public BServiceCarModels(String alias) {
        this(alias, B_SERVICE_CAR_MODELS);
    }

    private BServiceCarModels(String alias, Table<BServiceCarModelsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BServiceCarModels(String alias, Table<BServiceCarModelsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BServiceCarModelsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_B_SERVICE_CAR_MODELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BServiceCarModelsRecord> getPrimaryKey() {
        return Keys.KEY_B_SERVICE_CAR_MODELS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BServiceCarModelsRecord>> getKeys() {
        return Arrays.<UniqueKey<BServiceCarModelsRecord>>asList(Keys.KEY_B_SERVICE_CAR_MODELS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BServiceCarModels as(String alias) {
        return new BServiceCarModels(alias, this);
    }

    /**
     * Rename this table
     */
    public BServiceCarModels rename(String name) {
        return new BServiceCarModels(name, null);
    }
}

/**
 * This class is generated by jOOQ
 */
package com.bsu.jersey.jooq.generated.tables.records;


import com.bsu.jersey.jooq.generated.enums.BCarDealerStatus;
import com.bsu.jersey.jooq.generated.enums.BCarDealerType;
import com.bsu.jersey.jooq.generated.tables.BCarDealer;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 汽车经销商表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BCarDealerRecord extends UpdatableRecordImpl<BCarDealerRecord> {

    private static final long serialVersionUID = -159761083;

    /**
     * Setter for <code>carshop.b_car_dealer.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.no</code>. 经销商编码
     */
    public void setNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.no</code>. 经销商编码
     */
    public String getNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.name</code>. 经销商名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.name</code>. 经销商名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.type</code>. 经销商类型
     */
    public void setType(BCarDealerType value) {
        set(3, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.type</code>. 经销商类型
     */
    public BCarDealerType getType() {
        return (BCarDealerType) get(3);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.status</code>. 经销商状态
     */
    public void setStatus(BCarDealerStatus value) {
        set(4, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.status</code>. 经销商状态
     */
    public BCarDealerStatus getStatus() {
        return (BCarDealerStatus) get(4);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.abbreviation</code>. 经销商简称
     */
    public void setAbbreviation(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.abbreviation</code>. 经销商简称
     */
    public String getAbbreviation() {
        return (String) get(5);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.address</code>. 通讯地址，包含省市
     */
    public void setAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.address</code>. 通讯地址，包含省市
     */
    public String getAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.province</code>. 省份
     */
    public void setProvince(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.province</code>. 省份
     */
    public String getProvince() {
        return (String) get(7);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.city</code>. 市
     */
    public void setCity(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.city</code>. 市
     */
    public String getCity() {
        return (String) get(8);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_district</code>. 服务大区
     */
    public void setServiceDistrict(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_district</code>. 服务大区
     */
    public String getServiceDistrict() {
        return (String) get(9);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_cell</code>. 服务小区
     */
    public void setServiceCell(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_cell</code>. 服务小区
     */
    public String getServiceCell() {
        return (String) get(10);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_representative</code>. 销售代表
     */
    public void setServiceRepresentative(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_representative</code>. 销售代表
     */
    public String getServiceRepresentative() {
        return (String) get(11);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.technical_representative</code>. 技术代表
     */
    public void setTechnicalRepresentative(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.technical_representative</code>. 技术代表
     */
    public String getTechnicalRepresentative() {
        return (String) get(12);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.general_manager</code>. 总经理
     */
    public void setGeneralManager(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.general_manager</code>. 总经理
     */
    public String getGeneralManager() {
        return (String) get(13);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.general_manager_phone</code>. 总经理电话
     */
    public void setGeneralManagerPhone(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.general_manager_phone</code>. 总经理电话
     */
    public String getGeneralManagerPhone() {
        return (String) get(14);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_director</code>. 服务总监
     */
    public void setServiceDirector(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_director</code>. 服务总监
     */
    public String getServiceDirector() {
        return (String) get(15);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_director_phone</code>. 服务总监电话
     */
    public void setServiceDirectorPhone(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_director_phone</code>. 服务总监电话
     */
    public String getServiceDirectorPhone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_manager</code>.
     */
    public void setServiceManager(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_manager</code>.
     */
    public String getServiceManager() {
        return (String) get(17);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.service_manager_phone</code>. 服务经理电话
     */
    public void setServiceManagerPhone(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.service_manager_phone</code>. 服务经理电话
     */
    public String getServiceManagerPhone() {
        return (String) get(18);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.assistant_manager</code>. 经理助理
     */
    public void setAssistantManager(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.assistant_manager</code>. 经理助理
     */
    public String getAssistantManager() {
        return (String) get(19);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.assistant_manager_phone</code>. 总经理助理电话
     */
    public void setAssistantManagerPhone(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.assistant_manager_phone</code>. 总经理助理电话
     */
    public String getAssistantManagerPhone() {
        return (String) get(20);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.rescue_phone</code>. 24小时救援电话
     */
    public void setRescuePhone(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.rescue_phone</code>. 24小时救援电话
     */
    public String getRescuePhone() {
        return (String) get(21);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.after_sale_phone</code>. 售后电话
     */
    public void setAfterSalePhone(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.after_sale_phone</code>. 售后电话
     */
    public String getAfterSalePhone() {
        return (String) get(22);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.apointment_phone</code>.
     */
    public void setApointmentPhone(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.apointment_phone</code>.
     */
    public String getApointmentPhone() {
        return (String) get(23);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.zip_code</code>. 邮编
     */
    public void setZipCode(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.zip_code</code>. 邮编
     */
    public String getZipCode() {
        return (String) get(24);
    }

    /**
     * Setter for <code>carshop.b_car_dealer.opening_date</code>. 开业日期
     */
    public void setOpeningDate(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>carshop.b_car_dealer.opening_date</code>. 开业日期
     */
    public Timestamp getOpeningDate() {
        return (Timestamp) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BCarDealerRecord
     */
    public BCarDealerRecord() {
        super(BCarDealer.B_CAR_DEALER);
    }

    /**
     * Create a detached, initialised BCarDealerRecord
     */
    public BCarDealerRecord(UInteger id, String no, String name, BCarDealerType type, BCarDealerStatus status, String abbreviation, String address, String province, String city, String serviceDistrict, String serviceCell, String serviceRepresentative, String technicalRepresentative, String generalManager, String generalManagerPhone, String serviceDirector, String serviceDirectorPhone, String serviceManager, String serviceManagerPhone, String assistantManager, String assistantManagerPhone, String rescuePhone, String afterSalePhone, String apointmentPhone, String zipCode, Timestamp openingDate) {
        super(BCarDealer.B_CAR_DEALER);

        set(0, id);
        set(1, no);
        set(2, name);
        set(3, type);
        set(4, status);
        set(5, abbreviation);
        set(6, address);
        set(7, province);
        set(8, city);
        set(9, serviceDistrict);
        set(10, serviceCell);
        set(11, serviceRepresentative);
        set(12, technicalRepresentative);
        set(13, generalManager);
        set(14, generalManagerPhone);
        set(15, serviceDirector);
        set(16, serviceDirectorPhone);
        set(17, serviceManager);
        set(18, serviceManagerPhone);
        set(19, assistantManager);
        set(20, assistantManagerPhone);
        set(21, rescuePhone);
        set(22, afterSalePhone);
        set(23, apointmentPhone);
        set(24, zipCode);
        set(25, openingDate);
    }
}

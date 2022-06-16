package com.example.pojo;

import java.util.Date;

public class Orders {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMobile_id() {
        return mobile_id;
    }

    public void setMobile_id(int mobile_id) {
        this.mobile_id = mobile_id;
    }

    public int getCutomer_id() {
        return cutomer_id;
    }

    public void setCutomer_id(int cutomer_id) {
        this.cutomer_id = cutomer_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    private int id;
    private int mobile_id;
    private int cutomer_id;
    private Date order_date;
}

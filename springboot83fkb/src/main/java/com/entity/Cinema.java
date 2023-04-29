package com.entity;

import java.io.Serializable;

/**
 * (Cinema)实体类
 *
 * @author makejava
 * @since 2023-04-27 20:20:14
 */

public class Cinema implements Serializable {
    private static final long serialVersionUID = -10505678388704085L;
    /**
     * 主键
     */

    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 城市
     */
    private String city;
    /**
     * 价格
     */
    private Double price;
    /**
     * 公告
     */
    private String notice;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 距离
     */
    private Double distance;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

}


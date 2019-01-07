package com.hhy.library.bean;

/**
 * Created by huanghaiyuan on 2019/1/4.
 */
public class WeatherReq {
    private String cityid;
    private String city;
    private String ip;

    public WeatherReq() {
    }

    public WeatherReq(String cityid, String city) {
        this.cityid = cityid;
        this.city = city;
    }

    public WeatherReq(String ip) {
        this.ip = ip;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

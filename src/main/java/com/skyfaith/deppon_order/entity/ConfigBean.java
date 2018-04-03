package com.skyfaith.deppon_order.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com.deppon")
public class ConfigBean {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    private String companyCode;

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    private String appkey;

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getAppkey() {
        return appkey;
    }
}

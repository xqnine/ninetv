package com.github.tvbox.osc.bean;

import java.io.Serializable;

public class Subtitle implements Serializable {

    private String name;

    private String url;

    private boolean isZip;

    public boolean getIsZip() {
        return isZip;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIsZip(boolean zip) {
        isZip = zip;
    }

    @Override
    public String toString() {
        return "Subtitle{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", isZip=" + isZip +
                '}';
    }
}

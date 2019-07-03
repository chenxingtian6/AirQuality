package cn.cxt.entity;

import java.io.Serializable;

/**
 * 区域信息
 */
public class District implements Serializable {
    private Integer id;//区域编号
    private String name;//区域名称

    public District() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

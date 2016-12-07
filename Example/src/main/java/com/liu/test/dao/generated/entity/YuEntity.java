package com.liu.test.dao.generated.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "yu")
public class YuEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num;

    private String classname;

    private static final long serialVersionUID = 1L;

    /**
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }
}
package com.liu.test.dao.generated.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "liu")
public class LiuEntity implements Serializable {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "`name`")
    private String name;

    private Integer age;

    private String addr;

    private Integer num;

    private static final long serialVersionUID = 1L;

    /**
     * @return _id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

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
}
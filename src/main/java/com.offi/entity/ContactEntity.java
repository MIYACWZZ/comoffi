package com.offi.entity;

import javax.persistence.*;

@Entity
@Table(name = "contact", schema = "official", catalog = "")
public class ContactEntity {
    private int id;
    private String name;
    private String tel;
    private String phone;
    private String qq;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactEntity that = (ContactEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        return result;
    }

    /**
     * 除了id的参数构造器
     * @param name
     * @param tel
     * @param phone
     * @param qq
     */
    public ContactEntity(String name, String tel, String phone, String qq) {
        this.name = name;
        this.tel = tel;
        this.phone = phone;
        this.qq = qq;
    }
}

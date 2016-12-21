package cn.shopping.mybatis.po;

import java.util.Date;

/**
 * Created by tpusers on 2016/12/20.
 */
public class User {
    private String id;
    private String username;
    private String sex;

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Date birthday;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    private String address;

    public User(String id, String username, String sex, Date birthday, String address) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "id = " + id + "\n"
                + "username = " + username + "\n"
                + "sex = " + sex + "\n"
                + "birthday = " + birthday + "\n"
                + "address = " + address + "\n";
    }

}

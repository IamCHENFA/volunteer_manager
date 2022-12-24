package com.shou.pojo;

/**
 * @author 11937
 */
public class Users {
    private String account;
    private String password;
    private String identity;

    public Users(String account, String password, String identity) {
        this.account = account;
        this.password = password;
        this.identity = identity;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}

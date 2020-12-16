package learnSpring.service;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2020/11/30 20:54
 */
public class User {

    private BigInteger id;


    private String email;

    private String password;

    private String name;


    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(BigInteger id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public User() {
    }
}

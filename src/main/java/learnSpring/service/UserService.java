package learnSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.*;
/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2020/11/30 21:46
 */
@Service
public class UserService {

    @Autowired
    private MailService mailService;


    private List<User> userList = Arrays.asList(new User(BigInteger.ONE, "bob@example.com", "password", "Bob"), // bob
            new User(BigInteger.valueOf(2), "alice@example.com", "password", "Alice"), // alice
            new User(BigInteger.valueOf(3), "tom@example.com", "password", "Tom"));
            ; // tom

    public User login(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                mailService.sendLoginMail(user);
                return user;
            }
        }
        throw new RuntimeException("login failed");
    }

    public User register(String email, String password, String name) {
        userList.forEach( x -> {
            if (x.getEmail().equals(email));
            throw new RuntimeException("email exists");
        });
        User user = new User();
        user.setId(BigInteger.valueOf(11));
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        userList.add(user);
        mailService.sendRegisterMail(user);
        return user;
    }

    public User getUser(BigInteger id) {
        return userList.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

}

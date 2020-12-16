package learnSpring.service;

import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2020/11/30 20:32
 */
@Service
public class MailService {

    private ZoneId zoneId = ZoneId.systemDefault();

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public String getTime() {
        return ZonedDateTime.now(this.zoneId).format(DateTimeFormatter.ISO_DATE_TIME);
    }

    public void sendLoginMail(User user) {
        System.err.println(String.format("Hi, %s, you are login in %s", user.getName(), getTime()));
    }

    public void sendRegisterMail(User user) {
        System.err.println(String.format("Hi, %s, you have registered  in %s", user.getName(), getTime()));
    }
}

package gtel.com.java_spring.redis.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

@Data
@RedisHash("register_tai_khoan")
public class RegisterTaiKhoanEntity {
    @Id
    private String transactionId;

    private String otp;

    private long otpExpiredTime;

    private long otpResendTime;

    private int otpResendCount;

    private String phoneNumber;

    private String password;

    private int otpFail;

    @TimeToLive
    private long ttl;
}

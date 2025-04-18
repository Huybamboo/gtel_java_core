package gtel.com.java_spring.redis.entities;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("otp")
public class OtpLimitEntity {
}

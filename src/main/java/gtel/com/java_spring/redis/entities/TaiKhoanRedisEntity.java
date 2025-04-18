package gtel.com.java_spring.redis.entities;

import gtel.com.java_spring.entities.TaiKhoan;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Data
@RedisHash("tai_khoan")
public class TaiKhoanRedisEntity implements Serializable {

    @Id
    private String code;

    private TaiKhoan data;

    @TimeToLive(unit = TimeUnit.SECONDS)
    private long timeToLive;
}

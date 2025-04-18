package gtel.com.java_spring.common;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "ngay_tao")
    private Instant ngay_tao;

    @Column(name = "ngay_sua")
    private Instant ngay_sua;

    @PrePersist
    protected void onCreate() {
        this.ngay_tao = Instant.now();
        this.ngay_sua = Instant.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.ngay_sua = Instant.now();
    }
}

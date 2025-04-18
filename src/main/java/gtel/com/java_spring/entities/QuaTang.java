package gtel.com.java_spring.entities;

import gtel.com.java_spring.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Table(name = "QUA_TANG")
@Data
@Entity
@Getter
@Setter
public class QuaTang extends BaseEntity {

    @Column(name = "ten")
    private String ten;

    @Column(name = "ma")
    private String ma;

    @Column(name = "loai")
    private Integer loai;

    @Column(name = "ngay_nhan")
    private Instant ngay_nhan;

    @Column(name = "trang_thai")
    private String trang_thai;

}

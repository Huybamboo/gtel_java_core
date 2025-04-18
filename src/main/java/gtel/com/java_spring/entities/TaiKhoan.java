package gtel.com.java_spring.entities;

import gtel.com.java_spring.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Table(name = "ACCOUNT")
@Entity
@Data
@Getter
@Setter
public class TaiKhoan extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "tai_khoan")
    private String taiKhoan;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "email")
    private String email;

}

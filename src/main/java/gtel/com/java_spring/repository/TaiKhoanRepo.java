package gtel.com.java_spring.repository;

import gtel.com.java_spring.entities.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaiKhoanRepo extends JpaRepository<TaiKhoan, String> {

    boolean existsByTaiKhoan(String taiKhoan);

}

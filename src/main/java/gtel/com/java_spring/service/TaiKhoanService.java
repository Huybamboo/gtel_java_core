package gtel.com.java_spring.service;

import gtel.com.java_spring.Dto.TaiKhoan.RegisterRequest;
import gtel.com.java_spring.entities.TaiKhoan;

import java.util.List;

public interface TaiKhoanService {

    public List<TaiKhoan> findAll();

    public TaiKhoan dangKyTaiKhoan(RegisterRequest request);
}

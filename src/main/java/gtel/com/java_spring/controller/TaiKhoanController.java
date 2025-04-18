package gtel.com.java_spring.controller;

import gtel.com.java_spring.Dto.TaiKhoan.RegisterRequest;
import gtel.com.java_spring.entities.TaiKhoan;
import gtel.com.java_spring.service.TaiKhoanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tai-khoan")
@Validated
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @PostMapping("/registry")
    public ResponseEntity<TaiKhoan> dangKyTaiKhoan (@RequestBody @Valid RegisterRequest request) {
        TaiKhoan taiKhoan = taiKhoanService.dangKyTaiKhoan(request);
        return ResponseEntity.ok(taiKhoan);
    }

    @PostMapping("/resend")
    public ResponseEntity<Object> resendOtp ( ) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/confirm")
    public ResponseEntity<Object> confirmOtp ( ) {
        return ResponseEntity.ok(null);
    }
}

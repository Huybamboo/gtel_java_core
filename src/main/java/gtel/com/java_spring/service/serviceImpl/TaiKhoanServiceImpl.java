package gtel.com.java_spring.service.serviceImpl;

import gtel.com.java_spring.Dto.TaiKhoan.RegisterRequest;
import gtel.com.java_spring.entities.TaiKhoan;
import gtel.com.java_spring.exception.ApplicationException;
import gtel.com.java_spring.repository.TaiKhoanRepo;
import gtel.com.java_spring.service.TaiKhoanService;
import gtel.com.java_spring.utils.ERROR_CODE;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    private static final Logger log = LoggerFactory.getLogger(TaiKhoanServiceImpl.class);

    @Autowired
    private TaiKhoanRepo taiKhoanRepo;

    @Override
    public List<TaiKhoan> findAll() {
        try {
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public TaiKhoan dangKyTaiKhoan(RegisterRequest request) {
            log.info("Dang ky tai khoan bang so dien thoai {} START", request.getSoDienThoai());
            /** Valid dau vao */
            boolean existsPhone = taiKhoanRepo.existsByTaiKhoan(request.getSoDienThoai());
            if (existsPhone) {
                throw new ApplicationException(ERROR_CODE.EXISTS_PHONE_NUMBER);
            }
            TaiKhoan taiKhoan = new TaiKhoan();
            taiKhoanRepo.save(taiKhoan);

            log.info("Dang ky tai khoan bang so dien thoai {} END", request.getSoDienThoai());
            return taiKhoan;
    }
}

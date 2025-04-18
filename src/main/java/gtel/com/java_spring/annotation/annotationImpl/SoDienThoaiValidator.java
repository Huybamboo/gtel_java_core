package gtel.com.java_spring.annotation.annotationImpl;

import gtel.com.java_spring.annotation.ValidSoDienThoai;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

public class SoDienThoaiValidator implements ConstraintValidator<ValidSoDienThoai, String> {
    private static final String SO_DIEN_THOAI_REGEX = "^(?:\\+84|0)[0-9]{9}$";
    @Override
    public void initialize(ValidSoDienThoai constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String soDienThoai, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(soDienThoai)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Không được để trống trường thông tin này!")
                    .addConstraintViolation();
            return false;
        }
        return soDienThoai != null && soDienThoai.matches(SO_DIEN_THOAI_REGEX);
    }
}

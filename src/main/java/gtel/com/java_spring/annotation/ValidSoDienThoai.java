package gtel.com.java_spring.annotation;

import gtel.com.java_spring.annotation.annotationImpl.SoDienThoaiValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SoDienThoaiValidator.class)
public @interface ValidSoDienThoai {
    String message() default "Phone Number must to start with +84 or 0";

    Class<?> [] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

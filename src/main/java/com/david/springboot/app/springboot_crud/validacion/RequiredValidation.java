package com.david.springboot.app.springboot_crud.validacion;

import org.springframework.util.StringUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RequiredValidation implements ConstraintValidator<IsRequired, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // return (value != null && !value.isEmpty() && !value.isBlank());
        return StringUtils.hasText(value);
    }

}

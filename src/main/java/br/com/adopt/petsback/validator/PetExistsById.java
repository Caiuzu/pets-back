package br.com.adopt.petsback.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PetExistByIdValidator.class)
public @interface PetExistsById {

    String message() default "pet com id ${validatedValue} não encontrado";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

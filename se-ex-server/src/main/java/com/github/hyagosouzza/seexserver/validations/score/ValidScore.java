package com.github.hyagosouzza.seexserver.validations.score;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = ScoreValidator.class)
@Documented
public @interface ValidScore {

	String message() default "Score deve ter o valor entre 0 e 1000";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}

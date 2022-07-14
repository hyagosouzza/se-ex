package com.github.hyagosouzza.seexserver.validations.score;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<ValidScore, Integer> {

	@Override
	public boolean isValid(Integer score, ConstraintValidatorContext constraintValidatorContext) {
		return score >= 0 && score <= 1000;
	}

}

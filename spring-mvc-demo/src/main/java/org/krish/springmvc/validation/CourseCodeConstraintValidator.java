package org.krish.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//Meaning validating CourseCode annotation on String field
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>
{
    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {

        this.coursePrefix = constraintAnnotation.value(); //Assigning the value which is configured
    }

    @Override
    /**
     * userInput : form data entered by user
     * constraintValidatorContext : we can place additional error messages here
     * Spring MVC will call this isValid
     */
    public boolean isValid(String userInput, ConstraintValidatorContext constraintValidatorContext) {

        boolean res = true;

        if(userInput != null)
        {
            res = userInput.startsWith(coursePrefix);
        }

        return res;
    }
}

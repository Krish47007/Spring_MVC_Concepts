package org.krish.springmvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) //Helper class containing business logic for validation
@Target( {ElementType.METHOD , ElementType.FIELD})             // can be applied on methods and fields
@Retention(value = RetentionPolicy.RUNTIME)                    // retain this in bytecode and also use it in runtime
public @interface CourseCode {

    //Defining default course code
    public String value() default "CS";

    //Defining default error-msg
    public String message() default "must start with CS";

    //Defining default grouping
    public Class<?>[] groups() default {};  //can have group related constants

    //Define default payloads
    public Class<? extends Payload>[] payload() default {}; //Provide custom details about validation failure
}

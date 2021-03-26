package org.krish.springmvc.model;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "can't be empty")
    @Size(min = 1,message = "is required")
    private String lastName;


    @NotNull(message = "can't be empty")    //Due to StringTrimmerEditor in initBind() if we give empty value or spaces it'll be trimmed to null and can be assigned to Integer( not int)
    @Min(value = 0,message = "must be greater than or equal to 0")
    @Max(value = 10,message = "must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[0-9]{6}",message = "must be a numeric code with 6 characters")
    private String pincode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

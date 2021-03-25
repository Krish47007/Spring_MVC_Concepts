package org.krish.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "can't be empty")
    @Size(min = 1,message = "is required")
    private String lastName;


    @Min(value = 0,message = "must be greater than or equal to 0")
    @Max(value = 10,message = "must be less than or equal to 10")
    private Integer freePasses;


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
}
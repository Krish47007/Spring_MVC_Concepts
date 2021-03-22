package org.krish.springmvc.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

    private String fName;
    private String lName;
    private String country;
    private String favProgrammingLang;

    private String[] operatingSystems;


  /*  private Map<String,String> countryOptions;

    public Student()
    {
        countryOptions = new LinkedHashMap<>(); //Because we've to maintain order

        //These list can be populated from database or any external source
        countryOptions.put("IND","INDIA");
        countryOptions.put("AUS","AUSTRALIA");
        countryOptions.put("US","UNITED STATES OF AMERICA");
        countryOptions.put("UK","UNITED KINGDOM");
    }*/

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavProgrammingLang() {
        return favProgrammingLang;
    }

    public void setFavProgrammingLang(String favProgrammingLang) {
        this.favProgrammingLang = favProgrammingLang;
    }

    /* public Map<String, String> getCountryOptions() {
        return countryOptions;
    }*/

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
import java.util.ArrayList;
public class CountryInfo {

    
    //private ArrayList<String> literacy;
    private String country;
    private String sex;
    private int year;
    private double literacy;
    
    public CountryInfo(String country, int year, String sex, double literacy ) {
        this.country = country;
        this.literacy = literacy; 
        this.setSex(sex);
        this.year = year;
    }

    public String getCountry() {
        return country;
    }
    
    public void setSex(String sex) {
        
//        if(sex.contains(" ")) {
//            String[]parts = this.sex.split(" ");
//            this.sex = parts[0];
//        }
        if (sex.contains("female")) {
            this.sex = "female";
        } else {
        this.sex = "male";
       } 
    }
    
    public String getSex() {
        return sex;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracy() {
        return literacy;
    }
 
//@Override
//    public int compareTo(CountryInfo countryInfo){
//        return this.getLiteracy() - countryInfo.literacy;
//    }
    
@Override
    public String toString(){
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacy;
    }
}

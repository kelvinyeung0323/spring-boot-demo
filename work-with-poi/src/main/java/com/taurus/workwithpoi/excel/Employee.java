package com.taurus.workwithpoi.excel;

/**
 * Created by Kelvin Yeung on 2018/8/28.
 */
public class Employee {
    private String name;
    private Double salary;
    private String code;


    public Employee(){}
    public Employee(String name,String code,Double salary){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

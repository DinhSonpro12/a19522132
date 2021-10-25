package com.google.a19522132;

public class EmployeePartTime extends Employee{

    EmployeePartTime (String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String ToString() {
        return super.ToString() + "PartTime = " +String.valueOf(tinhluong());
    }
}

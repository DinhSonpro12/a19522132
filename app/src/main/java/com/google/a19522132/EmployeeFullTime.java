package com.google.a19522132;

public class EmployeeFullTime extends Employee{

    EmployeeFullTime (String manv,String tennv)
    {
        this.id = manv;
        this.name = tennv;
    }
    @Override
    public int tinhluong() {
        return super.tinhluong() + 350;
    }

    @Override
    public String ToString() {
        return  super.ToString() + "FullTime= " + String.valueOf(tinhluong());
    }
}

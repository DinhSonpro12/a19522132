package com.google.a19522132;

public class Employee {
    protected String id;
    protected String name;
    protected boolean isManager;
    Employee(String id, String name)
    {
        this.id = id;
        this.name = name;
        this.isManager = false;
    }
    Employee()
    {

    }

    String getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    public void setIsManager(boolean x)
    {
        isManager  = x;
    }
    public int tinhluong()
    {
        return 150;
    }
    public String ToString()
    {
        return id+ " - " + name + " --> ";
    }

    public  boolean isManager()
    {
        return isManager;
    }
}



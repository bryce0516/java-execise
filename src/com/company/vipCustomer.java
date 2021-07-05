package com.company;

public class vipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public vipCustomer(){
        this("default Name", 0.00, "default email");
        System.out.println("this is empty construtor");
    }
    public vipCustomer(double creditLimit,String email){
        this("unknwon name", creditLimit, email);
    }
    public vipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}

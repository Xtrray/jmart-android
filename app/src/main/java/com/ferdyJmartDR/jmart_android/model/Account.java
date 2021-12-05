package com.ferdyJmartDR.jmart_android.model;
/**
 * @author Mochamad Ferdy Fauzan
 * @version 05-12-2021
 */
public class Account extends Serializable{
    public double balance;
    public String email;
    public String name;
    public String password;
    public Store store;

    public Account(String name, String email, String password, double balance){
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }
}
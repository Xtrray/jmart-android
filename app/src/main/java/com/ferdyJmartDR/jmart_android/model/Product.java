package com.ferdyJmartDR.jmart_android.model;
/**
 * @author Mochamad Ferdy Fauzan
 * @version 05-12-2021
 */
public class Product {
    public int accountId;
    public ProductCategory category;
    public boolean conditionUsed;
    public double discount;
    public String name;
    public double price;
    public byte shipmentPlans;
    public int weight;

    @Override
    public String toString(){
        return name;
    }
}

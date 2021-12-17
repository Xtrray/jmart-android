package com.ferdyJmartDR.jmart_android.model;

/**
 * @author Mochamad Ferdy Fauzan
 * @version 17-12-2021
 */

public class Shipment {
    public String address;
    public int cost;
    public byte plan;
    public String receipt;
    //    static class Plan
//    {
//        public final byte bit;
//        private Plan(byte bit)
//        {
//            this.bit = bit;
//        }
//    }
    //constructor
    public Shipment(String address, int cost, byte plan, String receipt){
        this.address = address;
        this.cost = cost;
        this.plan = plan;
        this.receipt = receipt;
    }
}

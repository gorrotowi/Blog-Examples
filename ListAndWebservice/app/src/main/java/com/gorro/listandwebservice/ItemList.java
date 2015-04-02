package com.gorro.listandwebservice;

/**
 * Created by gorro on 02/04/15.
 */
public class ItemList {

    String Name, Address;

    public ItemList(String name, String address) {
        Name = name;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

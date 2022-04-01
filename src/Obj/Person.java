/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obj;

import java.util.List;

/**
 *
 * @author Admin
 */
abstract public class Person {
    private int id;
    private String Name_23, Address_23, PhoneNo_23, Password_23;
    static int currId = 0;
    public Person(int id, String Name_23, String Address_23, String PhoneNo_23, String password_23) {
        currId++;
        if(id == 0) // if id is not set already from the database
        {
                    this.id = currId;
        }
        else
        {
                    this.id = id;      
        }
        this.Name_23 = Name_23;
        this.Address_23 = Address_23;
        this.PhoneNo_23 = PhoneNo_23;
        this.Password_23 = password_23;
    }
    
    public void printInfo()
    {
        System.out.println("Personal Details: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + Name_23);
        System.out.println("Phone No: " + PhoneNo_23);
        System.out.println("Address: " + Address_23);
    }

        /////////////////////////// GETTERS & SETTERS /////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name_23;
    }

    public void setName(String Address_23) {
        this.Name_23 = Address_23;
    }

    public String getAddress() {
        return Address_23;
    }

    public void setAddress(String Address_23) {
        this.Address_23 = Address_23;
    }

    public String getPhoneNo() {
        return PhoneNo_23;
    }

    public void setPhoneNo(String PhoneNo_23) {
        this.PhoneNo_23 = PhoneNo_23;
    }

    public String getPassword() {
        return Password_23;
    }

    public void setPassword(String Password_23) {
        this.Password_23 = Password_23;
    }
    
}

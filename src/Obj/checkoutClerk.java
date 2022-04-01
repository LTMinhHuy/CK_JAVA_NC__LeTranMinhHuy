/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obj;

/**
 *
 * @author Admin
 */
public class checkoutClerk extends Members {

    public checkoutClerk(float memberSalary_23, int id_23, String Name_23, String Address_23, String PhoneNo_23, String password_23) {
        super(memberSalary_23, id_23, Name_23, Address_23, PhoneNo_23, password_23);
    }
    
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("ID of Checkout Clerk is: " + super.getId() );         
    }
    
}

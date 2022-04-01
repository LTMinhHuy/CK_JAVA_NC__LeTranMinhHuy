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
public class Members extends Person{
    private double memberSalary_23;

    public Members(float memberSalary_23, int id_23, String Name_23, String Address_23, String PhoneNo_23, String password_23) {
        super(id_23, Name_23, Address_23, PhoneNo_23, password_23);
        this.memberSalary_23 = memberSalary_23;
    }
//////////////////////////// GETTER ///////////////////////////////
    public double getMemberSalary() {
        return memberSalary_23;
    }
///////////////////////////////////////////////////////////////////////////////
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Salary of the Member: " + memberSalary_23);
    }
}

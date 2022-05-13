/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySV;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Persoon {
 
    private String nameString;
    private String genderString;
    private String birthdayString;
    private String addressString;

    public Persoon() {
    }

    public Persoon(String nameString, String genderString, String birthdayString, String addressString) {
        this.nameString = nameString;
        this.genderString = genderString;
        this.birthdayString = birthdayString;
        this.addressString = addressString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getGenderString() {
        return genderString;
    }

    public void setGenderString(String genderString) {
        this.genderString = genderString;
    }

    public String getBirthdayString() {
        return birthdayString;
    }

    public void setBirthdayString(String birthdayString) {
        this.birthdayString = birthdayString;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }
    
    public void input(){
    Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten : ");
        nameString = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        genderString = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        birthdayString =sc.nextLine();
        System.out.println("Nhap dia chir: ");
        addressString = sc.nextLine();
    }
    
    public void display(){
        System.out.println("Ten: " + nameString + ". Gioi tinh: "+ genderString+ ". Ngay Sinh: "+ birthdayString + ".Dia chi: "+addressString);
        
    }
    
    
}

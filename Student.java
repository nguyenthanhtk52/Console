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
public class Student extends Persoon {

    private String maSV;
    private float gpa_mark;
    private String email;

    public Student() {
    }

    public Student(String maSV, float gpa_mark, String email) {
        this.maSV = maSV;
        this.gpa_mark = gpa_mark;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public boolean setMaSV(String maSV) {
        if (maSV != null && maSV.length() == 8) {
            this.maSV = maSV;
            return true;
        } else {
            System.err.println("Nhap lai ma sinh vien: ");
            return false;
        }
    }

    public float getGpa_mark() {
        return gpa_mark;
    }

    public boolean setGpa_mark(float gpa_mark) {
        if(gpa_mark >=0 && gpa_mark <=10){
        this.gpa_mark = gpa_mark;
        return true;
        }else{
            System.err.println("Nhap sai diem :(diem >=0 va diem <=10)");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email !=null && email.contains("@") && email.contains(" ")){
        this.email = email;
        return true;
        }else{
            System.err.println("Nhap dung dinh dang emal");
        return false;
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        while (true) {            
            String maSVInput = sc.nextLine();
            boolean check = setMaSV(maSVInput);
            if(check){
            break;
            }
        }
        //code ngan gon 
       // while(!setGpa_mark(sc.nextFloat()));
        System.out.println("Nhap diem sinh vien: ");
         while (true) {            
            float gpamarkInput = Float.parseFloat(sc.nextLine());
            boolean check = setGpa_mark(gpamarkInput);
            if(check){
            break;
            }
        }
        System.out.println("Nhap dia chi email: ");
        while(true){
            String emailInput = sc.nextLine();
            boolean check = setEmail(emailInput);
            if(check){break;}
        }
    }
    public boolean checkHocBong(){
        if(gpa_mark >= 8){
                 return true;
        }else{
        return false;
        }
    }

    @Override
    public void display() {
        super.display(); 
        System.out.print("MaSV" + maSV + " Diem trung binh: "+ gpa_mark+" Email: " + email);
        System.err.println("");
    }
    

}

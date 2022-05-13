/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Author {
    private String name_author;
    private String nick_name;
    private String birthday;
    private String address;
    private int age ;

    public Author() {
    }
    public Author(String nick_nam){
    this.nick_name=nick_name;
    }
    public Author(String name_author, String nick_name, String birthday, String address, int age) {
        this.name_author = name_author;
        this.nick_name = nick_name;
        this.birthday = birthday;
        this.address = address;
        this.age = age;
    }

    public String getName_author() {
        return name_author;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    
    public void Input(){
    Scanner input = new Scanner(System.in);
    
        System.out.println("Nhap vao ten tac gia: ");
        name_author = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
        System.out.println(" Nhap ngay sinh: ");
        birthday = input.nextLine();
    }
    public void Input(ArrayList<Author> authorList){
    Scanner input = new Scanner(System.in);
    Input();
        System.out.println("Nhap but danh");
        while (true) {            
         nick_name = input.nextLine();
         boolean check = false;
         for(int i = 0; i< authorList.size(); i++){
         if(authorList.get(i).getNick_name().equalsIgnoreCase(nick_name)){
         check = true;
         break;
         }
         }
         if(!check){
             break;
         }else{
             System.err.println("Nhap but danh khac: ");
         }
        }
        
      
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" + "name_author=" + name_author + ", nick_name=" + nick_name + ", birthday=" + birthday + ", address=" + address + ", age=" + age + '}';
    }
   
}

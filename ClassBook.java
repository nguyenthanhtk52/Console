/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ClassBook {
    private String book_name;
    private String created_at;
    private String nick_name;

    public ClassBook() {
    }

    public ClassBook(String book_name, String created_at, String nick_name) {
        this.book_name = book_name;
        this.created_at = created_at;
        this.nick_name = nick_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }
    
    public void InputBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        book_name =input.nextLine();
        System.out.println("Nhap ngay xuar ban: ");
        created_at= input.nextLine();
        System.out.println("Nhap but danh: ");
        nick_name = input.nextLine();
        
    }
    public void DisplayBook(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "ClassBook{" + "book_name=" + book_name + ", created_at=" + created_at + ", nick_name=" + nick_name + '}';
    }
    
}

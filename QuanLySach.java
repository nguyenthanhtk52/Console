/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chon , n;
        ArrayList<Author> authorList= new ArrayList<>();
        ArrayList<ClassBook> classbookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    
        do{
          showMenu();
          chon = Integer.parseInt(sc.nextLine());
        switch(chon){
        case 1:
            System.out.println("Nhap suong sach can them: ");
            n = Integer.parseInt(sc.nextLine());
            for(int i = 0 ; i< classbookList.size(); i++){
                ClassBook classBook = new  ClassBook();
                classBook.InputBook();
                boolean checkin =false;
                for(int j= 0; j< authorList.size();j++){
                if(authorList.get(j).getNick_name().equalsIgnoreCase(classBook.getNick_name())){
                checkin = true;
                break;
                }
                }
                if(!checkin){
                    Author author2 = new Author();
                    author2.Input(authorList);
                }
                classbookList.add(classBook);
            }
        break;
        case 2:
            for(ClassBook book: classbookList){
               book.DisplayBook();
            }
        break;
        case 3:
            System.out.println("Nhap so tac gia can them: ");
            n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++){
                Author author = new Author();
                author.Input(authorList);
                authorList.add(author);
            }
        break;
        case 4:
            System.out.println("Nhap but danh can tim kiem: ");
            String nickname = sc.nextLine();
            for(ClassBook book:classbookList){
                if(book.getNick_name().equalsIgnoreCase(nickname)){
                book.DisplayBook();
                }
            }
        break;
        case 5:
            System.out.println("Goodbye !");
        break;
        default:
            System.err.println("Ban nhap sai : "); 
            break;
            }
        }while (chon !=5);
        
       
    }
    static  void showMenu(){
        System.out.println("1.Nhap thong tin sach : ");
        System.out.println("2.Hien thi thong tin sach:");
        System.out.println("3.Nhap thong tin tac gia: ");
        System.out.println("4.Tim kiem sach theo but danh: ");
        System.out.println("5.Goodbey !!");
    }
    
}

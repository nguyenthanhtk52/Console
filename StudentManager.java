/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySV;

/**
 *
 * @author ADMIN
 */
import java.util.*;

public class StudentManager {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean fag = true;

        int chose;
        do {
            showMenu();
            System.out.println("CHon Menu : ");
            chose = Integer.parseInt(sc.nextLine());
            switch (chose) {
                case 1:
                    int n;
                    System.out.println("Nhap so sinh vien can them");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.input();

                        studentList.add(student);
                    }
                    break;
                case 2:
                    for (Student student : studentList) {
                        student.display();
                    }
                    break;
                case 3:
                    int minIdex = 0,
                     maxIndex = 0;

                    float minApg,
                     maxApg;

                    minApg = studentList.get(0).getGpa_mark();
                    maxApg = studentList.get(0).getGpa_mark();

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getGpa_mark() < minApg) {
                            minIdex = i;
                            minApg = studentList.get(i).getGpa_mark();
                        }
                        if (studentList.get(i).getGpa_mark() > maxApg) {
                            maxIndex = i;
                            maxApg = studentList.get(i).getGpa_mark();
                        }
                    }
                    System.out.println("Sinh vien co diem trung binh cao nhat");
                    studentList.get(maxIndex).display();
                    System.out.println("Sinh vien co diem trung binh thap nhat: ");
                    studentList.get(minIdex).display();
                    break;
                case 4:
                    int count = 0;
                    System.out.println("Nhap ma sinh vien can tim kiem: ");
                    String tim_kiemString = sc.nextLine();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getMaSV().equalsIgnoreCase(tim_kiemString)) {
                            studentList.get(i).display();
                            count++;
                        }
                        if (count == 0) {
                            System.out.println("Khong tim thay sinh vien: ");
                        }
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getNameString().compareTo(o2.getNameString());
                            if (cmp >= 0) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }

                    });
                    for (Student student : studentList) {
                        student.display();
                    }

                    break;
                case 6:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getGpa_mark() >= o2.getGpa_mark() ? -1 : 1;
                        }

                    });
                    for (Student student : studentList) {
                        if (student.checkHocBong()) {
                            student.display();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.err.println("Chon khong chinh xac");
                    break;
            }
            if (chose == 7) {
                fag = false;
            }
        } while (fag == true);

    }

    public static void showMenu() {
        System.out.println("1.Nhap vao N sinh vien:");
        System.out.println("2.Thong tin sinh vien: ");
        System.out.println("3.Hien thi max min theo diem trung binh: ");
        System.out.println("4.Tim kiem sinh ien theo masinh vien: ");
        System.out.println("5.Hien thithong tin sinh vien theo thu tu A ->Z");
        System.out.println("6.Hien thi thong tin sinh vien duoc hoc bong va sap xep diem giam dan ");
    }
}

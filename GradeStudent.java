
import java.util.Scanner;

public class GradeStudent {

	// Một số chỗ em comment khi em chạy cmd nó báo lỗi không chạy được.
	// Nên em viết mấy chỗ comment bằng tiếng việt không dấu.

    public static int weight_mid = 0;
    public static int weight_final = 0;
    public static int weight_homework = 0;

    public static void main(String[] args) {

        begin();
        
        double mid_term = midTerm();
        double final_term = finalTerm();
        double home_work = (double) Math.round(homeWork() * 10) / 10;

        report(mid_term, final_term, home_work);
    }

    // Thong diep chao mung
    public static void begin() {
        String s1 = "This program reads exam/homework scores";
        String s2 = "an reports yuor overall course grade .";
        System.out.println(s1 + "\n" + s2 + "\n");
    }

    //Nhap va tinh toan diem thi 
    public static int nhap() {

        Scanner scr = new Scanner(System.in);
        boolean check = false;
        int totalPoint; // tổng điểm đạt được khi được tăng
        int scoreh = 0; //điểm thi thực tế
        int chon = 0;
        int scoress = 0; //điểm được tăng
        double weight_score = 0d;

        while (!check) {

            try {
                System.out.print("Score earned :");
                scoreh = scr.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap lai :");
                scr.nextLine();
            }
        }
        // Chonde co them diem hay khong
        System.out.print("Were scores shift (1 = yes , 2 = no):");
        chon = scr.nextInt();
        if (chon == 1) {
            System.out.print("Shift amount: ");
            scoress = scr.nextInt();
        }
        // Set ve 100 khi tong diem duoc cong them lon hon 100
        totalPoint = scoreh + scoress;
        if (totalPoint > 100) {
            totalPoint = 100;
        }
        System.out.println("Total points : " + totalPoint + " /" + " 100");
        return totalPoint;
    }

    // Diem giua ky
    public static double midTerm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mid Term : ");
        double mid_term; //điểm midTerm
        System.out.print("Weight (0 -- > 100) :");
        weight_mid = sc.nextInt();

        // Kiem tra dieu kien cho nhap
        while (weight_mid < 0 && weight_mid > 100) {
             System.out.print("Please again weight : ");
            weight_mid = sc.nextInt();
        }
        int total_point = 0;
        // gan gia tri bien
        total_point = nhap();
        // Tinh va in ra diem
        mid_term = (double) total_point * (double) weight_mid / 100;
        System.out.println("Weight score : " + mid_term + " / " + weight_mid + "\n");
        return mid_term;
    }

    // Nhap va tinh toan diem thi cuoi ky
    public static double finalTerm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Final : ");
        System.out.print("Weight (0 -- > 100): ");
        weight_final = sc.nextInt();

        // Kiem tra dieu kien cho nhap

        while (weight_mid + weight_final >= 100) {
            System.out.print("Please again weight : ");
            weight_final = sc.nextInt();
        }
        double final_term = 0;
        int total_point = nhap();
        // Tinh diem va in ra 
        final_term = (double) total_point * (double) weight_final / 100;
        System.out.println("Weight score :" + final_term + " / " + weight_final + "\n");
        return final_term;
    }

    // Nhap va tinh toan diem bai tap ve nha
    public static double homeWork() {

        Scanner scr = new Scanner(System.in);

        int n = 0; //Số assiment
        int diem_danh = 0; // ngày điểm danh
        int score_dd = 0; // điểm điểm danh
        int score_he_so = 0; // Tong diem he so toi da
        int score_tong_diem = 0; // tổng điểm sv đạt được
        double home_work = 0;

        System.out.println("Homework : ");
        System.out.print("Weight (0 --> 100) : ");
        weight_homework = scr.nextInt();
	// Kiem tra dieu kien nhap dung
        while (weight_mid + weight_final + weight_homework != 100) {
            System.out.print("Please again weight : ");
            weight_homework = scr.nextInt();
        }
        System.out.print("Number of assiments : ");
        n = scr.nextInt();
        int[][] arr = new int[n][2];
        // Nhap diem SV dat duoc và diem toi da cua moi assiments
        for (int i = 0; i < n; i++) {
            System.out.print("Assiments " + (i + 1) + " score and max : ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scr.nextInt();
            }
        }
        // Diem diem danh
        System.out.print("How many sections did you attend : ");
        diem_danh = scr.nextInt();
        score_dd = diem_danh * 5;
        if (score_dd > 30) {
            score_dd = 30;
        }
        System.out.println("Sections points : " + score_dd + " / 30");
        // Tong diem SV dat duoc
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i][0];
        }
        score_tong_diem = sum + score_dd;
        int sum2 = 0;
        // Tong he so diem
        for (int j = 0; j < n; j++) {
            sum2 += arr[j][1];
        }
        score_he_so = sum2 + 30;
        // Set ve 150 khi he so lon hon 150
        if (score_he_so > 150) {
            score_he_so = 150;
        }
        System.out.println("Total points : " + score_tong_diem + " / " + score_he_so);
        home_work = (double) score_tong_diem * (double) weight_homework / (double) score_he_so;
        System.out.println("Weighted score :" + (double) Math.round(home_work * 10) / 10 + " / " + weight_homework + "\n");
        return home_work;

    }

    // Tinh diem trung binh va dua ra thong bao
    public static void report(double mid_term, double final_term, double home_work) {

        double tong_ket = mid_term + final_term + home_work;

        System.out.println("Overall percentage : " + tong_ket);
        if (tong_ket >= 85.0) {
            System.out.println("Your grade will be at least : 3.0");
        }
        if (tong_ket >= 75.0 && tong_ket < 85.0) {
            System.out.println("Your grade will be at least : 2.0");
        }
        if (tong_ket >= 65.0 && tong_ket < 75.0) {
            System.out.println("Your grade will be at least : 1.0");
        }
        if (tong_ket < 65.0) {
            System.out.println("Your grade will be at least : 0.0");
        }

        System.out.println("<<Your custom greade message here >>");
    }

}

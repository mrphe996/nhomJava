package Lab3_bai2;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        int n=0;
        StudentUneti[] std=null;
        StudentMark[] stdmark = null;
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("1 Nhap thong tin n sinh vien uneti");
            System.out.println("2 Nhap m diem cho cac sinh vien nay");
            System.out.println("3 sap xep sinh vien theo ten va hien thi ");
            System.out.println("4 Tim thong tin diem cua sinh vien theo id");
            System.out.println("Nhap vao lua chon cua ban");
            n=Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    int m;
                    System.out.println("nhap vao so sinh vien :");
                    m=Integer.parseInt(sc.nextLine());
                    std=new StudentUneti[m];
                    for (int i = 0; i < m; i++) {
                        std[i]=new StudentUneti();
                        int dem=0;
                        do {
                            System.out.println("Nhap vao thong tin sinh vien thu "+(i+1));
                            std[i].input();
                            dem=0;
                            for (int j = 0; j < i; j++) {
                                if(std[i].getStuId().equals(std[j].getStuId())&&std!=null) {
                                    System.out.println("ma id trung vui long nhap lai");
                                    dem++;
                                }
                            }
                        }while(dem!=0);
                    }
                    break;
                case 2:
                    if(std!=null) {
                        int k;
                        System.out.println("nhap vao so sinh vien :");
                        k=Integer.parseInt(sc.nextLine());
                        stdmark=new StudentMark[k];
                        for (int i = 0; i < stdmark.length; i++) {
                            stdmark[i]=new StudentMark();
                            int dem=0;
                            do {
                                System.out.println("Nhap vao thong tin mon hoc thu "+(i+1));
                                stdmark[i].input();
                                dem=0;
                                for (int j = 0; j < std.length; j++) {
                                    if(stdmark[i].getStuID().equals(std[j].getStuId())==false)
                                        System.out.println("ma id sinh vien chua co vui long nhap lai");
                                    dem++;
                                }
                            }
                        }while(dem!=0);
                    }
            }

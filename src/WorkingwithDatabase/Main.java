package WorkingwithDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static List<Product> dataList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());

            switch(choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    saveFile();
                    break;
                case 4:
                    readFile();
                    break;
                case 5:
                    readAPI();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
        } while(choose != 6);
    }

    private static void readAPI() {
    }

    private static void readFile() {
        
    }

    private static void saveFile() {
        
    }

    private static void display() {
        
    }

    private static void input() {
    }

    static void showMenu(){
        System.out.println("1.Product Infomation");
        System.out.println("2.Show product infomation");
        System.out.println("3.Save file (Json)");
        System.out.println("4.Read file(Json)");
        System.out.println("5.API(fAKE)");
        System.out.println("Exit");


    }
}


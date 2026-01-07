package WorkingwithDatabase;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
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
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Please type again, wrong input!!!");
                    break;
            }
        } while(choose != 6);
    }

    private static void readAPI() {
    }

    private static void readFile() {
        FileReader reader = null;
        try {
            File file = new File("product.json");
            reader = new FileReader(file);
            Gson gson = new Gson();
            Type type = new TypeToken<List<Product>>(){}.getType();
            dataList = gson.fromJson(reader, type);

            display();
        } catch (FileNotFoundException ex) {
            throw  new RuntimeException(ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                throw  new RuntimeException(ex);
            }
        }
    }
        




    private static void display() {
        System.out.println("=== Product Information ===");
        dataList.forEach((product) -> {
            System.out.println(product);
        });
        
    }

    private static void input() {
        System.out.println("Add the number of product needed (N): ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.input();
            dataList.add(product);
        }
    }
    private static void saveFile() {
        Gson gson = new Gson();

        String json = gson.toJson(dataList);
        System.out.println("JSON: " + json);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("product.json");
            byte[] data = null;
            try {
                data = json.getBytes("utf8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }

            try {
                fileOutputStream.write(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

    static void showMenu(){
        System.out.println("1.Product Infomation");
        System.out.println("2.Show product infomation");
        System.out.println("3.Save file (Json)");
        System.out.println("4.Read file(Json)");
        System.out.println("5. Exit");


    }
}


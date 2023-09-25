package Seminar6home;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Laptop {
    static ArrayList<Product> laptopList = new ArrayList<>();
    public static void main(String[] args) {
        // ArrayList<Product> laptopList = new ArrayList<>();
        Product lap001 = new Product(Brand.Lenovo, Color.Белый, Processor.AMD_Ryzen_9);
        laptopList.add(lap001);
        Product lap002 = new Product(Brand.Lenovo, Color.Серый, Processor.AMD_Ryzen_9);
        laptopList.add(lap002);
        Product lap003 = new Product(Brand.Lenovo, Color.Черный, Processor.Intel_Corel_i7);
        laptopList.add(lap003);
        Product lap004 = new Product(Brand.Asus, Color.Серый, Processor.AMD_Ryzen_7);
        laptopList.add(lap004);
        Product lap005 = new Product(Brand.Asus, Color.Черный, Processor.Intel_Corel_i7);
        laptopList.add(lap005);
        Product lap006 = new Product(Brand.Techno, Color.Серый, Processor.Intel_Corel_i7);
        laptopList.add(lap006);
        Product lap007 = new Product(Brand.Techno, Color.Черный, Processor.AMD_Ryzen_9);
        laptopList.add(lap007);
        Product lap008 = new Product(Brand.Honor, Color.Серый, Processor.AMD_Ryzen_9);
        laptopList.add(lap008);
        Product lap010 = new Product(Brand.Honor, Color.Черный, Processor.Intel_Corel_i7);
        laptopList.add(lap010);        
        System.out.println();
        System.out.println("            СПИСОК ДОСТУПНЫХ НОУТБУКОВ:");
        for (int i = 0; i < laptopList.size(); i++) {
            System.out.println(laptopList.get(i).displeiInfoProduct());
        }
        System.out.println();
        searchParametrs();
    }

    public static void searchParametrs() {
        System.out.println("             ОТБОР ПО ХАРАКТЕРИСТИКАМ:");
        System.out.println("Если хотите отобрать ноутбуки по производителю - введите 1");
        System.out.println("Если хотите отобрать ноутбуки по цвету - введите 2");
        System.out.println("Если хотите отобрать ноутбуки по процессору - введите 3");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите по какому параметру отобрать ноутбуки: ");
        Integer searchParametr = scanner.nextInt();
        if (searchParametr == 1) {
            System.out.println("Производители ноутбуков: ");
            Map<Integer, Brand> searchBrand = new LinkedHashMap<>();
            searchBrand.put(1, Brand.Apple);
            searchBrand.put(2, Brand.Asus);
            searchBrand.put(3, Brand.Honor);
            searchBrand.put(4, Brand.Lenovo);
            searchBrand.put(5, Brand.MSI);
            searchBrand.put(6, Brand.Techno);
            for (int i = 1; i <= searchBrand.size(); i ++) {
                System.out.printf("%s - " + searchBrand.get(i) + " \n", i);
            }
            System.out.println();
            System.out.print("Введите цифру производителя: ");
            Integer searchBrand2 = scanner.nextInt();
            System.out.println();
            System.out.print("Вы выбрали: ");
            System.out.println(searchBrand.get(searchBrand2));
            Integer n = 0;
            for (int i = 0; i < laptopList.size(); i++) {
                    if (laptopList.get(i).brand == searchBrand.get(searchBrand2)){
                    // System.out.println(laptopList.get(i).displeiInfoProduct());
                    n ++;
                }
            }
            if (n == 0) {
                System.out.printf("Извините ноутбуки производства %s закончились.", searchBrand.get(searchBrand2));
                System.out.println();
            } else {
                System.out.printf("Ноутбуки производсва %s:\n", searchBrand.get(searchBrand2));
                for (int j = 0; j < laptopList.size(); j++) {
                    if (laptopList.get(j).brand == searchBrand.get(searchBrand2)) {
                        System.out.println(laptopList.get(j).displeiInfoProduct());
                    }
                }
            }
            scanner.close();
        }
        if (searchParametr == 2) {
            // System.out.println();
            System.out.println("Цвета ноутбуков: ");
            Map<Integer, Color> searchColor = new LinkedHashMap<>();
            searchColor.put(1, Color.Черный);
            searchColor.put(2, Color.Белый);
            searchColor.put(3, Color.Серый);
            searchColor.put(4, Color.Красный);
            for (int i = 1; i <= searchColor.size(); i ++) {
                System.out.printf("%s - " + searchColor.get(i) + " \n", i);
            }
            System.out.println();
            System.out.print("Введите цифру цвета: ");
            Integer searchColor2 = scanner.nextInt();
            System.out.print("Вы выбрали цвет: ");
            System.out.println(searchColor.get(searchColor2));
            System.out.println();
            Integer n2 = 0;
            for (int i = 0; i < laptopList.size(); i++) {
                if (laptopList.get(i).color == searchColor.get(searchColor2)) {
                    // System.out.println(laptopList.get(i).displeiInfoProduct());
                    n2 ++;
                }
            }
            if (n2 == 0) {
                System.out.printf("Извините ноутбуки цвета %s отсутствуют.", searchColor.get(searchColor2));
            } else {
                System.out.printf("Ноутбуки в наличии цвета %s: \n", searchColor.get(searchColor2));
                for (int i = 0; i < laptopList.size(); i++) {
                    if (laptopList.get(i).color == searchColor.get(searchColor2)) {
                        System.out.println(laptopList.get(i).displeiInfoProduct());
                    }
                }
            }
            scanner.close();
        }

        if (searchParametr == 3) {
            System.out.println();
            System.out.println("Процессоры ноутбуков: ");
            Map<Integer, Processor> searchProcessor = new LinkedHashMap<>();
            searchProcessor.put(1, Processor.AMD_Ryzen_5);
            searchProcessor.put(2, Processor.AMD_Ryzen_7);
            searchProcessor.put(3, Processor.AMD_Ryzen_9);
            searchProcessor.put(4, Processor.Intel_Corel_i7);
            searchProcessor.put(5, Processor.Intel_Corel_i9);
            for (int i = 1; i <= searchProcessor.size(); i ++) {
                System.out.printf("%s - " + searchProcessor.get(i) + " \n", i);
            }
            System.out.print("Введите цифру необходимого процессора: ");
            Integer searchProcessor2 = scanner.nextInt();
            System.out.println();
            System.out.print("Вы выбрали процессор: ");
            System.out.println(searchProcessor.get(searchProcessor2));
            System.out.println();
            Integer n3 = 0;
            for (int i = 0; i < laptopList.size(); i++) {
                if (laptopList.get(i).processor == searchProcessor.get(searchProcessor2)) {
                    n3 ++;
                }
            }
            if (n3 == 0) {
                System.out.printf("Извините ноутбуки с процессором %s отсутствуют.", searchProcessor.get(searchProcessor2));
            } else {
                System.out.printf("Ноутбуки с процессором %s в наличии: \n", searchProcessor.get(searchProcessor2));
                for (int i = 0; i < laptopList.size(); i++) {
                    if (laptopList.get(i).processor == searchProcessor.get(searchProcessor2)) {
                        System.out.println(laptopList.get(i).displeiInfoProduct());
                    }
                }
            }
            scanner.close();
        }        
    }
}

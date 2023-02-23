// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java. Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.

// NoteBook notebook* = new NoteBook
// Например: Введите цифру, соответствующую необходимому критерию:	
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
// фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// приветствие 
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package homework_6;

import java.util.*;

public class magazine {
    public static void main(String[] args) {
      
        Notebooks note1 = new Notebooks("Samsung", "Black",
                "WIN10", 32, 1024, 90000);
        Notebooks note2 = new Notebooks("Apple", "White",
                "MACOS", 16, 512, 120000);
        Notebooks note3 = new Notebooks("Hiper", "Silver",
                "WIN10", 32, 2048, 80000);
        Notebooks note4 = new Notebooks("Hiper", "Black",
                "WIN11", 16, 1024, 85000);
        Notebooks note5 = new Notebooks("Asus", "Silver",
                "WIN11", 32, 512, 110000);

        Map<Integer, Notebooks> noteDataBase = new HashMap<>();
        noteDataBase.put(1, note1);
        noteDataBase.put(2, note2);
        noteDataBase.put(3, note3);
        noteDataBase.put(4, note4);
        noteDataBase.put(5, note5);

        System.out.println("Поиск ноутбука по критерию");
        System.out.println("Введите пункт, соответствующий критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        magazine.choose((HashMap<Integer, Notebooks>) noteDataBase);
    }

    public static void choose(HashMap<Integer, Notebooks> noteDataBase) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        switch (count) {
            case (1): {
                Set<Integer> choice = new TreeSet<>();
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    choice.add(current.getRam());
                }
                System.out.println("В наличии ноутбуки с ОЗУ: ");
                System.out.println(choice);
                System.out.println("Выберите обьем ОЗУ: ");
                Integer count1 = scan.nextInt();
                Boolean flag = false;
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    if (count1.equals(current.getRam())) {
                        printNote(current);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков с таким объемом ОЗУ нет");
                }
                break;
            }
            case (2): {
                Set<Integer> choice = new TreeSet<>();
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    choice.add(current.getHdd());
                }
                System.out.println("В наличии ноутбуки с HDD: ");
                System.out.println(choice);
                System.out.println("Выберите обьём HDD: ");
                Integer count1 = scan.nextInt();
                Boolean flag = false;
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    if (count1.equals(current.getHdd())) {
                        printNote(current);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков с таким объемом HDD нет");
                }
                break;
            }
            case (3): {
                Set<String> choice = new TreeSet<>();
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    choice.add(current.getOS());
                }
                System.out.println("В наличии ноутбуки с ОС: ");
                System.out.println(choice);
                System.out.println("Выберите ОС: ");
                String count1 = scan.next();
                Boolean flag = false;
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    if (count1.equals(current.getOS())) {
                        printNote(current);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков с такой ОС нет");
                }
                break;
            }
            case (4): {
                Set<String> choice = new TreeSet<>();
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    choice.add(current.getColour());
                }
                System.out.println("В наличии ноутбуки цвета: ");
                System.out.println(choice);
                System.out.println("Выберите цвет: ");
                String count1 = scan.next();
                Boolean flag = false;
                for (int i = 1; i <= noteDataBase.size(); i++) {
                    Notebooks current = (Notebooks) noteDataBase.get(i);
                    if (count1.equals(current.getColour())) {
                        printNote(current);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков такого цвета нет");
                }
                break;

            }
        }
        scan.close();
    }

    public static void printNote(Notebooks current) {
        System.out.printf("название %s, цвет %s, ОС: %s, ОЗУ %d, HDD %d, цена: %d \n",
                current.getProduct(), current.getColour(), current.getOS(),
                current.getRam(), current.getHdd(), current.getPrice());
    }
}

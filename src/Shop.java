//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий фильтрации
// и выведет ноутбуки, отвечающие фильтру.

import java.util.*;
import java.util.Map.Entry;

public class Shop {
    public static void main(String[] args) {
        NoteBook note1 = new NoteBook("ACB", "Черный", "Acer");
        note1.setRAM(8);
        note1.setHDD(700);
        note1.setOS("Windows");
        note1.setColor("black");
        note1.setBrand("Acer");

        NoteBook note2 = new NoteBook("Tong", "Серебро", "Apple");
        note2.setRAM(16);
        note2.setHDD(1000);
        note2.setOS("Linux");
        note2.setColor("silver");
        note2.setBrand("Apple");

        NoteBook note3 = new NoteBook("Game", "Белый", "HP");
        note3.setRAM(8);
        note3.setHDD(900);
        note3.setOS("Windows");
        note3.setColor("white");
        note3.setBrand("HP");

        NoteBook note4 = new NoteBook("Speed", "Розовый", "Samsung");
        note4.setRAM(16);
        note4.setHDD(800);
        note4.setOS("macOS");
        note4.setColor("rose");
        note4.setBrand("Samsung");

        HashSet<NoteBook> noteBooksArray = new HashSet<>(Arrays.asList(note1, note2, note3, note4));

        System.out.println("Здравствуйте!");
        System.out.println("введите номер интересующего параметра: \n 1 - RAM, \n 2 - HDD, \n 3 - OS, \n 4 - Цвет, \n 5 - Брэнд ");
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        scann.hasNextLine();

        HashMap<String, Object> choice = new HashMap<>();

        if (number == 1) {
            System.out.println("введите обьем RAM :   8  или  16");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("RAM", temp);
        }
        if (number == 2) {
            System.out.println("введите обьем HDD : 1 - 700, 2 - 800, 3 - 900, 4 - 1000");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("HDD", temp);
        }
        if (number == 3) {
            System.out.println("выберите операционную систему: 1- Windows, 2 - Linux, 3 - macOS");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("OS", temp);
        }
        if (number == 4) {
            System.out.println("выберите цвет корпуса: 1- black, 2 - silver, 3 - white, 4 - rose");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("color", temp);
        }
        if (number == 5) {
            System.out.println("выберите фирму-производителя: 1 - Acer, 2 - Apple, 3 - HP, 4 - Samsung");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("brand", temp);
        }

        HashSet<NoteBook> correction = new HashSet<>();
        for (Entry<String, Object> entry : choice.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                correction.addAll(noteBooksArray);
            }
            if (entry.getKey().equals("HDD")) {
                correction.addAll(noteBooksArray);
            }
            if (entry.getKey().equals("OS")) {
                correction.addAll(noteBooksArray);
            }
            if (entry.getKey().equals("color")) {
                correction.addAll(noteBooksArray);
            }
            if (entry.getKey().equals("brand")) {
                correction.addAll(noteBooksArray);
            }
        }
        for (NoteBook el :correction ) {
            System.out.println(el.toString());
        }
    }
}

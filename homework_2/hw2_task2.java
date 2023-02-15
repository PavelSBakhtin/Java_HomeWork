// Дана json строка (читать из файла и сохранить в файл)
// (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Если .txt -
// "фамилия":"Иванов","оценка":"5","предмет":"Математика" (и т.д.)
// Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.

package homework_2;

import java.io.FileReader;
import java.io.BufferedReader;

public class hw2_task2 {
    public static void main(String[] args) throws Exception {
        String[] arrDB = FileReadLine("homework_2/hw2_task2_file.json");
        for (int i = 0; i < arrDB.length; i++) {
            System.out.println(PrintLine(arrDB[i]));
        }
    }

    public static String[] FileReadLine(String file) throws Exception {
        BufferedReader buf = new BufferedReader(new FileReader(file));
        String str = buf.readLine();
        String[] listDB = str.split("},\\{");
        buf.close();
        return listDB;
    }

    public static StringBuilder PrintLine(String line) {
        String nl1 = line.replace("{", "");
        String nl2 = nl1.replace("}", "");
        String nl3 = nl2.replaceAll("\"", "");
        String nl4 = nl3.replace("[", "");
        String nl5 = nl4.replace("]", "");
        StringBuilder res = new StringBuilder("");
        String [] arrDB = nl5.split(",");
        String [] listNB = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrDB.length; i++) {
            String[] arrNDB = arrDB[i].split(":");
            res.append(listNB[i]);
            res.append(arrNDB[1]);
            }
        return res;
    }
}

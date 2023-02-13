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
        FileReader frd = new FileReader("homework_2/hw2_task2_file.txt");
        BufferedReader brd = new BufferedReader(frd);
        String line = brd.readLine();
        StringBuilder str = new StringBuilder();
        while (line != null) {
            System.out.println(line);
            line = brd.readLine();
        }
    }
}

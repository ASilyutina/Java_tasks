import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HomeTask05 {
    // ====================================================
// 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// ====================================================

      
        
    public static Map<String, List<String>> phoneBook = new HashMap<>();
    
        public static void main(String[] args) {
            addPerson();
            Scanner sc = new Scanner(System.in);
            System.out.print("Имя: ");
            String str = sc.nextLine();
            sc.close();
            findPerson(str);
        }
    
        public static void addPerson() {
            phoneBook.put("Kate", List.of("111", "222"));
            phoneBook.put("Ann", List.of("333", "444"));
            phoneBook.put("Vic",List.of("555"));
            phoneBook.put("Masha",List.of("666", "777"));
            phoneBook.put("Alise",List.of("888", "999"));
    
        }
    
        public static void findPerson(String surname) {
            System.out.printf("%s: %s", surname, phoneBook.get(surname));
        }

// =============================================
// 2. Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
// ====================================================



    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String persons = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listOfPersons = persons.split(" ");
        for (int i = 0; i < listOfPersons.length; i += 2) {
            if (nameMap.containsKey(listOfPersons[i])) {
                nameMap.replace(listOfPersons[i], nameMap.get(listOfPersons[i]) + 1);
            } else {
                nameMap.put(listOfPersons[i], 1);
            }
        }
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}

    
        

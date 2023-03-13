import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class HomeTask03 {


    // Пусть дан произвольный список целых чисел, удалить из него четные числа

{
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = lib.FillRandomArray(10);
        lib.PrintArray(array);
        DeleteEvenNumber(array);
        lib.PrintArray(array);
    }
   public static void DeleteEvenNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}



// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
   { public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-10, 10);
            list1.add(val);
        }
        System.out.printf("Первоначальный список -> %s\n", list1);
        int max = max(list1);
        int min = min(list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float) sumItems / list1.size();
        System.out.printf("Максимальный элемент -> %s\n", max);

        System.out.printf("Минимальный элемент -> %s\n", min);

        System.out.printf("Среднее арифметическое -> %s\n", average);
    }
}

//Создать список типа ArrayList<String>.Поместить в него как строки, так и целые числа.Пройти по списку, найти и удалить целые числа.



 {
        ArrayList<String> myList = new ArrayList<>();

    public void work(){
        myList.add("Hello");
        myList.add("Seminar");
        myList.add(String.valueOf(1)); //valueOf возвращает строковое представление аргумента
        myList.add(String.valueOf(3));

        System.out.println("Первичный список " + myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) { // matches указывает, соответствует ли эта строка заданному регулярному выражению для целых чисел(есть ли здесь числа со знаком - ,гуглим шаблоны регулярки)
                iterator.remove();
            }
        }
        System.out.println(myList);
    }

    }




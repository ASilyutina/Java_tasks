# Урок 1. Знакомство с языком программирования Java
1.1  Задать одномерный массив и найти в нем минимальный и максимальный элементы

1.2 Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

1.3 В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59


# Урок 2. Почему вы не можете не использовать API
2.1 Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

2.2 Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

2.3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
        1 Расширение файла: txt
        2 Расширение файла: pdf
        3 Расширение файла: 
        4 Расширение файла: jpg


# Урок 3. Коллекции JAVA: Введение
3.1 Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

3.2 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

3.3 Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.  

# Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
4.1 Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

4.2 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.



# Урок 5. Хранение и обработка данных ч2: множество коллекций Map
5.1 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 Пусть дан список сотрудников

5.2 Пусть дан список сотрудников. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class HomeTask01 {
    

//1.1. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

*/*
    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
/*


 /*
         * 1.3 В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         */
        // LocalDateTime now = LocalDateTime.now();
        // Calendar calendar = new GregorianCalendar();
        // System.out.println(calendar);
        // System.out.println(now);
        // System.out.println("Введите имя!");
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // in.close();
        // System.out.println("Привет, " + name);
        // if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
        //     System.out.println("Доброе утро, " + name + "!");
        // } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
        //     System.out.println("Добрый день, " + name + "!");
        // } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
        //     System.out.println("Добрый вечер, " + name + "!");
        // } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
        //     System.out.println("Доброй ночи, " + name + "!");
        // }
   // }
//}
/* */
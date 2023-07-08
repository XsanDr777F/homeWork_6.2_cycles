public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();
        task_8_1();

    }

    public static void task_1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total < 2_459_000) {
            total = total + salary;
            i++;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task_2() {
        System.out.println("Задача 2");

        int a = 0;

        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }

    public static void task_3() {
        System.out.println("Задача 3");

        int people = 12_000_000;
        float birth = (float) 17/1000;
        float death = (float) 8/1000;

        for (int i = 1; i <= 10; i++) {
            people = (int) (people + (people*birth) - (people*death));
            System.out.println("Год " + i + ", численность населения составляет " + people);
        }

    }

    public static void task_4() {
        System.out.println("Задача 4");
        int salary = 15000;
        double percent = 0.07F;
        int total = 0;
        int i = 0;
        for (; total <= 12_000_000; i++) {
            salary = (int) (salary * percent + salary);
            total = (int) (salary + total * percent);
            System.out.println("Месяц " + i + ", сумма накоплений " + total);
        }

    }

    public static void task_5() {
        System.out.println("Задача 5");
        int salary = 15000;
        double percent = 0.07F;
        int total = 0;
        int i = 0;
        for (; total <= 12_000_000; i++) {
            salary = (int) (salary * percent + salary);
            total = (int) (salary + total * percent);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений " + total);
        }

    }

    public static void task_6() {
        System.out.println("Задача 6");
        int salary = 15000;
        double percent = 0.07F;
        int total = 0;
        int i = 0;
        for (; i <= 9 * 12; i++) {
            salary = (int) (salary * percent + salary);
            total = (int) (salary + total * percent);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений " + total);
        }
    }

    public static void task_7() {
        System.out.println("Задача 7");
        int friday = 3;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
        }

    }

    public static void task_8() {
        System.out.println("Задача 8");
        int year = 0;
        for (; year <= 2123; year += 79) {
            if (year > 1823 && year < 2123) {
                System.out.println(year);
            }
        }

    }
    public static void task_8_1() {
        System.out.println("Задача 8(альтернатива)");
        int year = 0;
        int start = 2023-200;
        int end = 2023+100;
        for (; year <= end; year += 79) {
            if (year>start && year <end)
                System.out.println(year);
        }

    }
}
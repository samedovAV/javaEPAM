package secondChapter.secondChapterB;

public class TaskB {
    public static void main(String[] args) {

        // Вывести на экран таблицу умножения
        Task1 task1 = new Task1();
        task1.showMultiplicationChart();

        // Вывести элемента массива в обратном порядке
        Task2 task2 = new Task2();
        task2.printArrayInReverseOrder();

        // Определить принадлежность некоторого значения k интервалам (n, m], [n,m), (n, m), [n, m]
        Task3 task3 = new Task3();
        task3.checkInInterval();

        // Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
        Task4 task4 = new Task4();
        task4.showDivByThree();

        // Сколько значащих нулей в двоичной записи числа 129?
        Task5 task5 = new Task5();
        task5.showZerosAmount();

        // В системе счисления с некоторым основанием десятичное число 81 записывается в виде 100. Найти это основание.
        Task6 task6 = new Task6();
        task6.findNumberBase();

        // Написать код программы, которая бы переводила числа из десятичной системы счисления в любую другую
        Task7 task7 = new Task7();
        task7.convertToAnotherNumberBase();

        // Написать код программы, которая бы переводила числа одной любой системы счисления в любую другую.
        Task8 task8 = new Task8();
        task8.convertFromNumberBaseToAnother();

        //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        // Осуществить проверку корректности ввода чисел.
        Task9 task9 = new Task9();
        task9.showMonth();
    }

}

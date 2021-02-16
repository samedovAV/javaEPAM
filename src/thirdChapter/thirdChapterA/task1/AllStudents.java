package thirdChapter.thirdChapterA.task1;

import java.text.ParseException;
import java.util.ArrayList;

public class AllStudents {
    /**
     * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
     * Факультет, Курс, Группа.
     * Создать массив объектов. Вывести:
     * a) список студентов заданного факультета;
     * b) списки студентов для каждого факультета и курса;
     * c) список студентов, родившихся после заданного года;
     * d) список учебной группы.
    */
    public static void main(String[] args) throws ParseException {

        StudentList newList = new StudentList();
        ArrayList<Student> students = newList.createArray();

        newList.facultyPrint("Психология", students);//список студентов заданного факультета
        newList.facultyCoursePrint("Психология", 1, students);//списки студентов для каждого факультета и курса;
        newList.yearOfBirthPrint(1997, students);//список студентов, родившихся после заданного года;
        newList.groupPrint("123", students);//список учебной группы
    }
}

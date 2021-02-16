package thirdChapter.thirdChapterA.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public ArrayList<Student> createArray() throws ParseException {
        ArrayList<Student> res = new ArrayList<>();
        res.add(new Student(1,"Иван", "Иванович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("01.01.1998"), "Ильин", "38044555667712", "Психология", 1, "123"));
        res.add(new Student(2,"Петр", "Петрович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("12.04.1997"), "Петров", "38044555667713", "Журналистика", 2, "321"));
        res.add(new Student(3,"Семен", "Семенович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("10.07.1996"), "Семенов",  "38044555667714", "Юридический", 3, "231"));
        res.add(new Student(4,"Константин", "Иванович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("04.09.1999"),"Галушко",  "38044555667715", "Психология", 1, "123"));
        res.add(new Student(5,"Сергей", "Петрович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("03.04.1998"), "Пивоваров", "38044555667716", "Журналистика", 2, "321"));
        res.add(new Student(6,"Василий", "Николаевич", new SimpleDateFormat( "dd.MM.yyyy" ).parse("07.01.1998"),"Пупкин",  "38044555667717", "Юридический", 3, "231"));
        res.add(new Student(7,"Анатолий", "Сергеевич", new SimpleDateFormat( "dd.MM.yyyy" ).parse("03.12.1996"),"Антонов",  "38044555667718", "Психология", 1, "123"));
        res.add(new Student(8,"Евгений", "Анатольевич", new SimpleDateFormat( "dd.MM.yyyy" ).parse("15.07.1997"),"Жуков",  "38044555667719", "Журналистика", 2, "321"));
        res.add(new Student(9,"Роман", "Семенович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("23.04.1998"),"Решетников",  "38044555667720", "Юридический", 3, "231"));
        res.add( new Student(10,"Федор", "Викторович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("05.01.1998"), "Блинов", "38044555667721", "Психология", 1, "123"));
        res.add( new Student(11, "Виктор", "Андреевич", new SimpleDateFormat( "dd.MM.yyyy" ).parse("12.05.1997"),"Сидорченко",  "38044555667722", "Журналистика", 2, "321"));
        res.add( new Student(12,"Всеволод", "Богданович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("14.12.1996"),"Ющенко",  "38044555667723", "Юридический", 3, "231"));
        res.add( new Student(13,"Геннадий", "Николаевич", new SimpleDateFormat( "dd.MM.yyyy" ).parse("13.09.1999"),"Порошенко",  "38044555667724", "Психология", 1, "123"));
        res.add( new Student(14, "Николай", "Петрович", new SimpleDateFormat( "dd.MM.yyyy" ).parse("11.09.1998"),"Соломатин",  "38044555667725", "Журналистика", 2, "321"));
        return res;
    }

    public void facultyPrint(String faculty, ArrayList<Student> students){
        System.out.println("Список студентов факультета "+faculty);
        for(Student st:students){
            if(st.getFaculty().equals(faculty)){
                System.out.println(st.toString());
            }
        }
    }
    public void groupPrint(String group, ArrayList<Student> students){
        System.out.println("Список студентов группы "+group);
        for(Student st:students){
            if(st.getGroup().equals(group)){
                System.out.println(st.toString());
            }
        }
    }
    public void yearOfBirthPrint(int year, ArrayList<Student> students){
        System.out.println("Список студентов, родившихся после "+year+" года");
        for(Student st:students){
            if(st.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear() > year){
                System.out.println(st.toString());}
        }
    }

    public void facultyCoursePrint(String faculty, int course, ArrayList<Student> students){
        System.out.println("Список студентов факультета "+faculty+" курса "+course);
        for(Student st:students){
            if(st.getFaculty().equals(faculty) && st.getCourse() == course){
                System.out.println(st.toString());
            }
        }
    }
}

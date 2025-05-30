package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1",15,90);
        Student student2 = new Student("학생2",16,80);
//        initStudents(student1, "학생1",15,90);
//        initStudents(student2, "학생2",16,80);
        Student student3 = createStudent("학생3", 17, 100);
        Student student4 = createStudent("학생4", 18, 100);

        printStudent(student1);
        System.out.println("1의주소값 "+student1);
        printStudent(student2);
        System.out.println("2의주소값 "+student2);
        printStudent(student3);
        System.out.println("3의주소값 "+student3);
        printStudent(student4);
        System.out.println("4의주소값 "+student4);
    }
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(name, age, grade);
        System.out.println(student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void initStudents(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름 :" + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}

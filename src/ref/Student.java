package ref;

public class Student {
    public String name;
    public int age;
    public int grade;
    public Student() {}

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void toString(Student student){
        System.out.println("이름 :" + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}

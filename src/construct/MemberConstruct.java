package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age,int grade){
        System.out.println("Constructing " + name + " with age " + age + " and grade " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
   }

    MemberConstruct(String name, int age){
        this(name,age,50);
    }
}

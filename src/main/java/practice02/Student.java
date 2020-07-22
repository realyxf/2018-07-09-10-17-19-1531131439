package practice02;

public class Student extends Person{

    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    //("I am a Student. I am at Class 2.");
    public String introduce() {
        String introduceModel="I am a Student. I am at Class " + this.klass + ".";
        return introduceModel;
    }
}

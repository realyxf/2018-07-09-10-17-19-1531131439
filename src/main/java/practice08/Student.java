package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int i, String name, int age, Klass klass) {
        super(i,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(getKlass().getLeader() == this){
            return "My name is "+ getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of " + getKlass().getDisplayName() + '.';
        }
        else {
            return "My name is "+ getName() + ". I am " + getAge() + " years old. I am a Student. I am at " + getKlass().getDisplayName() + '.';
        }

    }
}
package practice07;

public class Teacher extends Person{
    private Klass klass;
    private Student student;

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        if(getKlass()!=null) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + getKlass().getDisplayName() + '.';
        }
        else{
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber() == this.getKlass().getNumber()){
            return "My name is " + getName() +  ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + '.';
        }
        else{
            return "My name is " + getName() +  ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + '.';
        }
    }
}

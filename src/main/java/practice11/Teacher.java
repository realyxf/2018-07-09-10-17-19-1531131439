package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private Student student;
    private LinkedList linkedList;
    private Klass klass;

    public Teacher(int i, String name, int age, LinkedList linkedList) {
        super(i, name, age);
        this.linkedList = linkedList;
        }

    public Teacher(int i, String name, int age) {
        super(i, name, age);
    }

    //("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.")
    public String introduce() {
        if(getClasses() != null) {
            String classListStr = "";
            for(int linkIndex=0; linkIndex < getClasses().size(); linkIndex++){
                classListStr += (getClasses().get(linkIndex).getNumber() + ", ");
            }
            classListStr = classListStr.substring(0, classListStr.length() - 2);
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + classListStr + ".";
        }
        else{
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        for(int linkIndex=0; linkIndex < getClasses().size(); linkIndex++){
            if(student.getKlass().getNumber() == getClasses().get(linkIndex).getNumber()){
                return "My name is " + getName() +  ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + '.';
            }
        }
        return "My name is " + getName() +  ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + '.';
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        for(int linkIndex=0; linkIndex < getClasses().size(); linkIndex++){
            if(student.getKlass().getNumber() == getClasses().get(linkIndex).getNumber()){
                return true;
            }
        }
        return false;
    }
}
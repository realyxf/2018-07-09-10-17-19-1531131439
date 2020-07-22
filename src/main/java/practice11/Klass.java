package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number,Teacher teacher) {
        this.number = number;
        this.teacher = teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        if(student.getKlass().getNumber() == this.getNumber()){
            this.leader = student;
            System.out.print("I am Tom. I know " + student.getName() +" become Leader of Class " + this.number +".\n");
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.number);
        System.out.print("I am Tom. I know " + student.getName() +" has joined Class " + this.number +".\n");
    }
}
package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
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
    }
}

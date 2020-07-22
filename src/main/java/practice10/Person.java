package practice10;

public class Person {
    private String name;
    private int age;
    private int i;

    public Person(int i, String name, int age) {
        this.i = i;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (i != other.i)
            return false;
        return true;
    }

}

package bai6;

public class Person implements Comparable<Person>  {
    public boolean getAge;
    private String name;
    private int age;
    private boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public boolean isGetAge() {
        return getAge;
    }

    public void setGetAge(boolean getAge) {
        this.getAge = getAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

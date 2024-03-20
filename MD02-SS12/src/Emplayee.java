import java.util.Date;
import java.text.SimpleDateFormat;

public class Emplayee implements Comparable<Emplayee> {
    private int id;
    private String fullName;
    private String address;
    private Date birthday;
    private double salary;
    private float rare;

    public Emplayee(int id, String fullName, String address, Date birthday, double salary, float rare) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.birthday = birthday;
        this.salary = salary;
        this.rare = rare;
    }

    public Emplayee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getRare() {
        return rare;
    }

    public void setRare(float rare) {
        this.rare = rare;
    }
    public double total(){
       return this.salary*this.rare;
    }
    @Override
    public int compareTo(Emplayee o) {
        return this.fullName.compareTo(o.fullName);
    }

}

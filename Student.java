import java.util.Scanner;
public class Student extends Person {
 protected String id;
 protected String lop;
 protected String school;

    public Student(String id, String lop, String school) {
        this.id = id;
        this.lop = lop;
        this.school = school;
    }

    public Student(String id, String lop, String school, String name, Byte age, String address, Date birthDay) {
        super(name, age, address, birthDay);
        this.id = id;
        this.lop = lop;
        this.school = school;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        super.input();
        System.out.println("Nhap id ");
        id = s.next();
        System.out.println("Nhap lop : ");
        lop = s.next();
        System.out.println("Nhap truong : ");
        school = s.next();
    }
    public void output(){
        super.output();
        System.out.println("Id la : "+id);
         System.out.println("Lop la : "+lop);
          System.out.println("Truong la : "+school);
    }
     @Override
    public String toString() {
        return super.toString()+" "+this.id+" "+this.lop+" "+this.school;
    }
         
}

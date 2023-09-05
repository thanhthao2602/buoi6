import java.util.Scanner;
public class Person {
    protected String name;
    protected Byte age;
    protected String address;
    protected Date birthDay;

    public Person() {
    }

    public Person(String name, Byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
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
        System.out.println("Nhap ten : ");
        name = s.nextLine();
        System.out.println("Nhap tuoi : ");
        age = s.nextByte();
        System.out.println("Nhap dia chi : ");
        address = s.next();
        birthDay = new Date();
        birthDay.input();
    }
    public void output(){
        System.out.println("Ten la : "+name);
        System.out.println("Tuoi la : "+age);
        System.out.println("Dia chi la : "+address);
        birthDay.output();
    }
    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.address+" "+this.birthDay.toString();
    }
}

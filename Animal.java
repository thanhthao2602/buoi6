import java.util.Scanner;
public class Animal {
 protected String name;
  protected Byte age;
  protected Float weight;

    public Animal() {
    }

    public Animal(String name, Byte age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
  public void input(){
      Scanner s = new Scanner(System.in);
      System.out.println("Nhap ten con vat : ");
      name = s.nextLine();
      System.out.println("Nhap tuoi con vat : ");
      age = s.nextByte();
      System.out.println("Nhap can nang con vat : ");
      weight = s.nextFloat();
  }
  public void output(){
      System.out.println("Ten con vat la : "+name);
       System.out.println("Tuoi con vat la : "+age);
       System.out.println("Can nang con vat la : "+weight);
  }
  public void tiengKeu(){
      
  }
  @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.weight;
    }
    
}

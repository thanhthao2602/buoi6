import java.util.Scanner;
public class Cat extends Animal{
   private String color;
   private String preferences;
   private String ownerName;

    public Cat() {
    }

    public Cat(String color, String preferences, String ownerName) {
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public Cat(String color, String preferences, String ownerName, String name, Byte age, Float weight) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
   public void input(){
       Scanner s = new Scanner(System.in);
      super.input();
      System.out.println("Nhap mau sac con meo nha ban :");
      color = s.nextLine();
      System.out.println("Nhap so thich cua con meo do : ");
      preferences = s.nextLine();
      System.out.println("Nhap ten chu no : ");
      ownerName = s.nextLine();
   } 
   public void output(){
       super.output();
       System.out.println("Mau sac con meo la :"+color);
       System.out.println("So thich cua no la : "+preferences);
       System.out.println("Chu no ten la : "+ownerName);
   }
   public void tiengKeu(){
      System.out.println("mèo méo meo mèo meo"); 
   }
   @Override
    public String toString() {
        return super.toString() + " " + this.color + " " + this.preferences + " " + this.ownerName;
    }
}

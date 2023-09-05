import java.util.Scanner;
public class Dog extends Animal {
  private String character ;

    public Dog(String character) {
        this.character = character;
    }

    public Dog(String character, String name, Byte age, Float weight) {
        super(name, age, weight);
        this.character = character;
    }

    public Dog() {
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
  public void input(){
      super.input();
      Scanner s = new Scanner(System.in);
      System.out.println("Nhap dac diem con cho nha ban : ");
      character = s.nextLine();
      System.out.println("--------------------");
  }
  public void output(){
     System.out.println("Dac diem con cho nha ban la : "+character);
     super.output();
  }
  public void tiengKeu(){
      super.tiengKeu();
      System.out.println("gau gau ");
  }
    @Override
    public String toString() {
        return super.toString()+" "+this.character;
    }
  
}

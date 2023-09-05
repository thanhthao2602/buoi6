import java.util.Scanner;
public class Main {
   public static void main(String[] args){
     Scanner s=new Scanner(System.in);  
     Cat cat = new Cat();
     Dog dog = new Dog();
     cat.input();
     dog.input();
     System.out.println("Thong tin con meo:");
        cat.output();
        System.out.printf("Nó Kêu : ");
        cat.tiengKeu();
        System.out.println("Thong tin con cho:");
        dog.output();
        System.out.printf("Nó kêu : ");
        dog.tiengKeu();
   } 
}

import java.util.Scanner;
public class Date {
   protected  Byte year;
   protected Byte month;
   protected Byte day;

    public Date(Byte year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
    }

    public Byte getYear() {
        return year;
    }

    public void setYear(Byte year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap nam sinh : ");
        year = s.nextByte();
        System.out.println("Nhap thang sinh : ");
        month = s.nextByte();
        System.out.println("Nhap ngay sinh : ");
        day = s.nextByte();
    }
    public void output(){
        System.out.println("Nam sinh : "+year);
        System.out.println("Thang sinh : "+month);
        System.out.println("Ngay sinh : "+day);
    }
}

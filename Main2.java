import java.util.Scanner;
import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap so luong: ");
        int n = s.nextInt();
        ArrayList<HangHoaGiaDung> a = new ArrayList<HangHoaGiaDung>(n);
        ArrayList<HangHoaDienTu> b = new ArrayList<HangHoaDienTu>(n);
         for (int i = 0; i < n; i++) {
            System.out.println("Nhap Hang hoa gia dung thu " + (i + 1));
            HangHoaGiaDung hhgd = new HangHoaGiaDung();
            hhgd.input();
            a.add(hhgd);
        }
        for(int i=0;i<n;i++)
        {
            HangHoaGiaDung x = a.get(i);
            x.tongTien();
            x.output();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Hang hoa dien tu thu " + (i + 1));
            HangHoaDienTu hhdt = new HangHoaDienTu();
            hhdt.input();
            b.add(hhdt);
        }
        for(int i=0;i<n;i++)
        {
            HangHoaDienTu y = b.get(i);
            y.tongTien();
            y.output();
        }
        
    }
}


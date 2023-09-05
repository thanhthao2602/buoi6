import java.util.ArrayList;
import java.util.Scanner;
public class HangHoaGiaDung extends HangHoa{
  protected String chucNang;

   

    public HangHoaGiaDung(String chucNang) {
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public HangHoaGiaDung() {
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        super.input();
        System.out.println("Nhap chuc nang : ");
        chucNang = s.nextLine();
        System.out.println("------------------------");
    }
    
    public void output(){
        System.out.println("Chuc nang : "+chucNang);
        super.output();
    }
    
}

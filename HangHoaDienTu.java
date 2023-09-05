import java.util.Scanner;
import java.util.ArrayList;


public class HangHoaDienTu extends HangHoa{
    protected int thoiGianBaoHanh;
    protected int congSuat;

   

    public HangHoaDienTu(int thoiGianBaoHanh, int congSuat) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public HangHoaDienTu() {
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
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
    public void input(){
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap thoi gian bao hanh : ");
        thoiGianBaoHanh = s.nextInt();
        System.out.println("Nhap cong suat : ");
        congSuat = s.nextInt();
        super.input();
        
    }
    public void output(){
        System.out.println("Thoi gian bao hanh : "+thoiGianBaoHanh);
        System.out.println("Cong suat : "+congSuat);
        super.output();
    }
    public float tongTien()
    {
        return super.tongTien();
    }

    
}

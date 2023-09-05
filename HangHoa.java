import java.util.Scanner;

public class HangHoa {
  protected String maHang;
  protected String tenHang;
  protected int soLuong;
  protected float donGia;
  private VatLieu[] dsVL;

    public HangHoa(String maHang, String tenHang, int soLuong, float donGia, VatLieu[] dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
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

    public VatLieu[] getDsVL() {
        return dsVL;
    }

    public void setDsVL(VatLieu[] dsVL) {
        this.dsVL = dsVL;
    }
  


  

    

    public HangHoa() {
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma hang : ");
        maHang = s.nextLine();
        System.out.println("Nhap ten hang : ");
        tenHang =  s.nextLine();
        System.out.println("Nhap so luong hang hoa : ");
        soLuong = s.nextInt();
        System.out.println("Nhap don gia : ");
        donGia = s.nextFloat();
          dsVL = new VatLieu[soLuong];
        System.out.println("");
        for(int i=0;i<soLuong;i++)
        {
            System.out.println("Vat lieu "+(i+1));
            dsVL[i]  = new VatLieu();
            dsVL[i].nhap();
        }
       
     } 
    public void output(){
      System.out.println("Ma hang : "+maHang);
      System.out.println("Ten hang : "+tenHang);
      System.out.println("So luong : "+soLuong);
      System.out.println("Don gia : "+donGia);
      for(int i=0 ; i<soLuong ; i++){
         System.out.println("Vat lieu "+(i+1));
         dsVL[i].xuat();
         System.out.println();
      }
      
    }
    public float tongTien(){
        float tongtien =  donGia*soLuong;
        System.out.println("Tong tien : "+tongtien);
        return tongtien;
    }
       
   
}

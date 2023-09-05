import java.util.Scanner;
public class VatLieu {
  protected String ten;
  protected String mauSac;
  protected int doCung;

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public VatLieu() {
    }
  public void nhap(){
      Scanner s = new Scanner(System.in);
      System.out.println("Nhap ten vat lieu : ");
      ten = s.nextLine();
      System.out.println("Nhap mau sac vat lieu : ");
      mauSac = s.nextLine();
      System.out.println("Nhap do cung vat lieu : ");
      doCung = s.nextInt();
  }
  public void xuat(){
      System.out.println("Ten vat lieu : "+ten);
      System.out.println("Mau sac vat lieu : "+mauSac);
      System.out.println("Do cung vat lieu : "+doCung);
  }
}

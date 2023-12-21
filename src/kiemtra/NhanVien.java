
package kiemtra;

import java.util.Scanner;

/**
 * NhanVien
 */
public class NhanVien {

  String maNhanVien;
  String hoTen;
  String ngaySinh;
  double luongCoBan = 220275;

  public String getNgaySinh() {
    return ngaySinh;
  }

  public String getMaNhanVien() {
    return maNhanVien;
  }

  public double getLuongCoBan() {
    return luongCoBan;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setNgaySinh(String ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public void setMaNhanVien(String maNhanVien) {
    this.maNhanVien = maNhanVien;
  }

  public void setLuongCoBan(double luongCoBan) {
    this.luongCoBan = luongCoBan;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public NhanVien() {
    this.maNhanVien = " ";
    this.hoTen = " ";
    this.ngaySinh = " ";
  }

  public NhanVien(String mnv, String ht, String ns) {
    this.maNhanVien = mnv;
    this.hoTen = ht;
    this.ngaySinh = ns;
  }

  public void scaninfoNhanVien(Scanner sc) {
    this.maNhanVien = sc.nextLine();
    this.hoTen = sc.nextLine();
    this.ngaySinh = sc.nextLine();
  }

  public void setNhanVien(String mnv, String ht, String ns) {
    this.maNhanVien = mnv;
    this.hoTen = ht;
    this.ngaySinh = ns;
  }

  public void printInfo() {
    System.out.println(this.maNhanVien);
    System.out.println(this.hoTen);
    System.out.println(this.ngaySinh);
  }
}

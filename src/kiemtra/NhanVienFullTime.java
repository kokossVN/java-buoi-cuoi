package kiemtra;

import java.util.Scanner;

/**
 * NhanVienFullTime
 */
public class NhanVienFullTime extends NhanVien {

  int soNgayLamViec;
  double luongThuong;

  public int getSoNgayLamViec() {
    return soNgayLamViec;
  }

  public double getLuongThuong() {
    return luongThuong;
  }

  public void setSoNgayLamViec(int soNgayLamViec) {
    this.soNgayLamViec = soNgayLamViec;
  }

  public void setLuongThuong(double luongThuong) {
    this.luongThuong = luongThuong;
  }

  public double tinhLuong() {
    this.luongThuong = this.soNgayLamViec > 26 ? (this.soNgayLamViec - 26.0) * 500000.0 : 0;
    System.out.println(this.luongThuong);
    return this.luongCoBan * this.soNgayLamViec + luongThuong;
  }

  public NhanVienFullTime() {
    this.soNgayLamViec = 0;
  }

  public NhanVienFullTime(String mnv, String ht, String ns, int soNgayLamViec) {
    super(mnv, ht, ns);
    this.soNgayLamViec = soNgayLamViec;
  }

  @Override
  public void scaninfoNhanVien(Scanner sc) {
    super.scaninfoNhanVien(sc);
    this.soNgayLamViec = sc.nextInt();
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println(this.soNgayLamViec);
    System.out.println(tinhLuong());
  }
}

import java.util.ArrayList;

public class SanPham {
    String maSanPham;
    String tenSanPham;
    double giaBan;
    int soLuong;
    double thanhTien;

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }


    public SanPham(String maSanPham, String tenSanPham, double giaBan, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public void showSanPham(){
        System.out.println("Ma San Pham: " + maSanPham + " -- "+ tenSanPham + " -- " + giaBan + " -- " + soLuong);
    }

    public double tinhTien(){
        if (soLuong > 20){
            thanhTien = giaBan * soLuong * 0.15;
        } else {
            thanhTien = giaBan * soLuong;
        }
        return thanhTien;
    }
}



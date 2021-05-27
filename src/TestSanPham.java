import java.util.ArrayList;

public class TestSanPham {

    public static void SapXep(SanPham [] a, int n){
        int j;
        double temp;
        n = a.length;
        for(int i=0; i < n; i++){
            double tien = a[i].thanhTien;
            System.out.print("Thanh tien cua tung san pham la: " + tien);
//            for(j = 1; j < n -1; j++){
//                if(a[j-1] > a[j]){
//                    temp = a[j-1];
//                    a[j-1] = a[j];
//                    a[j] = temp;
//                }
//            }
        }
    }

    public static void main(String[] args) {
        SanPhamList.checkSanPham();
    }
}
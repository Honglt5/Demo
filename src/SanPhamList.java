import java.util.ArrayList;

public class SanPhamList {
    public static void checkSanPham() {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        SanPham sp1 = new SanPham("1", "San Pham 1", 250000, 2);
        SanPham sp2 = new SanPham("2", "San Pham 2", 300000, 30);
        SanPham sp3 = new SanPham("3", "San Pham 3", 150000, 6);
        SanPham sp4 = new SanPham("4", "San Pham 4", 450000, 4);
        SanPham sp5 = new SanPham("5", "San Pham 5", 650000, 5);
        listSanPham.add(sp1);
        listSanPham.add(sp2);
        listSanPham.add(sp3);
        listSanPham.add(sp4);
        listSanPham.add(sp5);
        for (SanPham obj : listSanPham) {
            obj.showSanPham();
            double money = obj.tinhTien();
            System.out.println(money);
        }
    }
}

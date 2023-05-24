package ThiThu.Models;
import java.util.*;

/**
 * 
 */
public abstract class KhachHang implements InterfaceKhachHang {

    /**
     * Default constructor
     */
    public KhachHang() {
    }

    /**
     * 
     */
    public int maKH;

    /**
     * 
     */
    public String tenCH;

    /**
     * 
     */
    public float chiSoCu;

    /**
     * 
     */
    public float chiSoMoi;

    /**
     * 
     */
    public float dienSuDung;

    /**
     * 
     */
    public double thanhTien;

    public KhachHang(int maKH, String tenCH, float chiSoCu, float chiSoMoi) {
        this.maKH = maKH;
        this.tenCH = tenCH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }


    @Override
    public abstract void salary();

    @Override
    public abstract String toString();

    public static KhachHang findById(List<KhachHang> khachHangList, long id){
        for (KhachHang khachHang : khachHangList){
            if (khachHang.maKH == id){
                return khachHang;
            }
        }
        return null;
    }

    public static double AvgTienDien(List<KhachHang> khachHangList){
        double sum = 0;
        for (KhachHang khachHang : khachHangList){
            sum += khachHang.thanhTien;
        }
        return sum/khachHangList.size();
    }

    public static  List<KhachHang> MaxTTList(List<KhachHang> khachHangList){
        double maxTT = khachHangList.get(0).thanhTien;
        for (KhachHang khachHang : khachHangList){
            if (khachHang.thanhTien >maxTT){
                maxTT = khachHang.thanhTien;
            }
        }
        List<KhachHang> khachHangListMax = new ArrayList<>();
        for (KhachHang khachHang : khachHangList){
            if (khachHang.thanhTien == maxTT){
                khachHangListMax.add(khachHang);
            }
        }
        return  khachHangListMax;
    }

    public static List<KhachHang> HoSXMin(List<KhachHang> khachHangList){
        double MinTT = khachHangList.get(0).thanhTien;
        for (KhachHang khachHang : khachHangList){
            if (khachHang.getClass() == HoSanXuat.class) {
                if (khachHang.thanhTien < MinTT) {
                    MinTT = khachHang.thanhTien;
                }
            }
        }
        List<KhachHang> khachHangListMin = new ArrayList<>();
        for (KhachHang khachHang : khachHangList){
            if (khachHang.getClass() == HoSanXuat.class) {
                if (khachHang.thanhTien == MinTT) {
                    khachHangListMin.add(khachHang);
                }
            }
        }
        return  khachHangListMin;
    }
    public static void main(String[] args) {
        List<KhachHang> khachHangList = new ArrayList<>();
        HoKinhDoanh hoKinhDoanh01 = new HoKinhDoanh(123,"A",120,960,1.8);
        khachHangList.add(hoKinhDoanh01);

        HoGiaDinh hoGiaDinh01 = new HoGiaDinh(124,"B",400,450);
        khachHangList.add(hoGiaDinh01);

        HoKinhDoanh hoKinhDoanh02 = new HoKinhDoanh(125,"C",300,689,1.3);
        khachHangList.add(hoKinhDoanh02);

        HoSanXuat hoSanXuat01 = new HoSanXuat(126,"D",150,965,1.5);
        khachHangList.add(hoSanXuat01);

        HoGiaDinh hoGiaDinh02 = new HoGiaDinh(127,"E",500,999);
        khachHangList.add(hoGiaDinh02);

        HoSanXuat hoSanXuat02 = new HoSanXuat(128,"F",350,987,1.6);
        khachHangList.add(hoSanXuat02);

        HoSanXuat hoSanXuat03 = new HoSanXuat(129,"G",100,986,1.9);
        khachHangList.add(hoSanXuat03);

        HoSanXuat hoSanXuat04 = new HoSanXuat(130,"H",100,986,1.9);
        khachHangList.add(hoSanXuat04);

        for (KhachHang khachHang : khachHangList){
            khachHang.salary();
            System.out.println(khachHang);
        }

        System.out.println("tim 128: "+ findById(khachHangList,128));
        System.out.println("Tien Trung Binh: "+ AvgTienDien(khachHangList));
        System.out.println("Danh sach thanh tien lon nhat: "+ MaxTTList(khachHangList));
        System.out.println("Danh sach HSX thanh tien it nhat: "+ HoSXMin(khachHangList));
    }
}
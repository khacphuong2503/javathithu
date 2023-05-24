package ThiThu.Models;
import java.util.*;

/**
 * 
 */
public class HoKinhDoanh extends KhachHang {

    /**
     * Default constructor
     */
    public HoKinhDoanh() {
    }

    /**
     * 
     */
    public double heSo;

    public HoKinhDoanh(int maKH, String tenCH, float chiSoCu, float chiSoMoi, double heSo) {
        super(maKH, tenCH, chiSoCu, chiSoMoi);
        this.heSo = heSo;
    }

    @Override
    public void salary() {
        dienSuDung = chiSoMoi - chiSoCu;
        if (dienSuDung >500){
            thanhTien = dienSuDung*7_500*heSo;
        }else {
            thanhTien = dienSuDung*5_500*heSo;
        }
    }

    @Override
    public String toString() {
        return "HoKinhDoanh{" +
                "maKH=" + maKH +
                ", tenCH='" + tenCH + '\'' +
                ", chiSoCu=" + chiSoCu +
                ", chiSoMoi=" + chiSoMoi +
                ", dienSuDung=" + dienSuDung +
                ", heSo=" + heSo +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
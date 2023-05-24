package ThiThu.Models;
import java.util.*;

/**
 * 
 */
public class HoSanXuat extends HoKinhDoanh {

    /**
     * Default constructor
     */
    public HoSanXuat() {
    }

    public HoSanXuat(int maKH, String tenCH, float chiSoCu, float chiSoMoi, double heSo) {
        super(maKH, tenCH, chiSoCu, chiSoMoi, heSo);
    }

    @Override
    public void salary() {
        dienSuDung = chiSoMoi -chiSoCu;
        thanhTien = dienSuDung*7_500*heSo;
    }

    @Override
    public String toString() {
        return "HoSanXuat{" +
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
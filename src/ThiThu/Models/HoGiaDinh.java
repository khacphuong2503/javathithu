package ThiThu.Models;
import java.util.*;

/**
 * 
 */
public class HoGiaDinh extends KhachHang {

    /**
     * Default constructor
     */
    public HoGiaDinh() {
    }

    public HoGiaDinh(int maKH, String tenCH, float chiSoCu, float chiSoMoi) {
        super(maKH, tenCH, chiSoCu, chiSoMoi);
    }

    @Override
    public void salary() {
        dienSuDung = chiSoMoi - chiSoCu;
        if (dienSuDung >100){
            thanhTien = dienSuDung*5_500;
        }else {
            thanhTien = dienSuDung*3_500;
        }
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "maKH=" + maKH +
                ", tenCH='" + tenCH + '\'' +
                ", chiSoCu=" + chiSoCu +
                ", chiSoMoi=" + chiSoMoi +
                ", dienSuDung=" + dienSuDung +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
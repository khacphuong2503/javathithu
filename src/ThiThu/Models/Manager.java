package ThiThu.Models;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	public List<KhachHang> khachHangList = new ArrayList<>();
	
	public Manager() {
	}
	
	public Manager(List<KhachHang> khachHangList) {
		this.khachHangList = khachHangList;
	}
	public KhachHang findById(long id){
        for (KhachHang khachHang : khachHangList){
            if (khachHang.maKH == id){
                return khachHang;
            }
        }
        return null;
    }

    public  double AvgTienDien(){
        double sum = 0;
        for (KhachHang khachHang : khachHangList){
            sum += khachHang.thanhTien;
        }
        return sum/khachHangList.size();
    }

    public   List<KhachHang> MaxTTList(){
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

    public  List<KhachHang> HoSXMin(){
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
    public void TinhTien() {
		for(KhachHang khachHang: khachHangList) {
			khachHang.salary();
		}
	}
    public void Load() {
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
	}
	

}

package ThiThu.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import ThiThu.Models.KhachHang;
import ThiThu.Models.Manager;
import ThiThu.View.FormUI;

public class ControllerTabBill implements ActionListener {
	
	public FormUI formUI;
	
	public ControllerTabBill(FormUI formUI) {
		this.formUI = formUI;
	}
	public void CreateTable() {
	
		String col[] = {"Mã Khách Hàng","Tên Khách Hàng","Chỉ Số Cũ", "Chỉ Số Mới", "Thành Tiền"};

		DefaultTableModel tableModel = new DefaultTableModel(col, 0);
		formUI.getTable().setModel(tableModel);
		formUI.getManager().Load();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String commandString = e.getActionCommand();
		Manager manager = formUI.getManager();
		List<KhachHang> dataKhachHangManager = formUI.getManager().khachHangList;
		DefaultTableModel tableModel = (DefaultTableModel)formUI.getTable().getModel();
		switch (commandString){
		case "Yc1"->{
			tableModel.getDataVector().clear();
			for(KhachHang khachHang : dataKhachHangManager) {
				Object dataObject[] = {khachHang.maKH,khachHang.tenCH,khachHang.chiSoCu,khachHang.chiSoMoi,khachHang.thanhTien};
				tableModel.addRow(dataObject);
			}
		}
		case "Yc2" ->{
			formUI.getManager().TinhTien();
			tableModel.getDataVector().clear();
			for(KhachHang khachHang : dataKhachHangManager) {
				Object dataObject[] = {khachHang.maKH,khachHang.tenCH,khachHang.chiSoCu,khachHang.chiSoMoi,khachHang.thanhTien};
				tableModel.addRow(dataObject);
			}
		}
		case "Yc3"->{
			int idString = Integer.parseInt(formUI.getTxtMaKH().getText());
			KhachHang khachHang = manager.findById(idString);
			tableModel.getDataVector().clear();
			Object dataObject[] = {khachHang.maKH,khachHang.tenCH,khachHang.chiSoCu,khachHang.chiSoMoi,khachHang.thanhTien};
			tableModel.addRow(dataObject);
		}
		case "Yc4"->{
			double avg = manager.AvgTienDien();
			tableModel.getDataVector().clear();
			formUI.getLblAvg().setText(String.valueOf(avg));		
		}
		case "Yc5"->{
			List<KhachHang> khachHangList = manager.MaxTTList();
			tableModel.getDataVector().clear();
			for(KhachHang khachHang : khachHangList) {
				Object dataObject[] = {khachHang.maKH,khachHang.tenCH,khachHang.chiSoCu,khachHang.chiSoMoi,khachHang.thanhTien};
				tableModel.addRow(dataObject);
			}
		}
		case "Yc6"->{
			List<KhachHang> khachHangList = manager.HoSXMin();
			tableModel.getDataVector().clear();
			for(KhachHang khachHang : khachHangList) {
				Object dataObject[] = {khachHang.maKH,khachHang.tenCH,khachHang.chiSoCu,khachHang.chiSoMoi,khachHang.thanhTien};
				tableModel.addRow(dataObject);
			}
		}

		}
	
	}



}

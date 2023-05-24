package ThiThu.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ThiThu.Controller.ControllerTabBill;
import ThiThu.Models.Manager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class FormUI {

	private JFrame frame;
	private JTable table;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JButton btnLoad;
	private JButton btnTinhTienDien;
	private Manager manager = new Manager();
	private JTextField txtMaKH;
	private JButton btnFindKH;
	private JButton btnKHLN;
	private JButton btnAvg;
	private JButton btnKhSXLN;
	private JLabel lblNewLabel_1;
	public JLabel lblAvg;
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnLoad() {
		return btnLoad;
	}

	public void setBtnLoad(JButton btnLoad) {
		this.btnLoad = btnLoad;
	}

	public JButton getBtnTinhTienDien() {
		return btnTinhTienDien;
	}

	public void setBtnTinhTienDien(JButton btnTinhTienDien) {
		this.btnTinhTienDien = btnTinhTienDien;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	

	public JTextField getTxtMaKH() {
		return txtMaKH;
	}

	public void setTxtMaKH(JTextField txtMaKH) {
		this.txtMaKH = txtMaKH;
	}

	public JButton getBtnFindKH() {
		return btnFindKH;
	}

	public void setBtnFindKH(JButton btnFindKH) {
		this.btnFindKH = btnFindKH;
	}

	public JButton getBtnKHLN() {
		return btnKHLN;
	}

	public void setBtnKHLN(JButton btnKHLN) {
		this.btnKHLN = btnKHLN;
	}

	public JButton getBtnAvg() {
		return btnAvg;
	}

	public void setBtnAvg(JButton btnAvg) {
		this.btnAvg = btnAvg;
	}

	public JButton getBtnKhSXLN() {
		return btnKhSXLN;
	}

	public void setBtnKhSXLN(JButton btnKhSXLN) {
		this.btnKhSXLN = btnKhSXLN;
	}
	

	
	

	public JLabel getLblAvg() {
		return lblAvg;
	}

	public void setLblAvg(JLabel lblAvg) {
		this.lblAvg = lblAvg;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormUI window = new FormUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormUI() {
		initialize();
		ActionListener actionListener = new ControllerTabBill(this);
		ControllerTabBill controllerTabBill = new ControllerTabBill(this);
		controllerTabBill.CreateTable();
		btnLoad.addActionListener(actionListener);
		btnTinhTienDien.addActionListener(actionListener);
		btnFindKH.addActionListener(actionListener);
		btnAvg.addActionListener(actionListener);
		btnKHLN.addActionListener(actionListener);
		btnKhSXLN.addActionListener(actionListener);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 757, 618);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 757, 618);
		panel.add(tabbedPane);
		
		JPanel panelBill = new JPanel();
		tabbedPane.addTab("Tính Tiền Điện Phường Linh Trung", null, panelBill, null);
		panelBill.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 732, 47);
		panelBill.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Tính Tiền Điện Phường Linh Trung");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 67, 732, 316);
		panelBill.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 732, 316);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 393, 732, 188);
		panelBill.add(panel_3);
		panel_3.setLayout(null);
		
		btnLoad = new JButton("Yêu Cầu 1: Load dữ liệu");
		btnLoad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoad.setBounds(10, 10, 226, 39);
		btnLoad.setActionCommand("Yc1");
		panel_3.add(btnLoad);
		
		btnTinhTienDien = new JButton("Yêu Cầu 2: Tính Tiền Điện");
		btnTinhTienDien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTinhTienDien.setBounds(10, 57, 226, 39);
		btnTinhTienDien.setActionCommand("Yc2");
		panel_3.add(btnTinhTienDien);
		
		btnFindKH = new JButton("Yêu Cầu 3: Tìm Khách Hàng");
		btnFindKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindKH.setBounds(496, 10, 226, 39);
		btnFindKH.setActionCommand("Yc3");
		panel_3.add(btnFindKH);
		
		btnKHLN = new JButton("Yêu Cầu 5: Khách Hàng Có Tiền Điện Lớn Nhất");
		btnKHLN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnKHLN.setBounds(10, 107, 374, 39);
		btnKHLN.setActionCommand("Yc5");
		panel_3.add(btnKHLN);
		
		btnAvg = new JButton("Yêu Cầu 4: Tính Trung Bình");
		btnAvg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAvg.setBounds(496, 57, 226, 39);
		btnAvg.setActionCommand("Yc4");
		panel_3.add(btnAvg);
		
		btnKhSXLN = new JButton("Yêu Cầu 6: Tìm Khách Hàng Hộ SX Lớn Nhất");
		btnKhSXLN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnKhSXLN.setBounds(388, 106, 334, 39);
		btnKhSXLN.setActionCommand("Yc6");
		panel_3.add(btnKhSXLN);
		
		txtMaKH = new JTextField();
		txtMaKH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMaKH.setText("mã khách hàng ");
		txtMaKH.setBounds(260, 10, 226, 39);
		panel_3.add(txtMaKH);
		txtMaKH.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Trung Bình Thành Tiền: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(260, 72, 145, 13);
		panel_3.add(lblNewLabel_1);
		
		lblAvg = new JLabel("");
		lblAvg.setBounds(399, 72, 87, 13);
		panel_3.add(lblAvg);
		
		JPanel panelManager = new JPanel();
		tabbedPane.addTab("Quản Lý Khách Hàng", null, panelManager, null);
	}
}

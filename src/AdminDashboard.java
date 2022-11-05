import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Create the frame.
	 */
	public AdminDashboard(JFrame frame) {
		this.frame = frame;
		
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 800);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JButton btnAdd = new JButton("Add User");
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 16));
		btnAdd.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/icons8-add-user-55.png")));
		btnAdd.setBounds(25, 25, 194, 71);
		btnAdd.addActionListener(event -> btnAddClick(event));
		contentPane.add(btnAdd);
		
		JButton btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/icons8-remove-48.png")));
		btnDeleteUser.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDeleteUser.setBounds(240, 25, 194, 71);
		btnDeleteUser.addActionListener(event -> btnDeleteClick(event));
		contentPane.add(btnDeleteUser);
		
		JButton btnSale = new JButton("Sale");
		btnSale.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/icons8-store-front-100.png")));
		btnSale.setFont(new Font("Verdana", Font.BOLD, 16));
		btnSale.setBounds(452, 25, 194, 71);
		btnSale.addActionListener(event -> btnSaleClick(event));
		contentPane.add(btnSale);
		
		JButton btnSummary = new JButton("Summary");
		btnSummary.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/icons8-graphs-64.png")));
		btnSummary.setFont(new Font("Verdana", Font.BOLD, 16));
		btnSummary.setBounds(672, 25, 194, 71);
		btnSummary.addActionListener(event -> btnSummaryClick(event));
		contentPane.add(btnSummary);
		
		JButton btnBack = new JButton("Back");
		btnBack.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/icons8-back-arrow-100.png")));
		btnBack.setFont(new Font("Verdana", Font.BOLD, 16));
		btnBack.setBounds(1028, 25, 194, 71);
		btnBack.addActionListener(event -> btnBackClick(event));
		contentPane.add(btnBack);
	}

	public void btnAddClick(ActionEvent event) {
		AddUser panel = new AddUser();
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setBounds(25, 100, 700, 500);
		contentPane.add(panel);
	}
	
	public void btnDeleteClick(ActionEvent event) {
		
	}
	
	public void btnSaleClick(ActionEvent event) {
		
	}
	
	public void btnSummaryClick(ActionEvent event) {
		
	}
	
	public void btnBackClick(ActionEvent event) {
		this.setVisible(false);
		frame.setVisible(true);
	}
	
	private void addPanel(JPanel panel) {
		
	}
}

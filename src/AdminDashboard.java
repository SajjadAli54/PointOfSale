import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.ComponentOrientation;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtScanCode;
	private JTextField txtQty;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public AdminDashboard(JFrame frame) {
		this.frame = frame;
		
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 622, 501);
		
		
		
		JButton btnScanCode = new JButton("Scan barcode now");
		btnScanCode.setForeground(new Color(255, 255, 255));
		btnScanCode.setBackground(new Color(0, 0, 205));
		btnScanCode.setFont(new Font("Verdana", Font.BOLD, 16));
		btnScanCode.setBounds(10, 11, 216, 29);
		btnScanCode.addActionListener(event -> btnAddClick(event));
		panel.setLayout(null);
		panel.add(btnScanCode);
		
		JButton btnQty = new JButton("Quantity");
		btnQty.setBackground(new Color(255, 127, 80));
		btnQty.setForeground(new Color(255, 255, 255));
		btnQty.setFont(new Font("Verdana", Font.BOLD, 16));
		btnQty.setBounds(236, 11, 134, 29);
		btnQty.addActionListener(event -> btnDeleteClick(event));
		panel.add(btnQty);
		
		txtScanCode = new JTextField();
		txtScanCode.setBounds(10, 51, 216, 29);
		panel.add(txtScanCode);
		txtScanCode.setColumns(10);
		
		txtQty = new JTextField();
		txtQty.setColumns(10);
		txtQty.setBounds(236, 51, 134, 29);
		panel.add(txtQty);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(169, 169, 169));
		btnSearch.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/search.png")));
		btnSearch.setFont(new Font("Verdana", Font.BOLD, 16));
		btnSearch.setBounds(429, 11, 186, 90);
		panel.add(btnSearch);
		
		String[] cols = new String[] {" ", "#", "item info", "Price", "Quantity"};
		table = new JTable(new DefaultTableModel(cols, 0));
		table.setFont(new Font("Verdana", Font.PLAIN, 14));
//		table.getColumnModel().getColumn(0).setPreferredWidth(5);
//		table.getColumnModel().getColumn(1).setPreferredWidth(5);
//		table.getColumnModel().getColumn(2).setPreferredWidth(15);
//		table.getColumnModel().getColumn(3).setPreferredWidth(5);
//		table.getColumnModel().getColumn(4).setPreferredWidth(5);
		
		DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
		cellRenderer.setHorizontalAlignment(JLabel.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setViewportView(table);
		scrollPane.setBounds(10, 110, 604, 387);
		panel.add(scrollPane);
		
		contentPane.add(panel);
		setContentPane(contentPane);
		
		JPanel panelPayDetails = new JPanel();
		panelPayDetails.setBackground(Color.BLACK);
		panelPayDetails.setBounds(642, 11, 614, 114);
		contentPane.add(panelPayDetails);
		panelPayDetails.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sub Total");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(10, 11, 118, 27);
		panelPayDetails.add(lblNewLabel);
		
		JLabel lblSubTotal = new JLabel("$ 0.00");
		lblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubTotal.setForeground(Color.GREEN);
		lblSubTotal.setFont(new Font("Verdana", Font.BOLD, 14));
		lblSubTotal.setBounds(454, 11, 118, 27);
		panelPayDetails.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("$ 0.00");
		lblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTax.setForeground(Color.GREEN);
		lblTax.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTax.setBounds(454, 49, 118, 27);
		panelPayDetails.add(lblTax);
		
		JLabel label = new JLabel("Tax");
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Verdana", Font.BOLD, 14));
		label.setBounds(10, 49, 118, 27);
		panelPayDetails.add(label);
		
		JLabel lblTotal = new JLabel("$ 0.00");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setForeground(Color.GREEN);
		lblTotal.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTotal.setBounds(454, 76, 118, 27);
		panelPayDetails.add(lblTotal);
		
		JLabel label2 = new JLabel("Total");
		label2.setForeground(Color.GREEN);
		label2.setFont(new Font("Verdana", Font.BOLD, 16));
		label2.setBounds(10, 76, 118, 27);
		panelPayDetails.add(label2);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBackground(new Color(50, 205, 50));
		btnPay.setFont(new Font("Verdana", Font.BOLD, 16));
		btnPay.setBounds(642, 138, 614, 56);
		contentPane.add(btnPay);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setForeground(new Color(255, 255, 255));
		btnInvoice.setBackground(new Color(255, 99, 71));
		btnInvoice.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInvoice.setFont(new Font("Verdana", Font.BOLD, 16));
		btnInvoice.setBounds(642, 211, 138, 76);
		contentPane.add(btnInvoice);
		
		JButton btnFetch = new JButton("Fetch");
		btnFetch.setForeground(new Color(255, 255, 255));
		btnFetch.setBackground(new Color(255, 215, 0));
		btnFetch.setFont(new Font("Verdana", Font.BOLD, 16));
		btnFetch.setBounds(786, 211, 138, 76);
		contentPane.add(btnFetch);
		
		JButton btnLookup = new JButton("Look up");
		btnLookup.setForeground(new Color(255, 255, 255));
		btnLookup.setBackground(new Color(255, 165, 0));
		btnLookup.setFont(new Font("Verdana", Font.BOLD, 16));
		btnLookup.setBounds(934, 211, 138, 76);
		contentPane.add(btnLookup);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.setForeground(new Color(255, 255, 255));
		btnOptions.setBackground(new Color(30, 144, 255));
		btnOptions.setMnemonic('O');
		btnOptions.setFont(new Font("Verdana", Font.BOLD, 16));
		btnOptions.setBounds(1086, 211, 170, 76);
		contentPane.add(btnOptions);
		
		JButton btnCash = new JButton("Cash");
		btnCash.setBackground(new Color(85, 107, 47));
		btnCash.setForeground(new Color(255, 255, 255));
		btnCash.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/dollar.png")));
		btnCash.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCash.setFont(new Font("Verdana", Font.BOLD, 16));
		btnCash.setBounds(642, 298, 138, 76);
		contentPane.add(btnCash);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBackground(new Color(85, 107, 47));
		btnCheck.setForeground(new Color(255, 255, 255));
		btnCheck.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/checkbook.png")));
		btnCheck.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCheck.setFont(new Font("Verdana", Font.BOLD, 16));
		btnCheck.setBounds(786, 298, 138, 76);
		contentPane.add(btnCheck);
		
		JButton btnCredit = new JButton("Credit");
		btnCredit.setBackground(new Color(85, 107, 47));
		btnCredit.setForeground(new Color(255, 255, 255));
		btnCredit.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/credit-cards.png")));
		btnCredit.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCredit.setFont(new Font("Verdana", Font.BOLD, 16));
		btnCredit.setBounds(934, 298, 138, 76);
		contentPane.add(btnCredit);
		
		JButton btnAccounts = new JButton("Accounts");
		btnAccounts.setBackground(new Color(85, 107, 47));
		btnAccounts.setForeground(new Color(255, 255, 255));
		btnAccounts.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/user.png")));
		btnAccounts.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAccounts.setMnemonic('O');
		btnAccounts.setFont(new Font("Verdana", Font.BOLD, 16));
		btnAccounts.setBounds(1086, 298, 170, 76);
		contentPane.add(btnAccounts);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/remove.png")));
		btnDelete.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDelete.setBackground(new Color(30, 144, 255));
		btnDelete.setBounds(10, 515, 120, 76);
		contentPane.add(btnDelete);
		
		JButton btnDiscount = new JButton("Discount");
		btnDiscount.setHorizontalAlignment(SwingConstants.LEADING);
		btnDiscount.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/price-tag.png")));
		btnDiscount.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnDiscount.setForeground(Color.WHITE);
		btnDiscount.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDiscount.setBackground(new Color(30, 144, 255));
		btnDiscount.setBounds(129, 515, 117, 76);
		contentPane.add(btnDiscount);
		
		JButton btnDiscount_1 = new JButton("+");
		btnDiscount_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDiscount_1.setForeground(Color.WHITE);
		btnDiscount_1.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDiscount_1.setBackground(new Color(30, 144, 255));
		btnDiscount_1.setBounds(284, 514, 48, 76);
		contentPane.add(btnDiscount_1);
		
		JButton btnDiscount_1_1 = new JButton("-");
		btnDiscount_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDiscount_1_1.setForeground(Color.WHITE);
		btnDiscount_1_1.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDiscount_1_1.setBackground(new Color(30, 144, 255));
		btnDiscount_1_1.setBounds(332, 514, 43, 76);
		contentPane.add(btnDiscount_1_1);
		
		JButton btnQuanCahnge = new JButton("QUAN CHANGE");
		btnQuanCahnge.setAutoscrolls(true);
		btnQuanCahnge.setHorizontalTextPosition(SwingConstants.CENTER);
		btnQuanCahnge.setForeground(Color.WHITE);
		btnQuanCahnge.setFont(new Font("Verdana", Font.BOLD, 16));
		btnQuanCahnge.setBackground(new Color(30, 144, 255));
		btnQuanCahnge.setBounds(398, 515, 120, 76);
		contentPane.add(btnQuanCahnge);
		
		JButton btnPriceChange = new JButton("PRICE CHANGE");
		btnPriceChange.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPriceChange.setForeground(Color.WHITE);
		btnPriceChange.setFont(new Font("Verdana", Font.BOLD, 16));
		btnPriceChange.setBackground(new Color(30, 144, 255));
		btnPriceChange.setBounds(517, 515, 120, 76);
		contentPane.add(btnPriceChange);
	}

	public void btnAddClick(ActionEvent event) {
		AddUser panel = new AddUser();
		addPanel(panel);
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
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setBounds(25, 100, 400, 400);
		contentPane.add(panel);
		
		this.pack();
		setSize(1400, 800);
	}
}

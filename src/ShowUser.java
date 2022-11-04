import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ShowUser extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowUser frame = new ShowUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShowUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setFont(new Font("Verdana", Font.BOLD, 16));
		btnAddUser.setBounds(26, 40, 229, 43);
		contentPane.add(btnAddUser);
		
		JButton btnManagerUsers = new JButton("Manager Users");
		btnManagerUsers.setEnabled(false);
		btnManagerUsers.setFont(new Font("Verdana", Font.BOLD, 16));
		btnManagerUsers.setBounds(271, 40, 229, 43);
		contentPane.add(btnManagerUsers);
		
		JButton btnDeleteUsers = new JButton("Delete Users");
		btnDeleteUsers.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDeleteUsers.setBounds(533, 40, 229, 43);
		contentPane.add(btnDeleteUsers);
		
		Object data[][] = new Object[][] {
			{"Sajjad Ali", "sajjad@gmail.com", "Cashier"},
			{"Sajan Ali", "sajan@gmail.com", "Seller"},
			{"Sahir", "sahir@gmail.com", "Collector"}
		};
		String cols[] = new String[] {"Name", "Email", "Designation"};
		
		table = new JTable(new DefaultTableModel(data, cols) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setFont(new Font("Verdana", Font.PLAIN, 14));
		table.setFillsViewportHeight(true);
		table.setBounds(26, 150, 600, 200);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(56, 136, 600, 200);
		contentPane.add(scrollPane);
		
		
		
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtDesignation;
	private JButton btnAddUser;
	private JButton btnManagerUsers;
	private JButton btnDeleteUsers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser frame = new AddUser();
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
	public AddUser() {
		setTitle("Admin Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblName.setBounds(135, 105, 49, 14);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtName.setBounds(135, 133, 229, 31);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblEmail.setBounds(135, 184, 49, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(135, 212, 229, 31);
		contentPane.add(txtEmail);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblDesignation.setBounds(135, 266, 117, 17);
		contentPane.add(lblDesignation);
		
		txtDesignation = new JTextField();
		txtDesignation.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDesignation.setColumns(10);
		txtDesignation.setBounds(135, 294, 229, 31);
		contentPane.add(txtDesignation);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 16));
		btnAdd.setBounds(135, 377, 229, 43);
		contentPane.add(btnAdd);
		
		btnAddUser = new JButton("Add User");
		btnAddUser.setEnabled(false);
		btnAddUser.setFont(new Font("Verdana", Font.BOLD, 16));
		btnAddUser.setBounds(23, 36, 229, 43);
		contentPane.add(btnAddUser);
		
		btnManagerUsers = new JButton("Manager Users");
		btnManagerUsers.setFont(new Font("Verdana", Font.BOLD, 16));
		btnManagerUsers.setBounds(268, 36, 229, 43);
		contentPane.add(btnManagerUsers);
		
		btnDeleteUsers = new JButton("Delete Users");
		btnDeleteUsers.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDeleteUsers.setBounds(530, 36, 229, 43);
		contentPane.add(btnDeleteUsers);
	}
}

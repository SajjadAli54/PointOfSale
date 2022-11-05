import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AddUser extends JPanel {

	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtDesignation;

	
	public AddUser() {
		
		setLayout(null);
//		setSize(300, 300);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblName.setBounds(10, 30, 49, 15);
		add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtName.setBounds(10, 55, 229, 30);
		add(txtName);
		txtName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblEmail.setBounds(10, 100, 49, 15);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 125, 229, 30);
		add(txtEmail);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblDesignation.setBounds(10, 170, 117, 15);
		add(lblDesignation);
		
		txtDesignation = new JTextField();
		txtDesignation.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDesignation.setColumns(10);
		txtDesignation.setBounds(10, 195, 229, 30);
		add(txtDesignation);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 16));
		btnAdd.setBounds(10, 260, 229, 50);
		btnAdd.setIcon(new ImageIcon(AdminDashboard.class.getResource("/my/icons8-add-user-55.png")));
		add(btnAdd);
		
	}
}

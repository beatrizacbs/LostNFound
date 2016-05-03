package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TelaAtualizarCliente {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtualizarCliente window = new TelaAtualizarCliente();
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
	public TelaAtualizarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 255, 153));
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.setBounds(100, 100, 582, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNovoNome = new JLabel("Novo nome:");
		lblNovoNome.setForeground(Color.DARK_GRAY);
		lblNovoNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNovoNome.setBounds(155, 133, 90, 15);
		frame.getContentPane().add(lblNovoNome);
		
		textField = new JTextField();
		textField.setBounds(245, 131, 189, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNovoEmail = new JLabel("Novo email:");
		lblNovoEmail.setForeground(Color.DARK_GRAY);
		lblNovoEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNovoEmail.setBounds(155, 161, 105, 15);
		frame.getContentPane().add(lblNovoEmail);
		
		JLabel lblNovoTelefone = new JLabel("Novo telefone:");
		lblNovoTelefone.setForeground(Color.DARK_GRAY);
		lblNovoTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNovoTelefone.setBounds(155, 187, 102, 15);
		frame.getContentPane().add(lblNovoTelefone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(245, 185, 189, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(245, 157, 189, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNovoCpf = new JLabel("Novo CPF:");
		lblNovoCpf.setForeground(Color.DARK_GRAY);
		lblNovoCpf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNovoCpf.setBounds(155, 213, 80, 15);
		frame.getContentPane().add(lblNovoCpf);
		
		textField_3 = new JTextField();
		textField_3.setBounds(244, 213, 190, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnDone = new JButton("Finalizar");
		btnDone.setForeground(new Color(0, 0, 0));
		btnDone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnDone.setBounds(275, 266, 128, 25);
		frame.getContentPane().add(btnDone);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblA = new JLabel("ATUALIZAR CADASTRO CLIENTE");
		lblA.setForeground(Color.DARK_GRAY);
		lblA.setBounds(145, 16, 294, 35);
		panel.add(lblA);
		lblA.setFont(new Font("Segoe UI", Font.BOLD, 18));
	}

}

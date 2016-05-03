package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 450);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 153));
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastro = new JLabel("CADASTRO USU\u00C1RIO");
		lblCadastro.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblCadastro.setBounds(198, 21, 188, 34);
		panel.add(lblCadastro);
		
		textField = new JTextField();
		textField.setBounds(93, 155, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNome.setBounds(48, 157, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("CPF:");
		lblSenha.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha.setBounds(58, 217, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(359, 155, 168, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setBounds(48, 188, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 186, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogradouro.setBounds(282, 185, 67, 20);
		contentPane.add(lblLogradouro);
		
		textField_3 = new JTextField();
		textField_3.setBounds(359, 186, 168, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(288, 157, 61, 14);
		contentPane.add(lblTelefone);
		
		textField_4 = new JTextField();
		textField_4.setBounds(93, 215, 153, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(359, 215, 168, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblComplementp = new JLabel("Complemento:");
		lblComplementp.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplementp.setBounds(268, 218, 94, 14);
		contentPane.add(lblComplementp);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNumero.setBounds(300, 243, 55, 14);
		contentPane.add(lblNumero);
		
		textField_6 = new JTextField();
		textField_6.setBounds(359, 243, 168, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(93, 243, 153, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogin.setBounds(48, 242, 46, 20);
		contentPane.add(lblLogin);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha_1.setBounds(48, 273, 46, 14);
		contentPane.add(lblSenha_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(93, 271, 153, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
	}
}

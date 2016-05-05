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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

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
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

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
		lblCadastro.setForeground(Color.DARK_GRAY);
		lblCadastro.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblCadastro.setBounds(198, 21, 188, 34);
		panel.add(lblCadastro);
		
		textField = new JTextField();
		textField.setBounds(93, 137, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.DARK_GRAY);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNome.setBounds(48, 139, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("CPF:");
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha.setBounds(65, 201, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 292, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setBounds(55, 170, 39, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 168, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setForeground(Color.DARK_GRAY);
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogradouro.setBounds(282, 137, 67, 20);
		contentPane.add(lblLogradouro);
		
		textField_3 = new JTextField();
		textField_3.setBounds(359, 137, 168, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.DARK_GRAY);
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(33, 294, 61, 14);
		contentPane.add(lblTelefone);
		
		textField_4 = new JTextField();
		textField_4.setBounds(93, 199, 153, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(359, 168, 168, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblComplementp = new JLabel("Complemento:");
		lblComplementp.setForeground(Color.DARK_GRAY);
		lblComplementp.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplementp.setBounds(267, 170, 82, 14);
		contentPane.add(lblComplementp);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setForeground(Color.DARK_GRAY);
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNumero.setBounds(299, 201, 55, 14);
		contentPane.add(lblNumero);
		
		textField_6 = new JTextField();
		textField_6.setBounds(359, 199, 168, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(93, 230, 153, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogin.setBounds(55, 229, 39, 20);
		contentPane.add(lblLogin);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setForeground(Color.DARK_GRAY);
		lblSenha_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha_1.setBounds(48, 263, 39, 14);
		contentPane.add(lblSenha_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(93, 261, 153, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(Color.DARK_GRAY);
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(395, 323, 46, 14);
		contentPane.add(lblCep);
		
		textField_9 = new JTextField();
		textField_9.setBounds(359, 230, 168, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(359, 261, 168, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(359, 292, 168, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(Color.DARK_GRAY);
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(310, 232, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.DARK_GRAY);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(308, 263, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstadod = new JLabel("Estado:");
		lblEstadod.setForeground(Color.DARK_GRAY);
		lblEstadod.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEstadod.setBounds(308, 294, 46, 14);
		contentPane.add(lblEstadod);
		
		textField_12 = new JTextField();
		textField_12.setBounds(427, 321, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnFinalizar.setBounds(290, 364, 120, 23);
		contentPane.add(btnFinalizar);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//System.exit(0);
				// esse omando fecha tudo. Quero só fechar a janela atual
			}
		});
		btnSair.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnSair.setBounds(172, 364, 108, 23);
		contentPane.add(btnSair);
		btnSair.setForeground(SystemColor.desktop);
	}
}

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
		contentPane.setBackground(new Color(0, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 153));
		panel.setBounds(153, 37, 241, 35);
		contentPane.add(panel);
		
		JLabel lblNovoCadastro = new JLabel("Novo Cadastro");
		lblNovoCadastro.setForeground(Color.BLACK);
		lblNovoCadastro.setFont(new Font("Purisa", Font.BOLD, 14));
		panel.add(lblNovoCadastro);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 153));
		panel_1.setBounds(35, 84, 470, 354);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Purisa", Font.BOLD, 12));
		lblNome.setBounds(12, 12, 45, 15);
		panel_1.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Purisa", Font.BOLD, 12));
		lblEmail.setBounds(12, 33, 70, 15);
		panel_1.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setFont(new Font("Purisa", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 54, 70, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Purisa", Font.BOLD, 12));
		lblCpf.setBounds(12, 75, 70, 15);
		panel_1.add(lblCpf);
		
		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setFont(new Font("Purisa", Font.BOLD, 12));
		lblNewLabel_1.setBounds(12, 96, 70, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Purisa", Font.BOLD, 12));
		lblSenha.setBounds(12, 117, 70, 15);
		panel_1.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(188, 10, 202, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 31, 202, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 52, 202, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(188, 73, 202, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(188, 94, 202, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(188, 115, 202, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Purisa", Font.BOLD, 12));
		lblLogradouro.setBounds(12, 138, 88, 15);
		panel_1.add(lblLogradouro);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Purisa", Font.BOLD, 12));
		lblComplemento.setBounds(12, 159, 95, 15);
		panel_1.add(lblComplemento);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setFont(new Font("Purisa", Font.BOLD, 12));
		lblNmero.setBounds(12, 180, 70, 15);
		panel_1.add(lblNmero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Purisa", Font.BOLD, 12));
		lblBairro.setBounds(12, 222, 70, 15);
		panel_1.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Purisa", Font.BOLD, 12));
		lblCidade.setBounds(12, 243, 70, 15);
		panel_1.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Purisa", Font.BOLD, 12));
		lblEstado.setBounds(12, 264, 70, 15);
		panel_1.add(lblEstado);
		
		JLabel lblNewLabel_2 = new JLabel("CEP:");
		lblNewLabel_2.setFont(new Font("Purisa", Font.BOLD, 12));
		lblNewLabel_2.setBounds(12, 201, 70, 15);
		panel_1.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(188, 136, 202, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(188, 157, 202, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(188, 178, 202, 19);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(188, 199, 202, 19);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(188, 220, 202, 19);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(188, 241, 202, 19);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(188, 262, 202, 19);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(188, 293, 88, 25);
		panel_1.add(btnSalvar);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setBounds(296, 293, 88, 25);
		panel_1.add(btnNewButton);
	}
}

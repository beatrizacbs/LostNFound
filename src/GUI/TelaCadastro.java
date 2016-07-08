package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import LF.Excecoes.AlgoEstaFaltandoException;
import LF.Excecoes.UsuarioInvalidoException;
import LF.Fachada.Fachada;

public class TelaCadastro extends JFrame {

	private Fachada fachada = Fachada.getInstance();
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoTelefone;
	private JTextField campoEmail;
	private JTextField campoLogradouro;
	private JTextField campoCpf;
	private JTextField campoComplemento;
	private JTextField campoNumero;
	private JTextField campoLogin;
	private JTextField campoSenha;
	private JTextField campoBairro;
	private JTextField campoCidade;
	private JTextField campoEstado;
	private JTextField campoCep;

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
		setBounds(100, 100, 676, 530);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 153));
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 664, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastro = new JLabel("CADASTRO CLIENTE");
		lblCadastro.setForeground(Color.DARK_GRAY);
		lblCadastro.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblCadastro.setBounds(227, 12, 214, 34);
		panel.add(lblCadastro);
		
		campoNome = new JTextField();
		campoNome.setBounds(108, 137, 138, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("CPF:");
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha.setBounds(34, 201, 46, 14);
		contentPane.add(lblSenha);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(108, 292, 138, 20);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setBounds(34, 165, 61, 14);
		contentPane.add(lblEmail);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(108, 168, 138, 20);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		campoLogradouro = new JTextField();
		campoLogradouro.setBounds(443, 137, 168, 20);
		contentPane.add(campoLogradouro);
		campoLogradouro.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.DARK_GRAY);
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblTelefone.setBounds(34, 294, 82, 14);
		contentPane.add(lblTelefone);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(108, 199, 138, 20);
		contentPane.add(campoCpf);
		campoCpf.setColumns(10);
		
		campoComplemento = new JTextField();
		campoComplemento.setBounds(443, 168, 168, 20);
		contentPane.add(campoComplemento);
		campoComplemento.setColumns(10);
		
		JLabel lblComplementp = new JLabel("Complemento:");
		lblComplementp.setForeground(Color.DARK_GRAY);
		lblComplementp.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplementp.setBounds(343, 170, 110, 14);
		contentPane.add(lblComplementp);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setForeground(Color.DARK_GRAY);
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNumero.setBounds(343, 201, 78, 14);
		contentPane.add(lblNumero);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(443, 199, 168, 20);
		contentPane.add(campoNumero);
		campoNumero.setColumns(10);
		
		campoLogin = new JTextField();
		campoLogin.setBounds(108, 230, 138, 20);
		contentPane.add(campoLogin);
		campoLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogin.setBounds(34, 229, 61, 20);
		contentPane.add(lblLogin);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setForeground(Color.DARK_GRAY);
		lblSenha_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha_1.setBounds(34, 261, 54, 21);
		contentPane.add(lblSenha_1);
		
		campoSenha = new JTextField();
		campoSenha.setBounds(108, 261, 138, 20);
		contentPane.add(campoSenha);
		campoSenha.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(Color.DARK_GRAY);
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCep.setBounds(343, 323, 46, 14);
		contentPane.add(lblCep);
		
		campoBairro = new JTextField();
		campoBairro.setBounds(443, 231, 168, 20);
		contentPane.add(campoBairro);
		campoBairro.setColumns(10);
		
		campoCidade = new JTextField();
		campoCidade.setBounds(443, 261, 168, 20);
		contentPane.add(campoCidade);
		campoCidade.setColumns(10);
		
		campoEstado = new JTextField();
		campoEstado.setBounds(443, 292, 168, 20);
		contentPane.add(campoEstado);
		campoEstado.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(Color.DARK_GRAY);
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblBairro.setBounds(343, 232, 67, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.DARK_GRAY);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(343, 263, 69, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstadod = new JLabel("Estado:");
		lblEstadod.setForeground(Color.DARK_GRAY);
		lblEstadod.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEstadod.setBounds(343, 294, 78, 14);
		contentPane.add(lblEstadod);
		
		campoCep = new JTextField();
		campoCep.setBounds(443, 321, 168, 20);
		contentPane.add(campoCep);
		campoCep.setColumns(10);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("o que tem no nome:");
					fachada.inserirUsuario(campoNome.getText(), campoCpf.getText(), campoEmail.getText(), null, campoTelefone.getText(), 
							campoLogin.getText(), campoSenha.getText(), campoLogradouro.getText(), campoBairro.getText(), 
							campoCep.getText(), campoNumero.getText(), campoComplemento.getText(), campoCidade.getText(), campoEstado.getText());
					//TA DANDO ERRO AQUI PORQUE TA CADASTRANDO DE QUALQUER JEITO
					JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
					
					TelaInicial windowTelaInicial = new TelaInicial();
					windowTelaInicial.setVisible(true);
					dispose();
					
				} catch (AlgoEstaFaltandoException e1) {
					
					JOptionPane.showMessageDialog(null, "Falta de informacoes");
					
				}catch(UsuarioInvalidoException o)
				{
					JOptionPane.showMessageDialog(null, "usuario invalido!");
				}
				
			}
		});
		btnFinalizar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnFinalizar.setBounds(502, 418, 120, 23);
		contentPane.add(btnFinalizar);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicial windowTelaInicial = new TelaInicial();
				windowTelaInicial.setVisible(true);
				dispose();
			}
		});
		btnSair.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSair.setBounds(358, 418, 108, 23);
		contentPane.add(btnSair);
		btnSair.setForeground(SystemColor.desktop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(23, 114, 255, 235);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 24, 46, 14);
		panel_1.add(lblNome);
		lblNome.setForeground(Color.DARK_GRAY);
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(314, 114, 324, 269);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(29, 24, 88, 15);
		panel_2.add(lblLogradouro);
		lblLogradouro.setForeground(Color.DARK_GRAY);
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 12));
	}
	
}
package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class TelaAtualizarCliente {

	private JFrame frame;
	private JTextField campoCpf;
	private JTextField campoCep;
	private JTextField campoLogrdouro;
	private JTextField campoBairro;
	private JTextField campoEmail;
	private JTextField campoNome;
	private JTextField campoTelefone;
	private JTextField campoEstado;
	private JTextField campoCidade;
	private JTextField campoNumero;
	private JTextField campoComplemento;
	private JTextField campoLogin;
	private JTextField campoSenha;

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
		frame.setBounds(100, 100, 779, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDone = new JButton("Finalizar");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCliente windowCliente = new TelaCliente();
				windowCliente.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnDone.setForeground(new Color(0, 0, 0));
		btnDone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnDone.setBounds(600, 402, 128, 25);
		frame.getContentPane().add(btnDone);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 767, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblA = new JLabel("ATUALIZAR CADASTRO CLIENTE");
		lblA.setForeground(Color.DARK_GRAY);
		lblA.setBounds(184, 12, 361, 35);
		panel.add(lblA);
		lblA.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(35, 98, 300, 270);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(12, 213, 200, 25);
		panel_1.add(lblBairro);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(12, 182, 200, 19);
		panel_1.add(lblCep);
		
		JLabel lblNewLabel = new JLabel("Logradouro:");
		lblNewLabel.setBounds(12, 145, 200, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblNovoTelefone = new JLabel("Telefone:");
		lblNovoTelefone.setBounds(12, 118, 105, 15);
		panel_1.add(lblNovoTelefone);
		lblNovoTelefone.setForeground(Color.DARK_GRAY);
		lblNovoTelefone.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblNovoCpf = new JLabel("CPF:");
		lblNovoCpf.setBounds(12, 91, 80, 15);
		panel_1.add(lblNovoCpf);
		lblNovoCpf.setForeground(Color.DARK_GRAY);
		lblNovoCpf.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblNovoEmail = new JLabel("Email:");
		lblNovoEmail.setBounds(12, 54, 105, 15);
		panel_1.add(lblNovoEmail);
		lblNovoEmail.setForeground(Color.DARK_GRAY);
		lblNovoEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblNovoNome = new JLabel("Nome:");
		lblNovoNome.setBounds(12, 27, 90, 15);
		panel_1.add(lblNovoNome);
		lblNovoNome.setForeground(Color.DARK_GRAY);
		lblNovoNome.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		campoBairro = new JTextField();
		campoBairro.setBounds(118, 216, 171, 19);
		panel_1.add(campoBairro);
		campoBairro.setColumns(10);
		
		campoCep = new JTextField();
		campoCep.setBounds(118, 182, 171, 19);
		panel_1.add(campoCep);
		campoCep.setColumns(10);
		
		campoLogrdouro = new JTextField();
		campoLogrdouro.setBounds(118, 148, 171, 19);
		panel_1.add(campoLogrdouro);
		campoLogrdouro.setColumns(10);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(118, 114, 171, 19);
		panel_1.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(118, 87, 171, 19);
		panel_1.add(campoCpf);
		campoCpf.setColumns(10);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(118, 56, 171, 19);
		panel_1.add(campoEmail);
		campoEmail.setColumns(10);
		
		campoNome = new JTextField();
		campoNome.setBounds(118, 25, 171, 19);
		panel_1.add(campoNome);
		campoNome.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "", TitledBorder.LEADING, TitledBorder.TOP, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(396, 98, 347, 270);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(12, 207, 70, 15);
		panel_2.add(lblSenha);
		
		campoSenha = new JTextField();
		campoSenha.setBounds(134, 205, 206, 19);
		panel_2.add(campoSenha);
		campoSenha.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(12, 167, 70, 15);
		panel_2.add(lblLogin);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(12, 117, 200, 25);
		panel_2.add(lblComplemento);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setBounds(12, 80, 200, 25);
		panel_2.add(lblNmero);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 43, 200, 25);
		panel_2.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(12, 12, 200, 19);
		panel_2.add(lblEstado);
		
		campoLogin = new JTextField();
		campoLogin.setBounds(134, 165, 206, 19);
		panel_2.add(campoLogin);
		campoLogin.setColumns(10);
		
		campoComplemento = new JTextField();
		campoComplemento.setBounds(134, 120, 206, 19);
		panel_2.add(campoComplemento);
		campoComplemento.setColumns(10);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(134, 83, 206, 19);
		panel_2.add(campoNumero);
		campoNumero.setColumns(10);
		
		campoCidade = new JTextField();
		campoCidade.setBounds(134, 49, 206, 19);
		panel_2.add(campoCidade);
		campoCidade.setColumns(10);
		
		campoEstado = new JTextField();
		campoEstado.setBounds(134, 12, 206, 19);
		panel_2.add(campoEstado);
		campoEstado.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCliente windowTelaCliente = new TelaCliente();
				windowTelaCliente.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setBounds(459, 402, 117, 25);
		frame.getContentPane().add(btnVoltar);
	}

	public JFrame getFrame() {
		return frame;
	}
	
}
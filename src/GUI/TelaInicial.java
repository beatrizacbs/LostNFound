package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import LF.Fachada.Fachada;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Fachada fachada = Fachada.getInstance();
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
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
		
		JLabel lblCadastro = new JLabel("Lost & Found");
		lblCadastro.setForeground(Color.DARK_GRAY);
		lblCadastro.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblCadastro.setBounds(226, 11, 119, 34);
		panel.add(lblCadastro);
		
		JLabel lblTudoQueVoc = new JLabel("Tudo que voc\u00EA procura est\u00E1 aqui");
		lblTudoQueVoc.setBounds(207, 45, 176, 21);
		lblTudoQueVoc.setForeground(Color.DARK_GRAY);
		lblTudoQueVoc.setFont(new Font("Segoe UI", Font.BOLD, 10));
		panel.add(lblTudoQueVoc);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogin.setBounds(162, 150, 58, 20);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(217, 151, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setForeground(Color.DARK_GRAY);
		lblSenha_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSenha_1.setBounds(162, 195, 39, 14);
		contentPane.add(lblSenha_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 193, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnFinalizar = new JButton("Entrar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length() == 11)
				{
					// TODO: ele tem que procurar o cliente e verificar pra ver se bate com a senha, 
					//mas depois faço isso
					TelaCliente windowCli = new TelaCliente();
                    windowCli.getFrame().setVisible(true);
					
				}
				else if(textField.getText().length() == 4)
				{
					TelaAdm windowAdm = new TelaAdm();
					windowAdm.getFrame().setVisible(true);
				}
			}
		});
		btnFinalizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnFinalizar.setBounds(162, 234, 102, 20);
		contentPane.add(btnFinalizar);
		
		JButton btnNovoCadastro = new JButton("Novo Cadastro");
		btnNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastro frame = new TelaCadastro();
                frame.setVisible(true);
                // TODO: tem que arrumar um jeito de fechar a janela enterior quando abrir uma nova
			}
		});
		btnNovoCadastro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNovoCadastro.setBounds(274, 233, 129, 23);
		contentPane.add(btnNovoCadastro);
		
	}
	
	
}

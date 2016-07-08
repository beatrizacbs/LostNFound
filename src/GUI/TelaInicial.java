package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

import LF.Administrador.Administrador;
import LF.Cliente.Cliente;
import LF.Excecoes.UsuarioInexistenteException;
import LF.Fachada.Fachada;
import LF.Usuario.Usuario;

import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private Fachada fachada = Fachada.getInstance();
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
		setBounds(100, 100, 796, 528);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 153));
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 796, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Lost & Found");
		lblCadastro.setForeground(Color.DARK_GRAY);
		lblCadastro.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCadastro.setBounds(306, 12, 192, 34);
		panel.add(lblCadastro);
		
		JLabel lblTudoQueVoc = new JLabel("Tudo que voc\u00EA procura est\u00E1 aqui");
		lblTudoQueVoc.setBounds(245, 44, 358, 21);
		lblTudoQueVoc.setForeground(Color.DARK_GRAY);
		lblTudoQueVoc.setFont(new Font("Dialog", Font.BOLD, 14));
		panel.add(lblTudoQueVoc);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(211, 195, 336, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(54, 36, 58, 20);
		panel_1.add(lblLogin);
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("Segoe UI", Font.BOLD, 12));
	
		JButton btnNovoCadastro = new JButton("Novo Cadastro");
		btnNovoCadastro.setBounds(178, 133, 146, 23);
		panel_1.add(btnNovoCadastro);
		btnNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastro frame = new TelaCadastro();
                frame.setVisible(true);
                dispose();
                
			}
		});
		btnNovoCadastro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JButton btnFinalizar = new JButton("Entrar");
		btnFinalizar.setBounds(34, 133, 102, 23);
		panel_1.add(btnFinalizar);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(true) //verificar se login existe e é cliente
				{	 
					//Pega o login e a senha e depois será comparado na fachada se ele eh valido ou n
					String variavelLogin = textField.getText();
					String variavelSenha = passwordField.getText();
					
					//Chama o metodo verificador
					Usuario usuario;
					try {
						usuario = fachada.verificadorLogin(variavelLogin, variavelSenha);
						if(usuario instanceof Administrador){
							//Chama a tela de adm:
							TelaAdm windowAdm = new TelaAdm();
							windowAdm.getFrame().setVisible(true);
							dispose();
						} else if(usuario instanceof Cliente){
							//Chama a tela de cliente:
							TelaCliente windowCli = new TelaCliente();
		                    windowCli.getFrame().setVisible(true);
		                    // Esta linha abaixo destroi a janela que tava aberta
		                    dispose();
						}
					} catch (UsuarioInexistenteException e) {
						
						JOptionPane.showMessageDialog(null, "Login e senha Invalidos!");
					}
					
				}
			
				
			}
		});
		btnFinalizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setBounds(57, 80, 55, 14);
		panel_1.add(lblSenha_1);
		lblSenha_1.setForeground(Color.DARK_GRAY);
		lblSenha_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 78, 143, 20);
		panel_1.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(135, 37, 146, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
	}
}
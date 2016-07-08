package GUI;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TelaAdm {

	private JFrame frame;
	
	public JFrame getFrame()
	{
		return this.frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdm window = new TelaAdm();
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
	public TelaAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.getContentPane().setForeground(new Color(0, 255, 153));
		frame.setBounds(100, 100, 795, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnBemvindoAdministrador = new JTextPane();
		txtpnBemvindoAdministrador.setText("Bem-vindo, administrador!");
		txtpnBemvindoAdministrador.setBounds(322, 46, -139, 20);
		frame.getContentPane().add(txtpnBemvindoAdministrador);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 783, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMe = new JLabel("MENU ADMINISTRADOR");
		lblMe.setBounds(107, 11, 295, 44);
		panel.add(lblMe);
		lblMe.setForeground(Color.DARK_GRAY);
		lblMe.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblBemvindoAdministrador = new JLabel("Bem-vindo, administrador!");
		lblBemvindoAdministrador.setBounds(560, 12, 198, 12);
		panel.add(lblBemvindoAdministrador);
		lblBemvindoAdministrador.setForeground(Color.DARK_GRAY);
		lblBemvindoAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(151, 157, 495, 203);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBuscarObjeto = new JButton("Buscar Ocorrência");
		btnBuscarObjeto.setBounds(171, 73, 152, 24);
		panel_1.add(btnBuscarObjeto);
		btnBuscarObjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO: 
				TelaProcurarObj objeto = new TelaProcurarObj();
				objeto.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnBuscarObjeto.setForeground(Color.DARK_GRAY);
		btnBuscarObjeto.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JButton btnCadastrarObjeto = new JButton("Cadastrar Ocorrência");
		btnCadastrarObjeto.setBounds(154, 109, 183, 25);
		panel_1.add(btnCadastrarObjeto);
		btnCadastrarObjeto.setForeground(Color.DARK_GRAY);
		btnCadastrarObjeto.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JLabel lblCentralDeOcorrencia = new JLabel("Central de Ocorrências");
		lblCentralDeOcorrencia.setBounds(118, 22, 256, 25);
		panel_1.add(lblCentralDeOcorrencia);
		lblCentralDeOcorrencia.setForeground(new Color(51, 51, 51));
		lblCentralDeOcorrencia.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JButton btnAtualizarOcorrncia = new JButton("Atualizar Ocorrência");
		btnAtualizarOcorrncia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtualizarObj windowTelaAtualizarObj = new TelaAtualizarObj();
				windowTelaAtualizarObj.setVisible(true);
				frame.dispose();
			}
		});
		btnAtualizarOcorrncia.setBounds(143, 146, 206, 25);
		panel_1.add(btnAtualizarOcorrncia);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial windowTelaInicial = new TelaInicial();
				windowTelaInicial.setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setBounds(594, 446, 117, 25);
		frame.getContentPane().add(btnVoltar);
		btnCadastrarObjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCadastroOcorrencia windowTelaInicial = new TelaCadastroOcorrencia();
				windowTelaInicial.getFrame().setVisible(true);
				frame.dispose();
				
			}
		});
	}
	
	
}
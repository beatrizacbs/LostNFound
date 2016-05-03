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

public class TelaAdm {

	private JFrame frame;

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
		frame.setBounds(100, 100, 582, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrarObjeto = new JButton("Cadastrar Objeto");
		btnCadastrarObjeto.setForeground(Color.DARK_GRAY);
		btnCadastrarObjeto.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnCadastrarObjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroOcorrencia window = new TelaCadastroOcorrencia();
				window.getFrame().setVisible(true);
				
			}
		});
		btnCadastrarObjeto.setBounds(95, 201, 187, 25);
		frame.getContentPane().add(btnCadastrarObjeto);
		
		JButton btnObjetosEncontrados = new JButton("Dono encontrado");
		btnObjetosEncontrados.setForeground(Color.DARK_GRAY);
		btnObjetosEncontrados.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnObjetosEncontrados.setBounds(292, 201, 187, 25);
		frame.getContentPane().add(btnObjetosEncontrados);
		
		JButton btnObjetosProcurados = new JButton("Objetos procurados");
		btnObjetosProcurados.setForeground(Color.DARK_GRAY);
		btnObjetosProcurados.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnObjetosProcurados.setBounds(292, 237, 187, 25);
		frame.getContentPane().add(btnObjetosProcurados);
		
		JButton btnBuscarObjeto = new JButton("Buscar Objeto");
		btnBuscarObjeto.setForeground(Color.DARK_GRAY);
		btnBuscarObjeto.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnBuscarObjeto.setBounds(95, 237, 187, 25);
		frame.getContentPane().add(btnBuscarObjeto);
		
		JTextPane txtpnBemvindoAdministrador = new JTextPane();
		txtpnBemvindoAdministrador.setText("Bem-vindo, administrador!");
		txtpnBemvindoAdministrador.setBounds(322, 46, -139, 20);
		frame.getContentPane().add(txtpnBemvindoAdministrador);
		
		JLabel lblBemvindoAdministrador = new JLabel("Bem-vindo, administrador!");
		lblBemvindoAdministrador.setForeground(Color.DARK_GRAY);
		lblBemvindoAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblBemvindoAdministrador.setBounds(405, 11, 151, 14);
		frame.getContentPane().add(lblBemvindoAdministrador);
		
		JButton btnEditarAdministrador = new JButton("Editar");
		btnEditarAdministrador.setForeground(new Color(105, 105, 105));
		btnEditarAdministrador.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnEditarAdministrador.setBounds(405, 36, 74, 15);
		frame.getContentPane().add(btnEditarAdministrador);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(105, 105, 105));
		btnSair.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnSair.setBounds(482, 36, 74, 15);
		frame.getContentPane().add(btnSair);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 566, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMe = new JLabel("MENU ADMINISTRADOR");
		lblMe.setBounds(107, 11, 213, 44);
		panel.add(lblMe);
		lblMe.setForeground(Color.DARK_GRAY);
		lblMe.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JLabel lblCentralDeOcorrencia = new JLabel("Central de Ocorrencias");
		lblCentralDeOcorrencia.setForeground(new Color(51, 51, 51));
		lblCentralDeOcorrencia.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblCentralDeOcorrencia.setBounds(197, 145, 202, 25);
		frame.getContentPane().add(lblCentralDeOcorrencia);
	}
}

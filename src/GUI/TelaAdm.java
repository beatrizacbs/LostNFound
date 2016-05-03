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
		frame.getContentPane().setBackground(new Color(0, 255, 153));
		frame.getContentPane().setForeground(new Color(0, 255, 153));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMe = new JLabel("Menu Administrador");
		lblMe.setBounds(136, 12, 149, 15);
		frame.getContentPane().add(lblMe);
		
		JButton btnCadastrarObjeto = new JButton("Cadastrar Objeto");
		btnCadastrarObjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroOcorrencia window = new TelaCadastroOcorrencia();
				window.getFrame().setVisible(true);
				
			}
		});
		btnCadastrarObjeto.setBounds(12, 111, 187, 25);
		frame.getContentPane().add(btnCadastrarObjeto);
		
		JButton btnObjetosEncontrados = new JButton("Dono encontrado");
		btnObjetosEncontrados.setBounds(12, 148, 187, 25);
		frame.getContentPane().add(btnObjetosEncontrados);
		
		JButton btnObjetosProcurados = new JButton("Objetos procurados");
		btnObjetosProcurados.setBounds(12, 185, 187, 25);
		frame.getContentPane().add(btnObjetosProcurados);
		
		JLabel lblOcorrncia = new JLabel("Ocorrência:");
		lblOcorrncia.setBounds(32, 84, 114, 15);
		frame.getContentPane().add(lblOcorrncia);
		
		JButton btnBuscarObjeto = new JButton("Buscar Objeto");
		btnBuscarObjeto.setBounds(12, 222, 187, 25);
		frame.getContentPane().add(btnBuscarObjeto);
		
		JLabel lblPerfilAdministrador = new JLabel("Perfil Administrador:");
		lblPerfilAdministrador.setBounds(260, 84, 163, 15);
		frame.getContentPane().add(lblPerfilAdministrador);
	}
}

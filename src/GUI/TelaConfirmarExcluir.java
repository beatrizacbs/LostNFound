package GUI;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPanel;

import LF.Excecoes.CodigoInvalidoException;
import LF.Excecoes.UsuarioInexistenteException;
import LF.Fachada.Fachada;
import LF.Usuario.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaConfirmarExcluir {

	private JFrame frame;
	private JTextField campoSenha;
	private JTextField campoCpf;
	private Fachada fachada = Fachada.getInstance();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirmarExcluir window = new TelaConfirmarExcluir();
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
	public TelaConfirmarExcluir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 255, 153));
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSim = new JButton("SIM");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario aux = fachada.buscarUsuario(campoCpf.getText());
					
					if(aux != null)
					{
						if(fachada.verificadorLogin(aux.getLogin(), aux.getSenha()) != null)
						{
							fachada.removerUsuario(campoCpf.getText());
							JOptionPane.showMessageDialog(null, "Usuario removido com sucesso");
							TelaInicial windowTelaInicial = new TelaInicial();
							windowTelaInicial.setVisible(true);
							frame.dispose();
						}
					}
					
					
				} catch (UsuarioInexistenteException e2) {
					JOptionPane.showMessageDialog(null, "Usuario inexistente");
				} catch (CodigoInvalidoException e2) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Usuario inexistente");
				}
				
				
			}
		});
		btnSim.setBounds(269, 189, 117, 25);
		frame.getContentPane().add(btnSim);
		
		JButton btnNo = new JButton("NAO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNo.setBounds(269, 132, 117, 25);
		frame.getContentPane().add(btnNo);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setBounds(33, 165, 144, 15);
		frame.getContentPane().add(lblConfirmarSenha);
		
		campoSenha = new JTextField();
		campoSenha.setBounds(33, 182, 114, 19);
		frame.getContentPane().add(campoSenha);
		campoSenha.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 53);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voce deseja realmente excluir ");
		lblNewLabel.setBounds(119, 0, 236, 25);
		panel.add(lblNewLabel);
		
		JLabel lblSuaContaPermanentemente = new JLabel("sua conta permanentemente?");
		lblSuaContaPermanentemente.setBounds(119, 27, 226, 15);
		panel.add(lblSuaContaPermanentemente);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(33, 134, 114, 20);
		frame.getContentPane().add(campoCpf);
		campoCpf.setColumns(10);
		
		JLabel lblConfirmarCpf = new JLabel("Confirmar CPF:");
		lblConfirmarCpf.setBounds(33, 109, 114, 14);
		frame.getContentPane().add(lblConfirmarCpf);
	}

	public Window getFrame() {
		return this.frame;
	}
}
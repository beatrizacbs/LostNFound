package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCliente {

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
					TelaCliente window = new TelaCliente();
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
	public TelaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(51, 255, 204));
		frame.getContentPane().setBackground(new Color(0, 255, 153));
		frame.getContentPane().setFont(new Font("Purisa", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnProcurarObjeto = new JButton("Procurar objeto");
		btnProcurarObjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaProcurarObj window = new TelaProcurarObj();
				window.frame.setVisible(true);
			}
		});
		btnProcurarObjeto.setBounds(22, 53, 162, 25);
		frame.getContentPane().add(btnProcurarObjeto);
		
		JButton btnCasa = new JButton("Objetos Perdidos");
		btnCasa.setBounds(236, 90, 185, 25);
		frame.getContentPane().add(btnCasa);
		
		JButton btnVisualizarLista = new JButton("Visualizar lista");
		btnVisualizarLista.setBounds(22, 90, 162, 25);
		frame.getContentPane().add(btnVisualizarLista);
		
		JLabel lblSobreOsObjetos = new JLabel("Sobre os objetos");
		lblSobreOsObjetos.setFont(new Font("Purisa", Font.BOLD, 14));
		lblSobreOsObjetos.setBounds(22, 26, 162, 15);
		frame.getContentPane().add(lblSobreOsObjetos);
		
		JLabel lblMeuPerfil = new JLabel("Meu Perfil");
		lblMeuPerfil.setFont(new Font("Purisa", Font.BOLD, 14));
		lblMeuPerfil.setBounds(272, 26, 116, 15);
		frame.getContentPane().add(lblMeuPerfil);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(255, 0, 255));
		btnAtualizar.setBounds(236, 53, 185, 25);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Excluir conta");
		btnExcluir.setBounds(236, 127, 185, 25);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnAtualizarEndereo = new JButton("Atualizar endereço");
		btnAtualizarEndereo.setBounds(236, 164, 185, 25);
		frame.getContentPane().add(btnAtualizarEndereo);
	}
}

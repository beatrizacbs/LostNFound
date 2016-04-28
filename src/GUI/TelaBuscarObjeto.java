package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class TelaBuscarObjeto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarObjeto window = new TelaBuscarObjeto();
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
	public TelaBuscarObjeto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 255, 153));
		frame.getContentPane().setBackground(new Color(0, 255, 153));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBuscaDeObjetos = new JLabel("Busca de objetos");
		lblBuscaDeObjetos.setBounds(152, 12, 165, 15);
		frame.getContentPane().add(lblBuscaDeObjetos);
		
		JLabel lblEscolhaOTipo = new JLabel("Escolha o tipo:");
		lblEscolhaOTipo.setBounds(48, 49, 139, 15);
		frame.getContentPane().add(lblEscolhaOTipo);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletrônico");
		rdbtnEletrnico.setBounds(27, 72, 139, 23);
		frame.getContentPane().add(rdbtnEletrnico);
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritório");
		rdbtnEscritrio.setBounds(27, 99, 139, 23);
		frame.getContentPane().add(rdbtnEscritrio);
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereço");
		rdbtnAdereo.setBounds(27, 126, 139, 23);
		frame.getContentPane().add(rdbtnAdereo);
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBounds(27, 153, 139, 23);
		frame.getContentPane().add(rdbtnVestimenta);
		
		JLabel label = new JLabel("");
		label.setBounds(231, 111, 70, 15);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(48, 213, 101, 25);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		rdbtnOutro.setBounds(27, 180, 139, 25);
		frame.getContentPane().add(rdbtnOutro);
		
		JLabel lblAquiAGente = new JLabel("aqui a gente coloca o lista");
		lblAquiAGente.setBounds(221, 103, 217, 15);
		frame.getContentPane().add(lblAquiAGente);
	}
}

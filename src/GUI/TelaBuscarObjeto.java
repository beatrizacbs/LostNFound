package GUI;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JScrollBar;

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
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.setBounds(100, 100, 582, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEscolhaOTipo = new JLabel("ESCOLHA UMA OP\u00C7\u00C3O:");
		lblEscolhaOTipo.setForeground(Color.DARK_GRAY);
		lblEscolhaOTipo.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEscolhaOTipo.setBounds(82, 102, 139, 15);
		frame.getContentPane().add(lblEscolhaOTipo);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletronico");
		rdbtnEletrnico.setBackground(new Color(112, 128, 144));
		rdbtnEletrnico.setForeground(new Color(0, 0, 0));
		rdbtnEletrnico.setBounds(92, 157, 139, 23);
		frame.getContentPane().add(rdbtnEletrnico);
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritorio");
		rdbtnEscritrio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		rdbtnEscritrio.setBackground(new Color(112, 128, 144));
		rdbtnEscritrio.setBounds(92, 131, 139, 23);
		frame.getContentPane().add(rdbtnEscritrio);
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereco");
		rdbtnAdereo.setBackground(new Color(112, 128, 144));
		rdbtnAdereo.setBounds(92, 183, 139, 23);
		frame.getContentPane().add(rdbtnAdereo);
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBackground(new Color(112, 128, 144));
		rdbtnVestimenta.setBounds(92, 209, 139, 23);
		frame.getContentPane().add(rdbtnVestimenta);
		
		JLabel label = new JLabel("");
		label.setBounds(231, 111, 70, 15);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setForeground(new Color(105, 105, 105));
		btnNewButton.setBounds(92, 275, 100, 23);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		rdbtnOutro.setBackground(new Color(112, 128, 144));
		rdbtnOutro.setBounds(92, 235, 139, 25);
		frame.getContentPane().add(rdbtnOutro);
		
		JLabel lblAquiAGente = new JLabel("LISTA DE OBJETOS:");
		lblAquiAGente.setForeground(Color.DARK_GRAY);
		lblAquiAGente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblAquiAGente.setBounds(339, 102, 217, 15);
		frame.getContentPane().add(lblAquiAGente);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBuscaDeObjetos = new JLabel("BUSCA DE OBJETOS");
		lblBuscaDeObjetos.setBounds(205, 22, 171, 31);
		panel.add(lblBuscaDeObjetos);
		lblBuscaDeObjetos.setForeground(Color.DARK_GRAY);
		lblBuscaDeObjetos.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(258, 128, 284, 170);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(267, 0, 17, 170);
		panel_1.add(scrollBar);
	}

	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return this.frame;
	}
}

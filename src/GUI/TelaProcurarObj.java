package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaProcurarObj {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProcurarObj window = new TelaProcurarObj();
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
	public TelaProcurarObj() {
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
		
		JLabel lblBuscarObjeto = new JLabel("Buscar Objeto");
		lblBuscarObjeto.setFont(new Font("Purisa", Font.BOLD, 14));
		lblBuscarObjeto.setBounds(161, 12, 136, 15);
		frame.getContentPane().add(lblBuscarObjeto);
		
		JLabel lblCaractersticas = new JLabel("Características:");
		lblCaractersticas.setBounds(32, 52, 120, 15);
		frame.getContentPane().add(lblCaractersticas);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(307, 64, 70, 15);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(32, 74, 70, 15);
		frame.getContentPane().add(lblCor);
		
		JLabel lblTamanho = new JLabel("Tamanho:");
		lblTamanho.setBounds(32, 114, 70, 15);
		frame.getContentPane().add(lblTamanho);
		
		JLabel lblDanoFsico = new JLabel("Dano Físico:");
		lblDanoFsico.setBounds(32, 158, 86, 15);
		frame.getContentPane().add(lblDanoFsico);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletrônico");
		rdbtnEletrnico.setBounds(255, 101, 149, 23);
		frame.getContentPane().add(rdbtnEletrnico);
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritório");
		rdbtnEscritrio.setBounds(255, 128, 149, 23);
		frame.getContentPane().add(rdbtnEscritrio);
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereço");
		rdbtnAdereo.setBounds(255, 182, 149, 23);
		frame.getContentPane().add(rdbtnAdereo);
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBounds(255, 155, 149, 23);
		frame.getContentPane().add(rdbtnVestimenta);
		
		JLabel lblOutro = new JLabel("Outro:");
		lblOutro.setBounds(255, 226, 70, 15);
		frame.getContentPane().add(lblOutro);
		
		textField = new JTextField();
		textField.setBounds(307, 224, 97, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(32, 136, 101, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 180, 103, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(30, 92, 97, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(32, 221, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}

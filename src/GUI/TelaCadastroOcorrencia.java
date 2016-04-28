package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaCadastroOcorrencia {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroOcorrencia window = new TelaCadastroOcorrencia();
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
	public TelaCadastroOcorrencia() {
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
		
		JLabel lblCadas = new JLabel("CADASTRAR OCORRÊNCIA");
		lblCadas.setFont(new Font("Purisa", Font.BOLD, 14));
		lblCadas.setBounds(87, 12, 244, 15);
		frame.getContentPane().add(lblCadas);
		
		JLabel lblEscolhaOTipo = new JLabel("Escolha o tipo");
		lblEscolhaOTipo.setBounds(24, 39, 107, 15);
		frame.getContentPane().add(lblEscolhaOTipo);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletrônico");
		rdbtnEletrnico.setBackground(new Color(0, 255, 153));
		rdbtnEletrnico.setBounds(24, 62, 123, 23);
		frame.getContentPane().add(rdbtnEletrnico);
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritório");
		rdbtnEscritrio.setBackground(new Color(0, 255, 153));
		rdbtnEscritrio.setBounds(24, 89, 107, 23);
		frame.getContentPane().add(rdbtnEscritrio);
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereço");
		rdbtnAdereo.setBackground(new Color(0, 255, 153));
		rdbtnAdereo.setBounds(24, 119, 123, 23);
		frame.getContentPane().add(rdbtnAdereo);
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBackground(new Color(0, 255, 153));
		rdbtnVestimenta.setBounds(24, 146, 123, 30);
		frame.getContentPane().add(rdbtnVestimenta);
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		rdbtnOutro.setBackground(new Color(0, 255, 153));
		rdbtnOutro.setBounds(24, 180, 123, 23);
		frame.getContentPane().add(rdbtnOutro);
		
		JLabel lblDescrevaOObjeto = new JLabel("Características únicas:");
		lblDescrevaOObjeto.setBounds(166, 39, 223, 15);
		frame.getContentPane().add(lblDescrevaOObjeto);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(176, 62, 236, 41);
		frame.getContentPane().add(textArea);
		
		JLabel lblDadosGerais = new JLabel("Dados Gerais");
		lblDadosGerais.setBounds(161, 104, 95, 15);
		frame.getContentPane().add(lblDadosGerais);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(186, 123, 70, 15);
		frame.getContentPane().add(lblCor);
		
		textField = new JTextField();
		textField.setBounds(220, 119, 200, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(410, 62, 17, 41);
		frame.getContentPane().add(scrollBar);
	}
}

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

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
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
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.setBounds(100, 100, 582, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEscolhaOTipo = new JLabel("Escolha o tipo");
		lblEscolhaOTipo.setBounds(24, 79, 107, 15);
		frame.getContentPane().add(lblEscolhaOTipo);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletrônico");
		rdbtnEletrnico.setBackground(new Color(0, 255, 153));
		rdbtnEletrnico.setBounds(24, 101, 123, 23);
		frame.getContentPane().add(rdbtnEletrnico);
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritório");
		rdbtnEscritrio.setBackground(new Color(0, 255, 153));
		rdbtnEscritrio.setBounds(24, 132, 107, 23);
		frame.getContentPane().add(rdbtnEscritrio);
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereço");
		rdbtnAdereo.setBackground(new Color(0, 255, 153));
		rdbtnAdereo.setBounds(24, 164, 123, 23);
		frame.getContentPane().add(rdbtnAdereo);
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBackground(new Color(0, 255, 153));
		rdbtnVestimenta.setBounds(24, 197, 123, 30);
		frame.getContentPane().add(rdbtnVestimenta);
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		rdbtnOutro.setBackground(new Color(0, 255, 153));
		rdbtnOutro.setBounds(30, 250, 123, 23);
		frame.getContentPane().add(rdbtnOutro);
		
		JLabel lblDescrevaOObjeto = new JLabel("Caracteristicas Basicas:");
		lblDescrevaOObjeto.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDescrevaOObjeto.setBounds(317, 103, 159, 15);
		frame.getContentPane().add(lblDescrevaOObjeto);
		
		JLabel lblDadosGerais = new JLabel("Caracteristicas Adicionais:");
		lblDadosGerais.setBounds(337, 254, 139, 15);
		frame.getContentPane().add(lblDadosGerais);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(284, 283, 70, 15);
		frame.getContentPane().add(lblCor);
		
		textField = new JTextField();
		textField.setBounds(317, 279, 200, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCadas = new JLabel("CADASTRAR OCORRENCIA");
		lblCadas.setBounds(176, 11, 244, 40);
		panel.add(lblCadas);
		lblCadas.setForeground(Color.DARK_GRAY);
		lblCadas.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JLabel lblDanosFsicos = new JLabel("Danos f\u00EDsicos");
		lblDanosFsicos.setBounds(284, 320, 70, 14);
		frame.getContentPane().add(lblDanosFsicos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(293, 127, 224, 116);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setBounds(294, 345, 46, 14);
		frame.getContentPane().add(lblTamanho);
	}
}

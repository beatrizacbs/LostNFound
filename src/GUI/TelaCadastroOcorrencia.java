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
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroOcorrencia {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

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
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 796, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCadas = new JLabel("CADASTRAR OCORRÊNCIA");
		lblCadas.setBounds(176, 11, 343, 40);
		panel.add(lblCadas);
		lblCadas.setForeground(Color.DARK_GRAY);
		lblCadas.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(85, 129, 208, 276);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletrônico");
		rdbtnEletrnico.setBounds(45, 77, 123, 23);
		panel_1.add(rdbtnEletrnico);
		rdbtnEletrnico.setBackground(UIManager.getColor("Button.darkShadow"));
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritório");
		rdbtnEscritrio.setBounds(45, 120, 107, 23);
		panel_1.add(rdbtnEscritrio);
		rdbtnEscritrio.setBackground(UIManager.getColor("Button.darkShadow"));
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereço");
		rdbtnAdereo.setBounds(45, 35, 123, 23);
		panel_1.add(rdbtnAdereo);
		rdbtnAdereo.setBackground(UIManager.getColor("Button.darkShadow"));
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBounds(45, 160, 123, 30);
		panel_1.add(rdbtnVestimenta);
		rdbtnVestimenta.setBackground(UIManager.getColor("Button.darkShadow"));
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		rdbtnOutro.setBounds(45, 210, 123, 23);
		panel_1.add(rdbtnOutro);
		rdbtnOutro.setBackground(UIManager.getColor("Button.darkShadow"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Caracter\u00EDsticas:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(399, 95, 311, 220);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(25, 37, 29, 22);
		panel_2.add(lblCor);
		
		JLabel lblDanoFsico = new JLabel("Dano físico:");
		lblDanoFsico.setBounds(25, 71, 83, 15);
		panel_2.add(lblDanoFsico);
		
		JLabel lblTamanho = new JLabel("Tamanho:");
		lblTamanho.setBounds(25, 125, 70, -25);
		panel_2.add(lblTamanho);
		
		JLabel lblDataDeEntrada = new JLabel("Data de entrada:");
		lblDataDeEntrada.setBounds(25, 132, 122, 15);
		panel_2.add(lblDataDeEntrada);
		
		JLabel lblStatusDaOcorrncia = new JLabel("Status da ocorrência:");
		lblStatusDaOcorrncia.setBounds(25, 159, 159, 15);
		panel_2.add(lblStatusDaOcorrncia);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(25, 186, 70, 15);
		panel_2.add(lblId);
		
		JLabel lblTamanho_1 = new JLabel("Tamanho:");
		lblTamanho_1.setBounds(25, 98, 70, 22);
		panel_2.add(lblTamanho_1);
		
		textField = new JTextField();
		textField.setBounds(185, 39, 114, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 69, 114, 19);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 100, 114, 19);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(185, 125, 114, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(185, 157, 114, 19);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(185, 184, 114, 19);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAdm windowTelaAdm = new TelaAdm();
				windowTelaAdm.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnCadastrar.setBounds(615, 394, 117, 25);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdm windowTelaAdm = new TelaAdm();
				windowTelaAdm.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setBounds(451, 394, 117, 25);
		frame.getContentPane().add(btnVoltar);
	}
}
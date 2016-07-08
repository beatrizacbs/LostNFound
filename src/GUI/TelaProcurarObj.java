package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class TelaProcurarObj {

	JFrame frame;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;

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
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 798, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnEletrnico = new JRadioButton("Eletrônico");
		rdbtnEletrnico.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnEletrnico.setBounds(41, 174, 110, 23);
		frame.getContentPane().add(rdbtnEletrnico);
		
		JRadioButton rdbtnEscritrio = new JRadioButton("Escritório");
		rdbtnEscritrio.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnEscritrio.setBounds(41, 201, 110, 23);
		frame.getContentPane().add(rdbtnEscritrio);
		
		JRadioButton rdbtnAdereo = new JRadioButton("Adereço");
		rdbtnAdereo.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnAdereo.setBounds(41, 147, 110, 23);
		frame.getContentPane().add(rdbtnAdereo);
		
		JRadioButton rdbtnVestimenta = new JRadioButton("Vestimenta");
		rdbtnVestimenta.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnVestimenta.setBounds(41, 228, 109, 23);
		frame.getContentPane().add(rdbtnVestimenta);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(248, 268, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 798, 76);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBuscarObjeto = new JLabel("BUSCA DE OCORRÊNCIAS");
		lblBuscarObjeto.setBounds(293, 25, 257, 22);
		panel.add(lblBuscarObjeto);
		lblBuscarObjeto.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Informa\u00E7\u00F5es da ocorr\u00EAncia:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(41, 333, 516, 134);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setBounds(24, 43, 70, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cor:");
		lblNewLabel_1.setBounds(24, 70, 70, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dano Físico:");
		lblNewLabel_2.setBounds(281, 39, 86, 15);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tamanho:");
		lblNewLabel_3.setBounds(281, 66, 70, 15);
		panel_1.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(76, 68, 114, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(390, 37, 114, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(76, 41, 114, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(390, 68, 114, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(34, 97, 34, 15);
		panel_1.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(390, 95, 114, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStatusDaOcorrncia = new JLabel("Status da Ocorrência:");
		lblStatusDaOcorrncia.setBounds(212, 97, 155, 15);
		panel_1.add(lblStatusDaOcorrncia);
		
		textField = new JTextField();
		textField.setBounds(76, 97, 114, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblListaDeObjetos = new JLabel("Lista de objetos:");
		lblListaDeObjetos.setBounds(543, 95, 129, 15);
		frame.getContentPane().add(lblListaDeObjetos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(610, 147, -14, 192);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(466, 122, 295, 192);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(278, 0, 17, 207);
		panel_2.add(scrollBar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdm windowTelaAdm = new TelaAdm();
				windowTelaAdm.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setBounds(638, 426, 101, 25);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnRetirarObjeto = new JButton("Retirar objeto");
		btnRetirarObjeto.setBounds(610, 389, 143, 25);
		frame.getContentPane().add(btnRetirarObjeto);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Tipo:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_3.setBounds(33, 122, 136, 143);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Status:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_4.setBounds(209, 151, 159, 99);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JCheckBox chckbxNoRecuperado = new JCheckBox("Não recuperado");
		chckbxNoRecuperado.setBounds(10, 22, 139, 23);
		chckbxNoRecuperado.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_4.add(chckbxNoRecuperado);
		
		JCheckBox chckbxRecuperado = new JCheckBox("Recuperado");
		chckbxRecuperado.setBounds(24, 50, 110, 23);
		chckbxRecuperado.setBackground(UIManager.getColor("Button.darkShadow"));
		chckbxRecuperado.setForeground(UIManager.getColor("Button.foreground"));
		panel_4.add(chckbxRecuperado);
	}

	public JFrame getFrame() {
		return frame;
	}
}
package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAtualizarEndereco {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtualizarEndereco window = new TelaAtualizarEndereco();
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
	public TelaAtualizarEndereco() {
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
		
		JLabel lblA = new JLabel("Atualizar Endereço");
		lblA.setBounds(146, 12, 168, 15);
		frame.getContentPane().add(lblA);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(25, 55, 114, 15);
		frame.getContentPane().add(lblLogradouro);
		
		JLabel lblNewLabel = new JLabel("Bairro:");
		lblNewLabel.setBounds(25, 82, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(25, 109, 70, 15);
		frame.getContentPane().add(lblCep);
		
		JLabel lblNewLabel_1 = new JLabel("Número:");
		lblNewLabel_1.setBounds(25, 136, 70, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(25, 163, 102, 15);
		frame.getContentPane().add(lblComplemento);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(25, 190, 70, 15);
		frame.getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(25, 217, 70, 15);
		frame.getContentPane().add(lblEstado);
		
		textField = new JTextField();
		textField.setBounds(184, 53, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 82, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 107, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(184, 161, 114, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(184, 188, 114, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(184, 215, 114, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(184, 134, 114, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
	}

}

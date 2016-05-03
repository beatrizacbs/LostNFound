package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JButton;

import LF.Fachada.Fachada;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAtualizarEndereco {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private Fachada fachada;
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
		fachada = Fachada.getInstance();
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
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setForeground(Color.DARK_GRAY);
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLogradouro.setBounds(168, 85, 114, 15);
		frame.getContentPane().add(lblLogradouro);
		
		JLabel lblNewLabel = new JLabel("Bairro:");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(168, 108, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(Color.DARK_GRAY);
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCep.setBounds(168, 134, 70, 15);
		frame.getContentPane().add(lblCep);
		
		JLabel lblNewLabel_1 = new JLabel("Numero:");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(168, 160, 70, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setForeground(Color.DARK_GRAY);
		lblComplemento.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblComplemento.setBounds(167, 186, 102, 15);
		frame.getContentPane().add(lblComplemento);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.DARK_GRAY);
		lblCidade.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblCidade.setBounds(168, 212, 70, 15);
		frame.getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setForeground(Color.DARK_GRAY);
		lblEstado.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEstado.setBounds(168, 238, 70, 15);
		frame.getContentPane().add(lblEstado);
		
		textField = new JTextField();
		textField.setBounds(257, 83, 209, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(257, 107, 209, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(257, 132, 209, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(257, 184, 209, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(257, 210, 209, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(257, 235, 209, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(257, 158, 209, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 54);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAtualizarEndereo = new JLabel("ATUALIZAR ENDERE\u00C7O");
		lblAtualizarEndereo.setForeground(Color.DARK_GRAY);
		lblAtualizarEndereo.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblAtualizarEndereo.setBounds(191, 18, 225, 25);
		panel.add(lblAtualizarEndereo);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnFinalizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnFinalizar.setBounds(217, 286, 170, 23);
		frame.getContentPane().add(btnFinalizar);
	}

}

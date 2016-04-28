package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaAtualizarCliente {

	private JFrame frame;
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
					TelaAtualizarCliente window = new TelaAtualizarCliente();
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
	public TelaAtualizarCliente() {
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
		
		JLabel lblA = new JLabel("Atualizar Cadastro Cliente");
		lblA.setFont(new Font("Purisa", Font.BOLD, 14));
		lblA.setBounds(101, 12, 232, 15);
		frame.getContentPane().add(lblA);
		
		JLabel lblNovoNome = new JLabel("Novo nome:");
		lblNovoNome.setBounds(27, 50, 90, 15);
		frame.getContentPane().add(lblNovoNome);
		
		textField = new JTextField();
		textField.setBounds(166, 50, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNovoEmail = new JLabel("Novo email:");
		lblNovoEmail.setBounds(27, 77, 105, 15);
		frame.getContentPane().add(lblNovoEmail);
		
		JLabel lblNovoTelefone = new JLabel("Novo telefone:");
		lblNovoTelefone.setBounds(27, 104, 114, 15);
		frame.getContentPane().add(lblNovoTelefone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 102, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 75, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNovoCpf = new JLabel("Novo CPF:");
		lblNovoCpf.setBounds(27, 131, 70, 15);
		frame.getContentPane().add(lblNovoCpf);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 129, 114, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(187, 160, 71, 25);
		frame.getContentPane().add(btnDone);
	}

}

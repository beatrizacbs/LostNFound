package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaConfirmarExcluir {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirmarExcluir window = new TelaConfirmarExcluir();
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
	public TelaConfirmarExcluir() {
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
		
		JLabel lblNewLabel = new JLabel("Você deseja realmente excluir ");
		lblNewLabel.setBounds(108, 25, 236, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSim = new JButton("SIM");
		btnSim.setBounds(269, 189, 117, 25);
		frame.getContentPane().add(btnSim);
		
		JButton btnNo = new JButton("NÃO");
		btnNo.setBounds(269, 132, 117, 25);
		frame.getContentPane().add(btnNo);
		
		JLabel lblSuaContaPermanentemente = new JLabel("sua conta permanentemente?");
		lblSuaContaPermanentemente.setBounds(108, 62, 226, 15);
		frame.getContentPane().add(lblSuaContaPermanentemente);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setBounds(33, 155, 144, 15);
		frame.getContentPane().add(lblConfirmarSenha);
		
		textField = new JTextField();
		textField.setBounds(33, 182, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}

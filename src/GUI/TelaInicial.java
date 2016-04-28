package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 153));
		contentPane.setBackground(new Color(0, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 153));
		panel.setBounds(83, 40, 287, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBemVindoAo = new JLabel("Bem vindo ao Lost&Found.");
		lblBemVindoAo.setBounds(12, 12, 208, 27);
		panel.add(lblBemVindoAo);
		lblBemVindoAo.setFont(new Font("Purisa", Font.BOLD, 12));
		
		JLabel lblNewLabel = new JLabel("Tudo o que você precisa está aqui.");
		lblNewLabel.setBounds(22, 35, 291, 15);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Purisa", Font.BOLD, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 153));
		panel_1.setBounds(44, 126, 372, 134);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setBounds(0, 0, 70, 15);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 18, 114, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setBounds(0, 53, 70, 15);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JPasswordField();
		textField_2.setBounds(0, 70, 114, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel((String) null);
		lblNewLabel_3.setBounds(0, 58, 70, 15);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNovoCadastro = new JButton("Novo Cadastro");
		btnNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastro frame = new TelaCadastro();
				frame.setVisible(true);
			}
		});
		btnNovoCadastro.setBounds(187, 53, 157, 25);
		btnNovoCadastro.setBackground(new Color(220, 20, 60));
		panel_1.add(btnNovoCadastro);
		
		JButton btnOk = new JButton("ok");
		btnOk.setBounds(24, 97, 71, 25);
		panel_1.add(btnOk);
		
		
	}
}

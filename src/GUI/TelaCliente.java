package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import LF.Excecoes.CodigoInvalidoException;
import LF.Excecoes.UsuarioInexistenteException;
import LF.Fachada.Fachada;

public class TelaCliente {

	private JFrame frame;
	private final JPanel panel = new JPanel();
    private Fachada fachada = Fachada.getInstance();
    
    public JFrame getFrame()
    {
        return this.frame;
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente window = new TelaCliente();
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
	public TelaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(51, 255, 204));
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.getContentPane().setFont(new Font("Purisa", Font.PLAIN, 12));
		frame.setBounds(100, 100, 803, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 791, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU CLIENTE");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(239, 24, 177, 15);
		panel.add(lblNewLabel);
		
		JLabel lblBemVindoAo = new JLabel("Bem vindo ao seu menu!");
		lblBemVindoAo.setBounds(588, 12, 191, 15);
		panel.add(lblBemVindoAo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Informa\u00E7\u00F5es dos objetos:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(81, 174, 224, 133);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnProcurarObjeto = new JButton("Procurar objeto");
		btnProcurarObjeto.setBounds(32, 57, 162, 25);
		panel_1.add(btnProcurarObjeto);
		btnProcurarObjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaBuscarObjetoCliente window = new TelaBuscarObjetoCliente();
				window.getFrame().setVisible(true);
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(153, 153, 153), 3), "Meu perfil:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(455, 174, 235, 194);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnExcluir = new JButton("Excluir conta");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConfirmarExcluir windowEx = new TelaConfirmarExcluir();
                windowEx.getFrame().setVisible(true);
                
			}
		});
		btnExcluir.setBounds(24, 115, 185, 25);
		panel_2.add(btnExcluir);
		
		JButton btnCasa = new JButton("Atualizar Cadastro");
		btnCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtualizarCliente window = new TelaAtualizarCliente();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnCasa.setBounds(24, 62, 185, 25);
		panel_2.add(btnCasa);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		//Ao apertar o botão: Voltar, o codigo abaixo será executado e retornará para tela Inicial
				TelaInicial windowCliente = new TelaInicial();
				windowCliente.setVisible(true);
				frame.dispose();
				
			}
		});
		btnVoltar.setBounds(606, 447, 117, 25);
		frame.getContentPane().add(btnVoltar);
	}
}
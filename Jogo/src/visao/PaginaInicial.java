package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Color;

public class PaginaInicial {

	private JFrame frmJogoDoTok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicial window = new PaginaInicial();
					window.frmJogoDoTok.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogoDoTok = new JFrame();
		frmJogoDoTok.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmJogoDoTok.setTitle("Jogo do TOK");
		frmJogoDoTok.setBounds(100, 100, 600, 600);
		frmJogoDoTok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogoDoTok.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 600, 22);
		frmJogoDoTok.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Jogo");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Reiniciar jogo");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Exibe uma mensagem de confirmação antes de sair (opcional)
		        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
		        
		        // Se o usuário clicar em "Sim" (YES_OPTION), fecha o programa
		        if (resposta == JOptionPane.YES_OPTION) {
		            System.exit(0);
		        }
		    }
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Autores");
		mnNewMenu_1.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ver nomes");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Gabriela da Silva Ramires e Tamires Antunes Nunes");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
	}
}
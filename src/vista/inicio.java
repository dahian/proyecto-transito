package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
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
	public inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("NUEVO COMPARENDO");
		btnNewButton.setForeground(new Color(0, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(156, 125, 185, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBuscarComparendo = new JButton("BUSCAR COMPARENDO");
		btnBuscarComparendo.setForeground(Color.BLUE);
		btnBuscarComparendo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarComparendo.setBounds(156, 193, 185, 33);
		frame.getContentPane().add(btnBuscarComparendo);
		
		JButton btnComparendos = new JButton("COMPARENDOS");
		btnComparendos.setForeground(Color.BLUE);
		btnComparendos.setBounds(156, 256, 185, 33);
		frame.getContentPane().add(btnComparendos);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\GATEWAY\\Desktop\\logop.jpg"));
		lblNewLabel.setBounds(397, 0, 101, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSetta = new JLabel("SETTA");
		lblSetta.setForeground(new Color(0, 0, 255));
		lblSetta.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		lblSetta.setBounds(10, 5, 91, 59);
		frame.getContentPane().add(lblSetta);
		frame.setBounds(100, 100, 514, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

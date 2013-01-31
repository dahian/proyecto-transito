package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.io.File;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		frame.addWindowListener(new WindowAdapter() {
		
		});
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("NUEVO COMPARENDO");
		btnNewButton.setForeground(new Color(0, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				nuevoComparendo miNuevoComparendo = new nuevoComparendo();
				miNuevoComparendo.setVisible(true);
			}
		});
		btnNewButton.setBounds(156, 125, 185, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBuscarComparendo = new JButton("BUSCAR COMPARENDO");
		btnBuscarComparendo.setForeground(Color.BLUE);
		btnBuscarComparendo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				buscarComparendo miBuscarComparendo = new buscarComparendo();
				miBuscarComparendo.setVisible(true);
			}
		});
		btnBuscarComparendo.setBounds(156, 193, 185, 33);
		frame.getContentPane().add(btnBuscarComparendo);
		
		JButton btnComparendos = new JButton("COMPARENDOS");
		btnComparendos.setForeground(Color.BLUE);
		btnComparendos.setBounds(156, 256, 185, 33);
		frame.getContentPane().add(btnComparendos);
		
		JLabel lblSetta = new JLabel("SETTA");
		lblSetta.setForeground(new Color(0, 0, 255));
		lblSetta.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		lblSetta.setBounds(10, 5, 91, 59);
		frame.getContentPane().add(lblSetta);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes"+File.separator+"logo.png"));
		label.setBounds(432, 11, 56, 29);
		frame.getContentPane().add(label);
		frame.setBounds(100, 100, 514, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

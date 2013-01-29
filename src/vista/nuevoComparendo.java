package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class nuevoComparendo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevoComparendo window = new nuevoComparendo();
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
	public nuevoComparendo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("SETTA");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		label_1.setBounds(10, 0, 91, 59);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\GATEWAY\\Desktop\\logop.jpg"));
		label.setForeground(Color.BLACK);
		label.setBounds(333, 0, 101, 80);
		frame.getContentPane().add(label);
		
		JLabel lblNuevoComparendo = new JLabel("NUEVO COMPARENDO");
		lblNuevoComparendo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoComparendo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNuevoComparendo.setBounds(125, 103, 222, 22);
		frame.getContentPane().add(lblNuevoComparendo);
		
		JLabel lblOrdenDeComparendo = new JLabel("ORDEN DE COMPARENDO NACIONAL No:");
		lblOrdenDeComparendo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOrdenDeComparendo.setBounds(32, 141, 234, 14);
		frame.getContentPane().add(lblOrdenDeComparendo);
		
		JLabel lblNewLabel = new JLabel("00001");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(266, 138, 46, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHoraY = new JLabel("1- HORA Y FECHA");
		lblHoraY.setBounds(32, 176, 101, 14);
		frame.getContentPane().add(lblHoraY);
	}

}

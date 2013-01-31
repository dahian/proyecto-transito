package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class comparendo2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comparendo2 frame = new comparendo2();
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
	public comparendo2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int eleccion = JOptionPane.showConfirmDialog(null,"ESTA SEGURO?");
				if(eleccion == 0){
					dispose();
				}
			}
		});
		setDefaultCloseOperation(1);
		setBounds(100, 100, 450, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("SETTA");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		label.setBounds(10, 11, 91, 59);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("imagenes"+File.separator+"logo.png"));
		label_1.setBounds(368, 11, 56, 29);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("7-DATOS DEL INFRACTOR");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(20, 81, 159, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("DOCUMENTO DE IDENTIDAD:");
		label_3.setBounds(20, 106, 159, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(184, 103, 210, 20);
		contentPane.add(textField);
		
		JLabel label_4 = new JLabel("LICENCIA DE CONDUCCION: ");
		label_4.setBounds(19, 138, 159, 14);
		contentPane.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 135, 210, 20);
		contentPane.add(textField_1);
		
		JLabel label_5 = new JLabel("EXPEDIDA");
		label_5.setBounds(170, 166, 81, 14);
		contentPane.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(261, 163, 132, 20);
		contentPane.add(textField_2);
		
		JLabel label_6 = new JLabel("VENCE:");
		label_6.setBounds(171, 194, 81, 14);
		contentPane.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(262, 191, 132, 20);
		contentPane.add(textField_3);
		
		JLabel label_7 = new JLabel("NOMBRES Y APELLIDOS:");
		label_7.setBounds(20, 225, 159, 14);
		contentPane.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(172, 222, 222, 20);
		contentPane.add(textField_4);
		
		JLabel label_8 = new JLabel("DIRECCION:");
		label_8.setBounds(20, 256, 74, 14);
		contentPane.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(104, 253, 290, 20);
		contentPane.add(textField_5);
		
		JLabel label_9 = new JLabel("8-TIPO DE INFRACTOR:");
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(20, 281, 159, 14);
		contentPane.add(label_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "CONDUCTOR", "PEATON", "CICLISTA", "MOTOCICLISTA"}));
		comboBox.setBounds(30, 306, 149, 20);
		contentPane.add(comboBox);
		
		JLabel label_10 = new JLabel("9-LICENCIA DE TRANSITO No:");
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(21, 337, 210, 14);
		contentPane.add(label_10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(21, 351, 374, 20);
		contentPane.add(textField_6);
		
		JLabel label_11 = new JLabel("10- DATOS DEL AGENTE:");
		label_11.setForeground(Color.BLUE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(20, 382, 210, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("NOMBRES Y APELLIDOS:");
		label_12.setBounds(20, 403, 159, 14);
		contentPane.add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(172, 400, 222, 20);
		contentPane.add(textField_7);
		
		JLabel label_13 = new JLabel("PLACA No:");
		label_13.setBounds(20, 431, 159, 14);
		contentPane.add(label_13);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(172, 428, 222, 20);
		contentPane.add(textField_8);
		
		JLabel label_14 = new JLabel("11- DATOS DE LA INMOVILIZACION");
		label_14.setForeground(Color.BLUE);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_14.setBounds(21, 455, 210, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("PATIO No:");
		label_15.setBounds(20, 480, 132, 14);
		contentPane.add(label_15);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(171, 477, 222, 20);
		contentPane.add(textField_9);
		
		JLabel label_16 = new JLabel("DIRECCION DEL PATIO");
		label_16.setBounds(20, 511, 132, 14);
		contentPane.add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(171, 508, 222, 20);
		contentPane.add(textField_10);
		
		JLabel label_17 = new JLabel("GRUA No:");
		label_17.setBounds(20, 539, 132, 14);
		contentPane.add(label_17);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(171, 536, 222, 20);
		contentPane.add(textField_11);
		
		JLabel label_18 = new JLabel("PLACA GRUA");
		label_18.setBounds(20, 567, 132, 14);
		contentPane.add(label_18);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(171, 564, 222, 20);
		contentPane.add(textField_12);
		
		JLabel label_19 = new JLabel("12- OBSERVACIONES");
		label_19.setForeground(Color.BLUE);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_19.setBounds(20, 602, 210, 14);
		contentPane.add(label_19);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(20, 627, 374, 20);
		contentPane.add(textField_13);
		
		JButton button = new JButton("CANCELAR");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(20, 658, 108, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("FINALIZAR");
		button_1.setBounds(255, 658, 139, 23);
		contentPane.add(button_1);
	}

}

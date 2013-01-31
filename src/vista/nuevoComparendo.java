package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nuevoComparendo extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevoComparendo frame = new nuevoComparendo();
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
	public nuevoComparendo() {
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
		setBounds(100, 100, 450, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("SETTA");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		label.setBounds(10, 11, 91, 59);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("NUEVO COMPARENDO");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(125, 99, 222, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("ORDEN DE COMPARENDO NACIONAL No:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(32, 152, 234, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("00001");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(266, 149, 46, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("1- FECHA Y HORA");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(32, 187, 101, 14);
		contentPane.add(label_4);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBounds(21, 226, 46, 20);
		contentPane.add(textField);
		
		JLabel label_5 = new JLabel("Dia          Mes      A\u00F1o");
		label_5.setBounds(22, 212, 146, 14);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBounds(66, 226, 46, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBounds(111, 226, 46, 20);
		contentPane.add(textField_2);
		
		JLabel label_6 = new JLabel("Hora       Min.");
		label_6.setBounds(190, 212, 146, 14);
		contentPane.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBounds(189, 226, 46, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setColumns(10);
		textField_4.setBounds(234, 226, 46, 20);
		contentPane.add(textField_4);
		
		JLabel label_7 = new JLabel("2- LUGAR DE LA INFRACCION");
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(32, 268, 203, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("VIA, KILOMETRO O SITIO, DIRECCION Y CIUDAD");
		label_8.setBounds(22, 293, 305, 14);
		contentPane.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(21, 305, 403, 20);
		contentPane.add(textField_5);
		
		JLabel label_9 = new JLabel("3- PLACA");
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(32, 349, 101, 14);
		contentPane.add(label_9);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.BLACK);
		textField_6.setColumns(10);
		textField_6.setBounds(22, 362, 46, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.BLACK);
		textField_7.setColumns(10);
		textField_7.setBounds(67, 362, 46, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.BLACK);
		textField_8.setColumns(10);
		textField_8.setBounds(112, 362, 46, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setForeground(Color.BLACK);
		textField_9.setColumns(10);
		textField_9.setBounds(190, 362, 46, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setForeground(Color.BLACK);
		textField_10.setColumns(10);
		textField_10.setBounds(235, 362, 46, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setForeground(Color.BLACK);
		textField_11.setColumns(10);
		textField_11.setBounds(279, 362, 46, 20);
		contentPane.add(textField_11);
		
		JLabel label_10 = new JLabel("4- CODIGO DEL INFRACTOR");
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(32, 404, 159, 14);
		contentPane.add(label_10);
		
		textField_12 = new JTextField();
		textField_12.setForeground(Color.BLACK);
		textField_12.setColumns(10);
		textField_12.setBounds(32, 429, 69, 20);
		contentPane.add(textField_12);
		
		JLabel label_11 = new JLabel("5- TIPO DE VEHICULO");
		label_11.setForeground(Color.BLUE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(32, 466, 159, 14);
		contentPane.add(label_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ELIJA UNA OPCION", "AUTOMOVIL", "MOTOS Y SIMILARES", "BUS", "BUSETA", "CAMPERO", "CAMIONETA", "CAMION", "MICROBUS", "VOLQUETA", "CAMION TRACTOR", "OTROS"}));
		comboBox.setBounds(22, 481, 159, 20);
		contentPane.add(comboBox);
		
		JLabel label_12 = new JLabel("6- CLASE DE SERVICIO");
		label_12.setForeground(Color.BLUE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(32, 532, 159, 14);
		contentPane.add(label_12);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ELIJA UNA OPCION", "PUBLICO", "PARTICULAR", "DOMESTICO", "CONSULAR", "OFICIAL", "OTRO"}));
		comboBox_1.setBounds(22, 547, 159, 20);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("CANCELAR");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(100, 636, 108, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("SIGUIENTE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				comparendo2 miComparendo2 = new comparendo2();
				miComparendo2.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(211, 636, 108, 23);
		contentPane.add(button_1);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("imagenes"+File.separator+"logo.png"));
		label_13.setBounds(368, 11, 56, 29);
		contentPane.add(label_13);
	}

}

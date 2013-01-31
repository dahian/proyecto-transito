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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class buscarComparendo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscarComparendo frame = new buscarComparendo();
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
	public buscarComparendo() {
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
		setBounds(100, 100, 418, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("SETTA");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		label.setBounds(23, 11, 91, 59);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("BUSCAR COMPARENDO");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(121, 66, 222, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("BUSCAR POR :");
		label_2.setBounds(46, 99, 124, 14);
		contentPane.add(label_2);
		
		JRadioButton botonOrden = new JRadioButton("ORDEN DE COMPARENDO NACIONAL");
		botonOrden.setBounds(46, 120, 232, 23);
		contentPane.add(botonOrden);
		
		JRadioButton botonlicencia = new JRadioButton("LICENCIA DE CONDUCCION");
		botonlicencia.setBounds(46, 146, 232, 23);
		contentPane.add(botonlicencia);
		
		JRadioButton botonCedula = new JRadioButton("CEDULA DE CIUDADANIA");
		botonCedula.setBounds(46, 172, 232, 23);
		contentPane.add(botonCedula);
		
		JRadioButton botonTargeta = new JRadioButton("TARGETA DE IDENTIDAD");
		botonTargeta.setBounds(46, 204, 232, 23);
		contentPane.add(botonTargeta);
		
		 ButtonGroup grupo = new ButtonGroup();
         grupo.add(botonOrden);
         grupo.add(botonlicencia);
         grupo.add(botonCedula);
		 grupo.add(botonTargeta);
		 
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 231, 222, 20);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("DIGITE No:");
		label_3.setBounds(46, 234, 65, 14);
		contentPane.add(label_3);
		
		JButton button = new JButton("BUSCAR");
		button.setBounds(77, 259, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("CANCELAR");
		button_1.setBounds(229, 259, 100, 23);
		contentPane.add(button_1);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("imagenes"+File.separator+"logo.png"));
		label_4.setBounds(336, 11, 56, 29);
		contentPane.add(label_4);
	}

}

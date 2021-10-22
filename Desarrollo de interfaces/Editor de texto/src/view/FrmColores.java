package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class FrmColores extends JDialog {
	
	public static Color foreground;
	public static Color background;
	
	public static JLabel lblPrueba;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public FrmColores() {
		setTitle("Colores");
		setModal(true);
		setBounds(400, 200, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblFuente = new JLabel("FUENTE");
		lblFuente.setBounds(74, 21, 46, 14);
		contentPanel.add(lblFuente);
		
		JPanel panelFuente = new JPanel();
		panelFuente.setBounds(10, 46, 174, 109);
		contentPanel.add(panelFuente);
		panelFuente.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnFuenteRosa = new JButton("");
		btnFuenteRosa.setBorderPainted(false);
		btnFuenteRosa.setBackground(Color.PINK);
		btnFuenteRosa.setOpaque(true);
		btnFuenteRosa.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				foreground = Color.pink;
				if(foreground != background) {
				lblPrueba.setForeground(Color.pink);
				}
			}
		});
		panelFuente.add(btnFuenteRosa);
		
		JButton btnFuenteRojo = new JButton("");
		btnFuenteRojo.setBorderPainted(false);
		btnFuenteRojo.setBackground(Color.RED);
		btnFuenteRojo.setOpaque(true);
		btnFuenteRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground = Color.red;
				if(foreground != background) {
				lblPrueba.setForeground(Color.red);
				}
			}
		});
		panelFuente.add(btnFuenteRojo);
		
		JButton btnFuenteNaranja = new JButton("");
		btnFuenteNaranja.setBorderPainted(false);
		btnFuenteNaranja.setOpaque(true);
		btnFuenteNaranja.setBackground(Color.ORANGE);
		btnFuenteNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground = Color.orange;
				if(foreground != background) {
					lblPrueba.setForeground(Color.orange);
				}
			}
		});
		panelFuente.add(btnFuenteNaranja);
		
		JButton btnFuenteAmarillo = new JButton("");
		btnFuenteAmarillo.setBorderPainted(false);
		btnFuenteAmarillo.setOpaque(true);
		btnFuenteAmarillo.setBackground(Color.YELLOW);
		btnFuenteAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground = Color.yellow;
				if(foreground != background) {
					lblPrueba.setForeground(Color.yellow);
				}
			}
		});
		panelFuente.add(btnFuenteAmarillo);
		
		JButton btnFuenteAzul = new JButton("");
		btnFuenteAzul.setBorderPainted(false);
		btnFuenteAzul.setOpaque(true);
		btnFuenteAzul.setBackground(Color.BLUE);
		btnFuenteAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground = Color.blue;
				if(foreground != background) {
					lblPrueba.setForeground(Color.blue);
				}
			}
		});
		panelFuente.add(btnFuenteAzul);
		
		JButton btnFuenteVerde = new JButton("");
		btnFuenteVerde.setBorderPainted(false);
		btnFuenteVerde.setOpaque(true);
		btnFuenteVerde.setBackground(Color.GREEN);
		btnFuenteVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground = Color.green;
				if(foreground != background) {
					lblPrueba.setForeground(Color.green);
				}
			}
		});
		panelFuente.add(btnFuenteVerde);
		
		JLabel lblFondo = new JLabel("FONDO");
		lblFondo.setBounds(313, 21, 46, 14);
		contentPanel.add(lblFondo);
		
		JPanel panelFondo = new JPanel();
		panelFondo.setBounds(250, 46, 174, 109);
		contentPanel.add(panelFondo);
		panelFondo.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnFondoRosa = new JButton("");
		btnFondoRosa.setBackground(Color.PINK);
		btnFondoRosa.setBorderPainted(false);
		btnFondoRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background = Color.pink;
				if(foreground != background) {
					lblPrueba.setBackground(Color.pink);
				}
			}
		});
		panelFondo.add(btnFondoRosa);
		
		JButton btnFondoRojo = new JButton("");
		btnFondoRojo.setBackground(Color.RED);
		btnFondoRojo.setBorderPainted(false);
		btnFondoRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background = Color.red;
				if(foreground != background) {
					lblPrueba.setBackground(Color.red);
				}
			}
		});
		panelFondo.add(btnFondoRojo);
		
		JButton btnFondoNaranja = new JButton("");
		btnFondoNaranja.setBackground(Color.ORANGE);
		btnFondoNaranja.setBorderPainted(false);
		btnFondoNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background = Color.orange;
				if(foreground != background) {
					lblPrueba.setBackground(Color.orange);
				}
			}
		});
		panelFondo.add(btnFondoNaranja);
		
		JButton btnFondoAmarillo = new JButton("");
		btnFondoAmarillo.setBackground(Color.YELLOW);
		btnFondoAmarillo.setBorderPainted(false);
		btnFondoAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background = Color.yellow;
				if(foreground != background) {
					lblPrueba.setBackground(Color.yellow);
				}
			}
		});
		panelFondo.add(btnFondoAmarillo);
		
		JButton btnFondoAzul = new JButton("");
		btnFondoAzul.setBackground(Color.BLUE);
		btnFondoAzul.setBorderPainted(false);
		btnFondoAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background = Color.blue;
				if(foreground != background) {
					lblPrueba.setBackground(Color.blue);
				}
			}
		});
		panelFondo.add(btnFondoAzul);
		
		JButton btnFondoVerde = new JButton("");
		btnFondoVerde.setBackground(Color.GREEN);
		btnFondoVerde.setBorderPainted(false);
		btnFondoVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background = Color.green;
				if(foreground != background) {
					lblPrueba.setBackground(Color.green);
				}
			}
		});
		panelFondo.add(btnFondoVerde);
		
		lblPrueba = new JLabel("TEXTO DE PRUEBA", JLabel.CENTER);
		lblPrueba.setOpaque(true);
		lblPrueba.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPrueba.setBounds(0, 166, 434, 41);
		contentPanel.add(lblPrueba);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(81, 222, 89, 23);
		contentPanel.add(btnAceptar);
		
		JButton btnGuardar = new JButton("GUARDAR POR DEFECTO");
		btnGuardar.setBounds(180, 222, 180, 23);
		contentPanel.add(btnGuardar);
		setVisible(true);
	}
}

package unico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Principal extends JFrame implements KeyListener{
	
	private int x = 20, y = 20, salto = 20; 

	private JPanel contentPane;
	private JTextField txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		JLabel lblImagen = new JLabel("New label");
		lblImagen.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\logotipo.png"));
		lblImagen.setBounds(147, 45, 94, 92);
		contentPane.add(lblImagen);
		*/
		
		txtTexto = new JTextField();
		txtTexto.setBounds(157, 11, 121, 72);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);

		txtTexto.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == 40) {
					y+=salto;
				}
				if(e.getKeyCode() == 38) {
					y-=salto;
				}
				if(e.getKeyCode() == 39) {
					x+=salto;
				}
				if(e.getKeyCode() == 37) {
					x-=salto;
				}
				
				//Esta sería otra manera de hacer lo mismo que con un if, a un nivel de segundo no de primero
				/*
				switch(e.getKeyCode()) {
					case KeyEvent.VK_DOWN : y-=salto;
					case KeyEvent.VK_UP : y+=salto;
					case KeyEvent.VK_LEFT : x-=salto;
					case KeyEvent.VK_RIGHT : x+=salto;
				}
				
				*/
				
				//lblImagen.setLocation(x, y);
								
			}
		});
				
				
				
				
		txtTexto.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == (int)('r') || e.getKeyCode() == (int)('R')) {
					System.out.println("Funciona");
					contentPane.setBackground(Color.RED);
				}
				if(e.getKeyCode() == (int)'v' || e.getKeyCode() == (int)('V')) {
					contentPane.setBackground(Color.GREEN);
				}
				if(e.getKeyCode() == (int)'a' || e.getKeyCode() == (int)('A')) {
					contentPane.setBackground(Color.BLUE);
				}
				if(e.getKeyCode() == (int)'n' || e.getKeyCode() == (int)('N')) {
					contentPane.setBackground(Color.BLACK);
				}
			}
		});
			
		txtTexto.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				Clip sonido;
				try {
					sonido = AudioSystem.getClip();
					sonido.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\Usuario\\Desktop\\un-clip_1.wav")));
					sonido.loop(0);
					sonido.start();
				} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
					
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

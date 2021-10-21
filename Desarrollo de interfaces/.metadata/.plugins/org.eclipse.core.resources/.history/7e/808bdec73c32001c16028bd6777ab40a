package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class FrmPrincipal extends JFrame {

	public static JTextArea txtArea;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\logotipo.png"));
		setTitle("EDITOR DE TEXTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnuArchivo = new JMenu("Archivo");
		menuBar.add(mnuArchivo);
		
		JMenuItem mniNuevo = new JMenuItem("Nuevo");
		mnuArchivo.add(mniNuevo);
		
		JMenuItem mniAbrir = new JMenuItem("Abrir");
		mnuArchivo.add(mniAbrir);
		
		JMenuItem mniGuardar = new JMenuItem("Guardar");
		mnuArchivo.add(mniGuardar);
		
		JMenuItem mniGuardarComo = new JMenuItem("Guardar como");
		mnuArchivo.add(mniGuardarComo);
		
		JMenuItem mniSalir = new JMenuItem("Salir");
		mnuArchivo.addSeparator();
		mnuArchivo.add(mniSalir);
		
		JMenu mnuAyuda = new JMenu("Ayuda");
		menuBar.add(mnuAyuda);
		
		JMenuItem mniManual = new JMenuItem("Manual");
		mnuAyuda.add(mniManual);
		
		JMenuItem mniAcercaDe = new JMenuItem("Acerca de");
		mnuAyuda.add(mniAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		txtArea = new JTextArea();
		contentPane.add(txtArea, BorderLayout.CENTER);
		txtArea.setVisible(false);
		
		
		//ASignamos eventos
		mniNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setVisible(true);
			}
		});
		
		mniAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado ABRIR");
				txtArea.setVisible(true);
				ctrl.CtrlPrincipal.seleccionarAbrir();
			}
		});
		
		mniGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado GURDAR");
				ctrl.CtrlPrincipal.escribir();
			}
		});
		
		mniGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado GUARDAR COMO");
				ctrl.CtrlPrincipal.seleccionarGuardar();
				ctrl.CtrlPrincipal.escribir();
			}
		});
		
		mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado SALIR");
				int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realmente salir?", "SALIR", JOptionPane.YES_NO_OPTION);
				if(opcion == 0) {
					ctrl.CtrlPrincipal.finalizar();
				}
			}
		});
		
		mniManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado MANUAL");
				new FrmManual();
			}
		});
		
		mniAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado ACERCA DE");
				new FrmAcercaDe();
			}
		});
		
	}
}

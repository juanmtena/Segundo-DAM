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
import javax.swing.JTextPane;

import java.awt.Toolkit;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JTextPane txtArea;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JuanLoreLeo\\Desktop\\logotipoEditorDeTexto.png"));
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
		
		JMenu mnuFormato = new JMenu("Formato");
		menuBar.add(mnuFormato);
		
		JMenuItem mniFuente = new JMenuItem("Fuente");
		mnuFormato.add(mniFuente);
		
		JMenuItem mniColores = new JMenuItem("Colores");
		mnuFormato.add(mniColores);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		txtArea = new JTextPane();
		contentPane.add(txtArea, BorderLayout.CENTER);
		txtArea.setVisible(false);
		
		
		//ASignamos eventos
		//NUEVO
		mniNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setVisible(true);
			}
		});
		
		//ABRIR
		mniAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setVisible(true);
				ctrl.CtrlPrincipal.seleccionarAbrir();
			}
		});
		
		//GUARDAR
		mniGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.escribir();
			}
		});
		
		//GUARDAR COMO
		mniGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.seleccionarGuardar();
				ctrl.CtrlPrincipal.escribir();
			}
		});
		
		//SALIR
		mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realmente salir?", "SALIR", JOptionPane.YES_NO_OPTION);
				if(opcion == 0) {
					ctrl.CtrlPrincipal.finalizar();
				}
			}
		});
		
		//MANUAL
		mniManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmManual();
			}
		});
		
		//ACERCA DE
		mniAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmAcercaDe();
			}
		});
		
		//FUENTE
		mniFuente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmFuente();
			}
		});
		
		//COLORES
		mniColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmColores();
			}
		});
		
		setVisible(true);
	}
}

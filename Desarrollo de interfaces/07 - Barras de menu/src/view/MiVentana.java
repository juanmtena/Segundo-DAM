package view;

import java.awt.event.*;
import java.awt.*;

public class MiVentana extends Frame{
	
	public static void main(String[] args) {
		MiVentana v = new MiVentana();
		v.crearVentana();
	}
	
	public void crearVentana() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setIconImage(Toolkit.getDefaultToolkit().createImage("logotipo.png"));
		
		setTitle("Crenado Menu");
		setBounds(50, 50, 600, 400);
		setLayout(new BorderLayout());// El tipo null es para tener total libertad de colocarlo donde quiera
		crearComponentes();
		setVisible(true);
		
		
	}
		
	private void crearComponentes() {
		
		TextArea txtBlocNotas = new TextArea();
		add(txtBlocNotas, BorderLayout.CENTER);
		
		MenuBar bar = new MenuBar();
		Menu mnuArchivo = new Menu("Archivo");
		Menu mnuExportar = new Menu("Exportar");
		Menu mnuEditar = new Menu("Editar");
		Menu mnuConvertir = new Menu("Convertir");
		Menu mnuImagen = new Menu("Imagen");
		Menu mnuBD = new Menu("BD");
		Menu mnuAyuda = new Menu("Ayuda");
		
		//ARCHIVO
		MenuItem mniAbrir = new MenuItem("Abrir");
		MenuItem mniGuardar = new MenuItem("Guardar");
		MenuItem mniGuardarComo = new MenuItem("Guardar como");
		MenuItem mniSalir = new MenuItem("Salir");
		
		MenuItem mniWord = new MenuItem("Word");
		MenuItem mniPDF = new MenuItem("PDF");
		MenuItem mniTexto = new MenuItem("Texto");
		
		//EDITAR
		MenuItem mniCopiar = new MenuItem("Copiar");
		MenuItem mniCortar = new MenuItem("Cortar");
		MenuItem mniPegar = new MenuItem("Pegar");
		MenuItem mniSelTodo = new MenuItem("Seleccionar Todo");		
		
		//CONVERTIR
		MenuItem mniImagen = new MenuItem("Imagen");
		MenuItem mniBD = new MenuItem("BD");		
			
		MenuItem mniJPG = new MenuItem("JPG");
		MenuItem mniPNG = new MenuItem("PNG");
		MenuItem mniBMP = new MenuItem("BMP");
		MenuItem mniOracle = new MenuItem("Oracle");
		MenuItem mnniMySQL = new MenuItem("MySQL");
		MenuItem mniAcccess = new MenuItem("Acccess");
		
		//AYUDA
		
		
		
		//Archivo
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(mniGuardarComo);
		mnuArchivo.add(mnuExportar);
		mnuArchivo.addSeparator();
		mnuArchivo.add(mniSalir);
		
		mnuExportar.add(mniWord);
		mnuExportar.add(mniPDF);
		mnuExportar.add(mniTexto);
		
		//Editar
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniCortar);
		mnuEditar.add(mniPegar);
		mnuEditar.addSeparator();
		mnuEditar.add(mniSelTodo);
		
		//Convertir
		mnuConvertir.add(mniImagen);
		mnuConvertir.add(mniBD);
		
		mnuImagen.add(mniJPG);
		mnuImagen.add(mniPNG);
		mnuImagen.add(mniBMP);
		
		bar.add(mnuArchivo);
		bar.add(mnuEditar);
		bar.add(mnuConvertir);
		
		setMenuBar(bar);
		
		//ASignamos eventos
		mniAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado ABRIR");
			}
		});
		
		mniGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado GUARDAR");
			}
		});

		mniGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has seleccionado GUARDAR COMO");
			}
		});
		
		mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}

}

package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Jugador;
import model.Partida;

public class GestionFicherosXML {

	private Document docXML;
	
	public GestionFicherosXML(String fileName) {
		
		try {
			
			docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileName);
			docXML.getDocumentElement().normalize();
			
		}catch(SAXException e) {
			System.err.println("Error SAX.");
		} catch(ParserConfigurationException e) {
			System.err.println("Error con el Parser.");
		} catch(IOException e) {
			System.err.println("Error accediendo al fichero.");
		}
		
	}
	
	public void mostrarDocumento() {
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		
		String expression = "/game/jugador";
		
		try {
			//Carga en memoria todas las listas de los nodos
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
			
			//
			for(int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);//Guardo cada uno de los nodos que yo tengo
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {//Si el nodo que he leido se corresponde con un elemento
					Element eElement = (Element) nNode;
					System.out.println("Jugador numero: " + eElement.getAttribute("numero"));
					System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("Apellidos: " + eElement.getElementsByTagName("apellidos").item(0).getTextContent());
					System.out.println("Nick: " + eElement.getElementsByTagName("nick").item(0).getTextContent());
					System.out.println("Puntos: " + eElement.getElementsByTagName("puntos").item(0).getTextContent());
					System.out.println("------------------------------------------");
				}
			}
			
		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresion.");
		} 
		
	}
	
	//Mostrar los jugadores guardados en un array
	public ArrayList<Jugador> getJugadores() {
		
		ArrayList<Jugador> listado = new ArrayList();
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		
		String expression = "/game/jugador";
		
		try {
			//Carga en memoria todas las listas de los nodos
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
			
			//
			for(int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);//Guardo cada uno de los nodos que yo tengo
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {//Si el nodo que he leido se corresponde con un elemento
					Element eElement = (Element) nNode;
					int numero = Integer.parseInt(eElement.getAttribute("numero"));
					String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
					String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
					String nick = eElement.getElementsByTagName("nick").item(0).getTextContent();
					int puntos = Integer.parseInt(eElement.getElementsByTagName("puntos").item(0).getTextContent());
					listado.add(new Jugador(numero, nombre, apellidos, nick, puntos));
				}
			}
			
		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresion.");
		}
		
		return listado;
	}
	
	/*
	public ArrayList<Partida> getPartidas() {
		
		ArrayList<Partida> listado = new ArrayList();
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		
		String expression = "/game/partida";
		
		try {
			//Carga en memoria todas las listas de los nodos
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
			
			//
			for(int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);//Guardo cada uno de los nodos que yo tengo
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {//Si el nodo que he leido se corresponde con un elemento
					Element eElement = (Element) nNode;
					int numero = Integer.parseInt(eElement.getAttribute("numero"));
					String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
					String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
					String nick = eElement.getElementsByTagName("nick").item(0).getTextContent();
					int puntos = Integer.parseInt(eElement.getElementsByTagName("puntos").item(0).getTextContent());
					listado.add(new Partida(numero, nombre, apellidos, nick, puntos));
				}
			}
			
		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresion.");
		}
		
		return listado;
	}
	*/
	
	public void addJugador(Jugador j) {
		
		Element item = docXML.createElement("jugador");//Lo que necesito para instanciar el grupo con el que estoy trabajando
		
		item.setAttribute("numero", "" + j.getNumero());//Para añadir elementos al item y como necesitamos que sea un String, le ponemos las comillas y lo concatenamos
		
		Element tagName;
		Node tagValue;
		
		// Vamos a crear <nombre>
		tagName = docXML.createElement("nombre");//Para crear una etiqueta
		tagValue = docXML.createTextNode(j.getNombre());//Para darle el valor a la etiqueta nombre
		tagName.appendChild(tagValue);//Para asignarle el valor a la etiqueta 
		item.appendChild(tagName);//Dentro de jugador tengo una etiqueta llamada nombre con el valor que le hemos dado
		
		// Vamos a crear <apellidos>
		tagName = docXML.createElement("apellidos");
		tagValue = docXML.createTextNode(j.getApellidos());
		tagName.appendChild(tagValue);
		item.appendChild(tagName);
		
		// Vamos a crear <nick>
		tagName = docXML.createElement("nick");
		tagValue = docXML.createTextNode(j.getNick());
		tagName.appendChild(tagValue);
		item.appendChild(tagName);
		
		// Vamos a crear <puntos>
		tagName = docXML.createElement("puntos");
		tagValue = docXML.createTextNode("" + j.getPuntos());
		tagName.appendChild(tagValue);
		item.appendChild(tagName);
		
		//Para guardar en memoria RAM el nuevo jugador en el nodo raiz
		Node nRaiz = docXML.getFirstChild();
		nRaiz.appendChild(item);
		
	}
	
	public void savData() {
		
		try {
			Transformer tr = TransformerFactory.newInstance().newTransformer();//Para decirle las caracteristicas que quiero que tenga
			tr.setOutputProperty(OutputKeys.INDENT, "yes");//Propiedad para decirle que tenga tabuladores
			tr.setOutputProperty(OutputKeys.METHOD, "xml");//Lo convierte a XML
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tr.setOutputProperty("{http//xml.apache.org/xslt}indent-amount", "4");//Cuantos caracteres tiene de indentado
			
			//Enviar el DOM al fichero
			tr.transform(new DOMSource(docXML)//Documento origen que contiene la informacion
					, new StreamResult(new FileOutputStream("nuevosdatos.xml"))//Documento destino donde vamos a guardar
					);
			
			
		} catch (Exception e) {
			
		}
		
	}
	
}

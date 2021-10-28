package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.CCAA;
import model.Jugador;
import model.Provincia;

public class GestionTemperatura {

private static Document docXML;
	
	public GestionTemperatura(String fileName) {
		
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
	
	public ArrayList<CCAA> getJugadores() {
		
		ArrayList<CCAA> listado = new ArrayList<CCAA>();
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		
		String expression = "/root/ccaa";
		
		try {
			//Carga en memoria todas las listas de los nodos
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
			
			//
			for(int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);//Guardo cada uno de los nodos que yo tengo
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {//Si el nodo que he leido se corresponde con un elemento
					Element eElement = (Element) nNode;
					String id = eElement.getAttribute("id");
					String nombre = eElement.getAttribute("nombre");
					ArrayList<Provincia> provincias = controller.getCiudades();
					listado.add(new Provincia(id, nombre));
				}
			}
			
		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresion.");
		}
		
		return listado;
	}
	
}

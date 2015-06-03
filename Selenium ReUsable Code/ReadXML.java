package Practice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class ReadXML {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		
		//Declare file path
		File xmlFile = new File("");
		
		//Create instance for documet builder factory
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		Document doc = dbBuilder.parse(xmlFile);
		
		//Get node List for xml 
		NodeList nlXml = doc.getChildNodes();
		
		//Get xml first node 
		
		Node nXml = nlXml.item(0);
		
		//Assign node
		Element element = (Element)nXml;
		
		//Print application Url by Tag Name 
		
		System.out.println("URL : " +element.getElementsByTagName("App_URL").item(0));

	}

}
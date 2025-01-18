package com.adlitteram.chapter11.ex03;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class WritingXML {
    public static void main(String[] args) {
        File xmlFile = new File("cars.xml");
        Document dom = LoadXMLDocument(xmlFile);

        NodeList owners = dom.getElementsByTagName("owner");
        for (int i = 0; i < owners.getLength(); i++) {
            Element owner = (Element) owners.item(i);
            owner.setAttribute("name", "Mike");
        }

        WriteXMLDocument(dom, xmlFile);
    }

    private static void WriteXMLDocument(Document doc, File destination) {
        try {
            // Write doc to destination file here...
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            StreamResult result = new StreamResult(destination);
            DOMSource source = new DOMSource(doc);

            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            System.err.println("XML writing failed.");
        } catch (TransformerException e) {
            System.err.println("XML writing failed.");
        }
    }

    private static Document LoadXMLDocument(File source) {
        Document dom = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            dom = builder.parse(source);
        } catch (ParserConfigurationException e) {
            System.err.println("XML loading failed.");
        } catch (SAXException e) {
            System.err.println("XML loading failed.");
        } catch (IOException e) {
            System.err.println("XML loading failed.");
        }

        return dom;
    }
}

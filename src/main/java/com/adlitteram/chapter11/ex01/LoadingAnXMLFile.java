package com.adlitteram.chapter11.ex01;

import org.w3c.dom.Document;
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
import java.io.IOException;
import java.io.StringWriter;

public class LoadingAnXMLFile {
    public static void main(String[] args) {
        Document dom;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            // Write code that can throw errors here...
            DocumentBuilder builder = factory.newDocumentBuilder();
            dom = builder.parse("cars.xml");

            PrintXmlDocument(dom);
        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

    private static void PrintXmlDocument(Document xml) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(xml);
            transformer.transform(source, result);
            System.out.println(result.getWriter().toString());
        } catch (TransformerConfigurationException e) {
            System.err.println("XML Printing Failed");
        } catch (TransformerException e) {
            System.err.println("XML Printing Failed");
        }
    }
}
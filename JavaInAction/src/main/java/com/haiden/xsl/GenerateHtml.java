package com.haiden.xsl;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class GenerateHtml
{
	public static void main(String[] args)
	{

		String xmlFileName = "F:\\test\\testXsl\\catalog.xml";
		String xslFileName = "F:\\test\\testXsl\\catalog.xsl";
		String htmlFileName = "F:\\test\\testXsl\\catalog.html";
		Transform(xmlFileName, xslFileName, htmlFileName);
	}

	public static void Transform(String xmlFileName, String xslFileName, String htmlFileName)
	{
		try
		{
			TransformerFactory tFac = TransformerFactory.newInstance();
			Source xslSource = new StreamSource(xslFileName);
			Transformer t = tFac.newTransformer(xslSource);
			File xmlFile = new File(xmlFileName);
			File htmlFile = new File(htmlFileName);
			Source source = new StreamSource(xmlFile);
			Result result = new StreamResult(htmlFile);
			System.out.println(result.getSystemId());
			t.transform(source, result);
		} catch (TransformerConfigurationException e)
		{
			e.printStackTrace();
		} catch (TransformerException e)
		{
			e.printStackTrace();
		}
	}
}

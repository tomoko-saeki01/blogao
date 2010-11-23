package br.edu.ufcg.blogao.GUI;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import br.edu.ufcg.blogao.webservice.BlogWSImpl;

public class Blogao {
	
	private BlogWSImpl webService;
	
	public Blogao() {
		webService = new BlogWSImpl();
	}
	
	public static Blogao loadBlogao() {
        try {
            XMLDecoder decoder = new XMLDecoder(new FileInputStream("build.xml"));
            Blogao gcp = (Blogao) decoder.readObject();
            decoder.close();
            return gcp;
        } catch (FileNotFoundException ex) {
            return new Blogao();
        }
    }
	
	public void store() {
        try {
            XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(
                    new FileOutputStream("build.xml")));
            encoder.writeObject(this);
            encoder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Could not write.");
        }
    }
}
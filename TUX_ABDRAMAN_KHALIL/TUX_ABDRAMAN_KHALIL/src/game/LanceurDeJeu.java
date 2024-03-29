/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;


/**
 *
 * @author Khalil
 */

public class LanceurDeJeu {
    
    public static void main(String[] args) throws IOException, SAXException, TransformerException, TransformerConfigurationException, ParserConfigurationException {
            
        Room room = new Room() ;

        // Declaration d'un jeu
        Jeu jeu ;

        // Instanciation du jeu
        jeu = new JeuDevineLeMotOrdre() ;

        // Execution du jeu
        jeu.execute();
        
    }

}
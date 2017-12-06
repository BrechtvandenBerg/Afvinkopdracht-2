package afvink2blok6;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yea-boi
 */
public class afvink2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader filereader = null;
        try {
            String path = "/home/yea-boi/Downloads/Homo_sapiens.gene_info";
            
            BufferedReader readme = new BufferedReader(new FileReader(path));
            ArrayList<gene> genes = new ArrayList<>();
            String sCurrentLine = readme.readLine();
            while ((sCurrentLine = readme.readLine()) != null) {
                String[] splitje = sCurrentLine.split("\t");
                int gene_id = Integer.parseInt(splitje[1]);
                String symbol = splitje[2];
                String map_location = splitje[6];
                genes.add(new gene(gene_id, symbol, map_location));
                //System.out.println(gene_id+"\t"+symbol+"\t"+map_location);
                
            }
            
            Collections.sort(genes);
            for (gene gentje : genes){
                //System.out.println(gentje.getChromosome_map_location()+"\t"+gentje.getSymbol()+"\t"+gentje.getGene_id());
            
            }
            readme.close();
            int amount = 100;
            int run = 1;
            while (amount < 100000){
                amount = 1000 * run;
                run = run +1;
                long start = System.nanoTime();
                int counter = 0;
                while (counter < amount){
                genes.add(new gene(123,"lol","X"));
                counter++;
            }
                System.out.println(amount+"\t"+(System.nanoTime()-start));
            }
            //O(n) voor insert in array
            //O(1) voor ophalen index
            //O(n) voor ophalen van gene_id
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(afvink2_2.class.getName()).log(Level.SEVERE, null, ex);

        }     
        System.out.println(isATGCrec("ATGC")); 
        System.out.println(isATGCite("ATGC",0));

}
   
    static boolean recursive(char ch)    {
        
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='T' || ch=='G' || ch== 'C');
                          
    }
      
    // Returns count of vowels in str
    static boolean isATGCrec(String str)
    {
        
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (!recursive(str.charAt(i))) // Check for vowel
                return false;
        return true;
    }
    static boolean iterative(char ch)
    {
        ch = Character.toUpperCase(ch);
       if(ch=='A' || ch=='T' || ch=='C' ||
            ch=='G' ) 
           return true;
       else return false;
    }
      
    // to count total number of vowel from 0 to n
    static boolean isATGCite(String str, int n)
    {
        
        if (str.length()==n){
            return true;
        } else {
            if (!iterative(str.charAt(n))){
                return false;
            }
            return isATGCite(str, n+1);
        }
      //O(n) iteratief
      //O(n2) recursive
    }
}


                
                
    

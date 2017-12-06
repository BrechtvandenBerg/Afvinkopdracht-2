package afvink2blok6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yea-boi
 */
public class gene implements Comparable<gene> {    
    
    private int gene_id;
    private String symbol ;
    private String chromosome_map_location;

    gene(int gene_id, String symbol, String map_location) {
        this.gene_id = gene_id;
        this.symbol= symbol;
        this.chromosome_map_location = map_location;
     
    
    }
    /**
     * @return the gene_id
     */
    public int getGene_id() {
        return gene_id;
    }

    /**
     * @param gene_id the gene_id to set
     */
    public void setGene_id(int gene_id) {
        this.gene_id = gene_id;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the chromosome_map_location
     */
    public String getChromosome_map_location() {
        return chromosome_map_location;
    }

    /**
     * @param chromosome_map_location the chromosome_map_location to set
     */
    public void setChromosome_map_location(String chromosome_map_location) {
        this.chromosome_map_location = chromosome_map_location;
    }  

    @Override
    public int compareTo(gene o) {
    return getChromosome_map_location().compareTo(o.getChromosome_map_location());
    }
    
}

/*
 * Evento.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Vinícius de Oliveira - 251527
 */
public abstract class Evento {
    private String nome;
    private Local local;
    private double precoIngresso;
    private String data;

    /**
     * Construtor da classe Evento
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     */
    public Evento(String nome, Local local, double precoIngresso, String data){
        this.nome = nome;
        this.local = local;
        this.precoIngresso = precoIngresso;
        this.data = data;
    }

    /**
     * Retorna o nome do Evento
     * @return o nome do Evento
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do Evento para `nome` 
     * @param nome o novo nome do Evento
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Retorna a data do Evento
     * @return a data do Evento
     */
    public String getData(){
        return data;
    }

    /**
     * Altera a data do Evento para `nome` 
     * @param data a nova data do Evento
     */
    public void setData(String data){
        this.data = data;
    }
    
    /**
     * Retorna o preço do ingresso do Evento
     * @return o precoIngresso do Evento
     */
    public double getPrecoIngresso(){
        return precoIngresso;
    }

    /**
     * Retorna o nome do local do Evento
     * @return o nome do local do Evento
     */
    public String getNomeLocal(){
        return local.getNome();
    }

    /**
     * Altera o precoIngresso do Evento para `precoIngresso` 
     * @param precoIngresso o novo precoIngresso do Evento
     */
    public void setPrecoIngresso(double precoIngresso){
        this.precoIngresso = precoIngresso;
    }
}

/*
 * Ingresso.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

import java.util.Random;

/**
 * Contém a estrutura de implementação de um Ingresso.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Vinícius de Oliveira - 251527
 */
public abstract class Ingresso {
    private Evento evento;
    private int codigo;

    /**
     * Construtor da classe Ingresso
     * @param evento o evento associado ao Ingresso
     * @param codigo o codigo associado ao Ingresso
     */
    public Ingresso(Evento evento){
        this.evento = evento;
        this.codigo = geraCodigo();
    }

    /**
     * Retorna um código aleatório para o ingresso
     * @return o código aleatório para o ingresso
     */
    private int geraCodigo(){
        int max = 9999;
        int min = 1000;
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    public abstract double getPreco();
    
}

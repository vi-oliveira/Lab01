/*
 * IngressoMeia.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

import java.util.Random;

/**
 * Contém a estrutura de implementação de um IngressoMeia.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class IngressoMeia extends Ingresso {
    private Evento evento;
    int codigo;
    
    /**
     * Construtor da classe IngressoMeia
     * @param evento o evento associado ao Ingresso
     */
    public IngressoMeia(Evento evento) {
        // super(evento, geraCodigo());
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
    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso()/2;  // 50% de desconto
    }
}
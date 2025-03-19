/*
 * Ingresso.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

import java.util.UUID;

/**
 * Contém a estrutura de implementação de um Ingresso.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Vinícius de Oliveira - 251527
 */
public abstract class Ingresso {
    private Evento evento;
    private UUID codigo;

    /**
     * Construtor da classe Ingresso
     * @param evento o evento associado ao Ingresso
     */
    public Ingresso(Evento evento){
        this.evento = evento;
        this.codigo = UUID.randomUUID();
    }

    // public void testUUID(){
        // System.out.println(this.codigo);
    // }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    public abstract double getPreco();
    
}

/*
 * Ingresso.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Ingressos;

import java.util.UUID;

import lab01.Eventos.Evento;

/**
 * Contém a estrutura de implementação de um Ingresso.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Vinícius de Oliveira - 251527
 */
public abstract class Ingresso {
    private UUID codigo;
    protected Evento evento;

    /**
     * Construtor da classe Ingresso
     * @param evento o evento associado ao Ingresso
     */
    public Ingresso(Evento evento){
        this.evento = evento;
        this.codigo = UUID.randomUUID();
    }

    /**
     * Retorna o código do evento
     * @return o código do evento
     */
    public UUID getCodigo(){
        return codigo;
    }

    /**
     * Retorna o evento associado ao ingresso
     * @return o evento associado ao ingresso
     */
    public Evento getEvento(){
        return evento;
    }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    public abstract double getPreco();
    
}

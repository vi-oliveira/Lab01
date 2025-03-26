/*
 * IngressoMeia.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Ingressos;

import lab01.Eventos.Evento;

/**
 * Contém a estrutura de implementação de um IngressoMeia.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class IngressoMeia extends Ingresso {
    
    /**
     * Construtor da classe IngressoMeia
     * @param evento o evento associado ao Ingresso
     */
    public IngressoMeia(Evento evento) {
        super(evento);
    }

    /**
     * Retorna o preço do IngressoMeia (50% de desconto)
     * @return o preço do IngressoMeia
     */
    @Override
    public double getPreco() {
        return super.evento.getPrecoIngresso() / 2;
    }
}
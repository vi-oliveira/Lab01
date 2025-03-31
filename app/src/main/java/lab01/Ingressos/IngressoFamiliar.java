/*
 * IngressoFamiliar.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Ingressos;

import lab01.Eventos.Evento;

/**
 * Contém a estrutura de implementação de um IngressoFamiliar.
 * Tipo de ingresso para familiares dos envolvidos no evento. 
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class IngressoFamiliar extends Ingresso {
    
    /**
     * Construtor da classe IngressoFamiliar
     * @param evento o evento associado ao Ingresso
     */
    public IngressoFamiliar(Evento evento){
        super(evento);
    }

    /**
     * Retorna o preço do IngressoFamiliar (25% de desconto)
     * @return o preço do IngressoFamiliar
     */
    @Override
    public double getPreco(){
        return super.evento.getPrecoIngresso() * 0.75;
    }
}
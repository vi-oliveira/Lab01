/*
 * IngressoVIP.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um IngressoVIP.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class IngressoVIP extends Ingresso {
    private Evento evento;
    
    /**
     * Construtor da classe IngressoInteira
     * @param evento o evento associado ao Ingresso
     */
    public IngressoVIP(Evento evento){
        super(evento);
    }

    /**
     * Retorna o preço do IngressoVIP
     * @return o preço do IngressoVIP
     */
    @Override
    public double getPreco () {
        return super.evento.getPrecoIngresso() * 1.5;
    }
}
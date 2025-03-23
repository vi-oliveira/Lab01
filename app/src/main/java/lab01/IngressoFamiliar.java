/*
 * IngressoFamiliar.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um IngressoFamiliar.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class IngressoFamiliar extends Ingresso {
    private Evento evento;
    
    /**
     * Construtor da classe IngressoFamiliar
     * @param evento o evento associado ao Ingresso
     */
    public IngressoFamiliar(Evento evento){
        super(evento);
    }

    /**
     * Retorna o preço do IngressoFamiliar
     * @return o preço do IngressoFamiliar
     */
    @Override
    public double getPreco () {
        return super.evento.getPrecoIngresso() * 0.75;  // 25% de desconto
    }
}
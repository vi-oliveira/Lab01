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
    int codigo;
    
    /**
     * Construtor da classe IngressoFamiliar
     * @param evento o evento associado ao Ingresso
     * @param codigo o codigo associado ao Ingresso
     */
    public IngressoFamiliar(Evento evento, int codigo){
        super(evento, codigo);
    }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso() * 0.75;  // 25% de desconto
    }
}
/*
 * ingressoInteira.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
* Contém a estrutura de implementação de um IngressoInteira.
* 
* @author Vinícius de Oliveira - 251527
*/
public class IngressoInteira extends Ingresso{
    private Evento evento;
    private int codigo;

    /**
     * Construtor da classe IngressoInteira
     * @param evento o evento associado ao Ingresso
     * @param codigo o codigo associado ao Ingresso
     */
    public IngressoInteira(Evento evento, int codigo){
        super(evento, codigo);
    }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso();
    }
}

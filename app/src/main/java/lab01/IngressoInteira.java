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

    /**
     * Construtor da classe IngressoInteira
     * @param evento o evento associado ao Ingresso
     */
    public IngressoInteira(Evento evento){
        super(evento);
    }

    /**
     * Retorna o preço do IngressoInteira
     * @return o preço do IngressoInteira
     */
    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso();
    }
}

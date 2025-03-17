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
    
    public IngressoFamiliar(Evento evento, int codigo){
        super(evento, codigo);
    }

    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso() * 0.75;
    }
}
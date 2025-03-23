/*
 * EventoFestival.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um EventoEsporte.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoFestival extends Evento {
    private String nome;
    private String tema;
    private Double precoIngresso;
    private Local local;
    private String data;
    
    /**
     * Construtor da classe EventoEsporte
     * @param nome o nome do Evento
     * @param tema o tema do festival
     * @param precoIngresso o preço do ingresso do Evento
     * @param local o local associado ao Evento
     * @param data a data do Evento
     */
    public EventoFestival(String nome, String tema,
    Double precoIngresso, Local local, String data){
        super(nome, local, precoIngresso, data);
        this.tema = tema;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes () {
        System.out.println("Nome do festival: " + this.getNome());
        System.out.println("Tema do festival: " + this.tema);
        System.out.println("Preço do ingresso:  R$" + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Data: " + this.getData());
    }
}

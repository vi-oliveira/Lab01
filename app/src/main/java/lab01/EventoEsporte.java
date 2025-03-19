/*
 * EventoEsporte.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um EventoEsporte.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoEsporte extends Evento {
    private String nome;
    private String esporte;
    private int duracao;
    private Double precoIngresso;
    private Local local;
    private String data;
    
    /**
     * Construtor da classe EventoEsporte
     * @param nome o nome do Evento
     * @param esporte o esporte relacionado ao Evento
     * @param duracao a duração da partida do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param local o local associado ao Evento
     * @param data a data do Evento
     */
    public EventoEsporte(String nome, String esporte, int duracao,
    Double precoIngresso, Local local, String data){
        super(nome, local, precoIngresso, data);
        this.esporte = esporte;
        this.duracao = duracao;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes () {
        System.out.println("Nome do evento: " + this.getNome());
        System.out.println("Esporte: " + this.esporte);
        System.out.println("Duração da partida: " + this.duracao + " minutos");
        System.out.println("Preço do ingresso:  R$" + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + this.getNomeLocal());
        System.out.println("Data: " + this.getData());
    }
}

/*
 * EventoPalestra.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um EventoPalestra.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoPalestra extends Evento{
    private String nome;
    private String nomePalestrante;
    private String tema;
    private int duracao;
    private Double precoIngresso;
    private Local local;
    private String data;
    
    /**
     * Construtor da classe EventoTeatro
     * @param nome o nome da peça
     * @param nomePalestrante o nome do palestrante
     * @param tema o tema da palestra
     * @param duracao a duração da palestra
     * @param precoIngresso o preço do ingresso do Evento
     * @param local o local associado ao Evento
     * @param data a data do Evento
     */
    public EventoPalestra(String nome, String nomePalestrante,
    String tema, int duracao, Double precoIngresso, Local local, String data) {
        super(nome, local, precoIngresso, data);
        this.nomePalestrante = nomePalestrante;
        this.tema = tema;
        this.duracao = duracao;
    }

    /**
     * Imprime os dados relacionados à palestra
     */
    public void exibirDetalhes () {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nome do palestrante: " + this.nomePalestrante);
        System.out.println("Tema da palestra: " + this.tema);
        System.out.println("Duração: " + this.duracao + " minutos");
        System.out.println("Preço do ingresso: R$"
        + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Data: " + this.getData());
    }
}

/*
 * EventoTeatro.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

import java.util.List;

/**
 * Contém a estrutura de implementação de um EventoTeatro.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoTeatro extends Evento {
    private String nome;
    private List<String> atores;
    private int duracao;
    private Double precoIngresso;
    private Local local;
    private String data;
    
    /**
     * Construtor da classe EventoTeatro
     * @param nome o nome da peça
     * @param atores List com o nome dos atores
     * @param duracao a duração do teatro
     * @param precoIngresso o preço do ingresso do Evento
     * @param local o local associado ao Evento
     * @param data a data do Evento
     */
    public EventoTeatro(String nome, List<String> atores,
    int duracao, Double precoIngresso, Local local, String data) {
        super(nome, local, precoIngresso, data);
        this.atores = atores;
        this.duracao = duracao;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes() {
        System.out.println("Nome do evento: " + this.getNome());
        System.out.println("Duração: " + this.duracao + " minutos");
        System.out.println("Preço do ingresso: R$" + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Data: " + this.getData());
        for (int i = 0; i < atores.size(); i++){
            System.out.println("Ator(a) " + i + ": " + this.atores.get(i));
        }
    }
}

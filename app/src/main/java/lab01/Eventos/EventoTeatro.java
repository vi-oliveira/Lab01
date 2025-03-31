/*
 * EventoTeatro.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import java.util.List;

import lab01.Local;

/**
 * Contém a estrutura de implementação de um EventoTeatro.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoTeatro extends Evento implements FiltroEventos {
    private List<String> atores;
    private int duracao;
    
    /**
     * Construtor da classe EventoTeatro
     * @param nome o nome da peça
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param data a data do Evento
     * @param atores List com o nome dos atores
     * @param duracao a duração do teatro
     */
    public EventoTeatro(String nome, Local local, Double precoIngresso,
    String data, List<String> atores, int duracao) {
        super(nome, local, precoIngresso, data);
        this.atores = atores;
        this.duracao = duracao;
    }

    /**
     * Retorna a duração da palestra em minutos
     * @return a duração da palestra em minutos
     */
    public List<String> getAtores(){
        return atores;
    }

    /**
     * Altera a lista de atores para 'atores'
     * @param atores a nova lista de atores
     */
    public void setAtores(List<String> atores){
        this.atores = atores;
    }

    /**
     * Retorna a duração da peça em minutos
     * @return a duração da peça em minutos
     */
    public int getDuracao(){
        return duracao;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes() {
        System.out.println("Nome do evento: " + this.getNome());
        System.out.println("Duração: " + this.duracao + " minutos");
        System.out.println("Preço do ingresso: R$"
        + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Data: " + this.getData());
        for (int i = 0; i < atores.size(); i++){
            System.out.println("Integrante " + (i + 1) + ": " + this.atores.get(i));
        }
    }

    /**
     * Busca peças de teatro com pelo menos 1 hora de duração
     * @param evento o evento que será verificado
     * @return True ou False para o caso do evento atender ou não aos requisitos
     */
    @Override
    public boolean filtrar(Evento evento){
        if (evento instanceof EventoTeatro){
            EventoTeatro outroTeatro = (EventoTeatro) evento;
            return (outroTeatro.getDuracao() >= 60);
        } else {
            return false ;
        }
    }
}

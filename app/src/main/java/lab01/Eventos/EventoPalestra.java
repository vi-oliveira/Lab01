/*
 * EventoPalestra.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import lab01.Local;

/**
 * Contém a estrutura de implementação de um EventoPalestra.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoPalestra extends Evento implements FiltroEventos {
    private String nomePalestrante;
    private String tema;
    private int duracao;
    
    /**
     * Construtor da classe EventoTeatro
     * @param nome o nome da peça
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param data a data do Evento
     * @param nomePalestrante o nome do palestrante
     * @param tema o tema da palestra
     * @param duracao a duração da palestra
     */
    public EventoPalestra(String nome, Local local, Double precoIngresso,
    String data, String nomePalestrante, String tema, int duracao) {
        super(nome, local, precoIngresso, data);
        this.nomePalestrante = nomePalestrante;
        this.tema = tema;
        this.duracao = duracao;
    }

    /**
     * Retorna o nome do palestrante
     * @return o nome do palestrante
     */
    public String getNomePalestrante(){
        return nomePalestrante;
    }

    /**
     * Altera o nome do palestrante para 'nomePalestrante'
     * @param nomePalestrante o novo nome do palestrante
     */
    public void setNome(String nomePalestrante){
        this.nomePalestrante = nomePalestrante;
    }

    /**
     * Retorna o tema da palestra
     * @return o tema da palestra
     */
    public String getTema(){
        return tema;
    }

    /**
     * Altera o tema da palestra para 'tema' 
     * @param tema o novo tema da palestra
     */
    public void setTema(String tema){
        this.tema = tema;
    }

    /**
     * Retorna a duração da palestra em minutos
     * @return a duração da palestra em minutos
     */
    public int getDuracao(){
        return duracao;
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

    /**
     * Busca palestras de tema 'saúde'
     * @param evento o evento que será verificado
     * @return True ou False para o caso do evento atender ou não aos requisitos
     */
    @Override
    public boolean filtrar(Evento evento){
        if (evento instanceof EventoPalestra){
            EventoPalestra outroPalestra = (EventoPalestra) evento;
            return (outroPalestra.getTema() == "saúde");
        } else {
            return false ;
        }
    }
}

/*
 * EventoFestival.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import java.util.List;

import lab01.Local;

/**
 * Contém a estrutura de implementação de um EventoEsporte.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoFestival extends Evento implements FiltroEventos {
    private String tema;
    private List<String> patrocinadores;
    
    /**
     * Construtor da classe EventoEsporte
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param data a data do Evento
     * @param tema o tema do festival
     * @param patrocinadores uma lista dos patrocinadores do evento
     */
    public EventoFestival(String nome, Local local, Double precoIngresso,
    String data, String tema, List<String> patrocinadores){
        super(nome, local, precoIngresso, data);
        this.tema = tema;
        this.patrocinadores = patrocinadores;
    }

    /**
     * Retorna o tema do festival
     * @return o tema do festival
     */
    public String getTema(){
        return tema;
    }

    /**
     * Altera o tema do festival para `tema` 
     * @param tema o novo tema do festival
     */
    public void setTema(String tema){
        this.tema = tema;
    }

    /**
     * Retorna os patrocinadores festival
     * @return os patrocinadores festival
     */
    public List<String> getPatrocinadores(){
        return patrocinadores;
    }

    /**
     * Altera a lista de patrocinadores para 'patrocinadores'
     * @param patrocinadores a nova lista de patrocinadores
     */
    public void setPatrocinadores(List<String> patrocinadores){
        this.patrocinadores = patrocinadores;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes () {
        System.out.println("Nome do festival: " + this.getNome());
        System.out.println("Tema do festival: " + this.tema);
        System.out.println("Preço do ingresso:  R$"
        + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Data: " + this.getData());
        for (int i = 0; i < patrocinadores.size(); i++){
            System.out.println("Patrocinador " + (i + 1) + ": " + this.patrocinadores.get(i));
        }
    }

    /**
     * Busca festivais de tema 'alimentos'
     * @param evento o evento que será verificado
     * @return True ou False para o caso do evento atender ou não aos requisitos
     */
    @Override
    public boolean filtrar(Evento evento){
        if (evento instanceof EventoFestival){
            EventoFestival outroFestival = (EventoFestival) evento;
            return (outroFestival.getTema() == "alimentos");
        } else {
            return false ;
        }
    }
}

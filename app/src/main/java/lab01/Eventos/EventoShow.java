/*
 * EventoShow.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import lab01.Local;

/**
 * Contém a estrutura de implementação de um EventoShow.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoShow extends Evento implements FiltroEventos {
    private String artista;
    private String generoMusical;
    
    /**
     * Construtor da classe EventoShow
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param data a data do Evento
     * @param artista o nome do artista
     * @param generoMusical o generoMusical do show
     */
    public EventoShow(String nome, Local local, double precoIngresso,
    String data, String artista, String generoMusical){
        super(nome, local, precoIngresso, data);
        this.artista = artista;
        this.generoMusical = generoMusical;
    }

    /**
     * Retorna o nome do artista
     * @return o nome do artista
     */
    public String getArtista(){
        return artista;
    }

    /**
     * Altera o nome do artista para `nomeArtista` 
     * @param nomeArtista o novo nome do artista
     */
    public void setArtista(String nomeArtista){
        this.artista = nomeArtista;
    }
    
    /**
     * Retorna o gênero musical do show
     * @return o gênero musical do show
     */
    public String getGeneroMusical(){
        return generoMusical;
    }

    /**
     * Altera do gênero musical para do artista para `generoMusical` 
     * @param generoMusical o novo gênero musical
     */
    public void setGeneroMusical(String generoMusical){
        this.generoMusical = generoMusical;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes () {
        System.out.println("Nome do show: " + this.getNome());
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Artista: " + this.artista);
        System.out.println("Preço do ingresso:  R$"
        + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Data do show: " + this.getData());
    }

    @Override
    public boolean filtrar(Evento evento) {
        if (evento instanceof EventoShow) {
            EventoShow outroShow = (EventoShow) evento;
            return (outroShow.getCapacidade() >= 200);
        } else {
            return false ;
        }
    }
}

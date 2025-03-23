/*
 * EventoShow.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um EventoShow.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoShow extends Evento implements FiltroEventos {
    private String nome;
    private Local local;
    private int precoIngresso;
    private String artista;
    private String data;
    
    /**
     * Construtor da classe EventoShow
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param artista o nome do artista
     * @param data a data do Evento
     */
    public EventoShow(String nome, Local local, int precoIngresso, String artista, String data){
        super(nome, local, precoIngresso, data);
        this.artista = artista; 
    }

    /**
     * Retorna o nome do artista
     * @return o nome do artista
     */
    public String getArtista(){
        return artista;
    }

    /**
     * Altera o nome do artista para `nome` 
     * @param nomeArtista o novo nome do artista
     */
    public void setArtista(String nomeArtista){
        this.artista = nomeArtista;
    }

    /**
     * Retorna a capacidade do local do evento
     * @return a capacidade do local do evento
     */
    public Double getCapacidade(){
        return super.local.getCapacidade();
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
            // Compara generoMusical , duracao , etc . com outroShow
        } else {
            return false ;
        }
    }
}

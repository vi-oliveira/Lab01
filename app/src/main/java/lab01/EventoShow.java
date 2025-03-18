/*
 * EventoShow.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoShow extends Evento {
    private String nome;
    private Local local;
    private int duracao;
    private String artista;
    private String data;
    
    /**
     * Construtor da classe EventoShow
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param duracao a duração do Evento
     * @param artista o nome do artista
     * @param data a data do Evento
     */
    public EventoShow(String nome, Local local, int duracao,String artista, String data){
        super(nome, local, 100.00);
        this.artista = artista;
        this.duracao = duracao;
        this.data = data;
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
     * @param nome o novo nome do artista
     */
    public void setArtista(String nomeArtista){
        this.artista = nomeArtista;
    }

    /**
     * Retorna a capacidade do local do evento
     * @return a capacidade do local do evento
     */
    public Double getCapacidade(){
        return local.getCapacidade();
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes () {
        System.out.println("Nome do show:" + this.nome);
        System.out.println("Local:" + this.local);
        System.out.println("Artista:" + this.artista);
        System.out.println("Duração do show:" + this.duracao + " minutos");
        System.out.println("Data do show:" + this.data);
    }
}

package lab01;

import java.util.Date;

public class EventoShow extends Evento {
    private String nome;
    private String artista;
    private String generoMusical;
    private int duracao;
    private Double precoIngresso;
    private Local local;
    private Date data;
    
    public EventoShow(String nome, String artista, String generoMusical, int duracao, Double precoIngresso, Local local, Data data){
        super(nome, local, precoIngresso);
        this.artista = artista;
        this.generoMusical = generoMusical;
        this.duracao = duracao;
        this.data = data;
    }

    public void exibirDetalhes () {
        System.out.println("Nome do show:" + this.nome);
        System.out.println("Artista:" + this.artista);
        System.out.println("Gênero musical:" + this.generoMusical);
        System.out.println("Duração do show:" + this.duracao + " minutos");
        System.out.println("Preço do ingresso: R$" + this.precoIngresso);
        System.out.println("Local:" + this.local);
        System.out.println("Data do show:" + this.data);
    }
}

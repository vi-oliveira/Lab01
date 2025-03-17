package lab01;

import java.util.Date;

public class EventoEsporte extends Evento {
    private String nome;
    private String esporte;
    private int duracao;
    private Double precoIngresso;
    private Local local;
    private Date data;
    
    public EventoEsporte(String nome, String esporte, int duracao,
    Double precoIngresso, Local local, Data data){
        super(nome, local, precoIngresso);
        this.esporte = esporte;
        this.duracao = duracao;
        this.data = data;
    }

    public void exibirDetalhes () {
        System.out.println("Nome do evento:" + this.nome);
        System.out.println("Esporte:" + this.esporte);
        System.out.println("Duração da partida:" + this.duracao + " minutos");
        System.out.println("Preço do ingresso: R$" + this.precoIngresso);
        System.out.println("Local:" + this.local);
        System.out.println("Data:" + this.data);
    }
}

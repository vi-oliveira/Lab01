package lab01;

import java.util.Date;

public class EventoFestival extends Evento {
    private String nome;
    private int duracao;
    private Double precoIngresso;
    private Local local;
    private Date data;
    
    public EventoFestival(String nome, int duracao,
    Double precoIngresso, Local local, Data data){
        super(nome, local, precoIngresso);
        this.duracao = duracao;
        this.data = data;
    }

    public void exibirDetalhes () {
        System.out.println("Nome do festival:" + this.nome);
        System.out.println("Duração:" + this.duracao + " minutos");
        System.out.println("Preço do ingresso: R$" + this.precoIngresso);
        System.out.println("Local:" + this.local);
        System.out.println("Data:" + this.data);
    }
}

/*
 * EventoEsporte.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import lab01.Local;

/**
 * Contém a estrutura de implementação de um EventoEsporte.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class EventoEsporte extends Evento {
    private String esporte;
    private int duracao;
    private int pontosTime1;
    private int pontosTime2;
    private boolean partidaEmAndamento;
    
    /**
     * Construtor da classe EventoEsporte
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param data a data do Evento
     * @param esporte o esporte relacionado ao Evento
     * @param duracao a duração da partida do Evento
     */
    public EventoEsporte(String nome, Local local, Double precoIngresso,
    String data, String esporte, int duracao){
        super(nome, local, precoIngresso, data);
        this.esporte = esporte;
        this.duracao = duracao;
        this.partidaEmAndamento = false;
        this.pontosTime1 = 0;
        this.pontosTime2 = 0;
    }

    /**
     * Retorna esporte da partida
     * @return esporte da partida
     */
    public String getEsporte(){
        return esporte;
    }

    /**
     * Retorna a duração da palestra em minutos
     * @return a duração da palestra em minutos
     */
    public int getDuracao(){
        return duracao;
    }

    /**
     * Retorna os pontos do time 1
     * @return os pontos do time 1
     */
    public int getPontosTime1(){
        return pontosTime1;
    }

    /**
     * Retorna os pontos do time 2
     * @return os pontos do time 2
     */
    public int getPontosTime2(){
        return pontosTime2;
    }

    /**
     * Retorna o estado da partida (se está em andamento)
     * @return o estado da partida
     */
    public boolean getPartidaEmAndamento(){
        return partidaEmAndamento;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public void exibirDetalhes(){
        System.out.println("Nome do evento: " + this.getNome());
        System.out.println("Esporte: " + this.esporte);
        System.out.println("Duração da partida: " + this.duracao + " minutos");
        System.out.println("Preço do ingresso:  R$"
        + String.format("%.2f", this.getPrecoIngresso()));
        System.out.println("Local: " + super.local.getNome());
        System.out.println("Data: " + this.getData());
    }

    /**
     * Inicia a partida do evento
     */
    public void comecaPartida(){
        this.partidaEmAndamento = true;
        System.out.println("Começando a partida");
    }

    /**
     * Marca um ponto para um dos dois times.
     * A função só adiciona o ponto se a partida estiver em andamento
     * @param time o número do time que marcou um ponto
     */
    public void marcarPonto(int time){
        if (partidaEmAndamento){
            switch (time) {
                case 1:
                    this.pontosTime1 += 1;
                    break;
                
                case 2:
                    this.pontosTime2 += 1;
                    break;
    
                default:
                    System.out.println("Time inválido!");
                    break;
            }
        } else {
            System.out.println("A partida ainda não começou");
        }
    }

    /**
     * Imprime o placar da partida
     */
    public void exibirPlacar(){
        System.out.println("PLACAR:");
        System.out.println("Time 1: " + pontosTime1 + ", "
        + "Time 2: " + pontosTime2);
    }

    /**
     * Encerra a partida e imprime o time vencedor
     */
    public void terminaPartida(){
        this.partidaEmAndamento = false;
        System.out.println("FIM DA PARTIDA");
        if (this.pontosTime1 > this.pontosTime2){
            System.out.println("Vitória do time 1");
        } else if (this.pontosTime1 < this.pontosTime2){
            System.out.println("Vitória do time 2");
        } else {
            System.out.println("Empate");
        }
    }
}

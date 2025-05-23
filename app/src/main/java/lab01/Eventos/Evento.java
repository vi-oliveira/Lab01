/*
 * Evento.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import java.util.ArrayList;
import java.util.List;

import lab01.Local;
import lab01.Usuario;
import lab01.Ingressos.Ingresso;

/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Vinícius de Oliveira - 251527
 */
public abstract class Evento {
    /**
     * O local associado a este evento.
     */
    protected Local local;
    private String nome;
    private double precoIngresso;
    private String data;
    private List<Ingresso> ingressosVendidos;

    /**
     * Construtor da classe Evento
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param data a data do Evento
     */
    public Evento(String nome, Local local, double precoIngresso, String data){
        this.nome = nome;
        this.local = local;
        this.precoIngresso = precoIngresso;
        this.data = data;
        this.ingressosVendidos = new ArrayList<Ingresso>();
    }

    /**
     * Retorna o nome do Evento
     * @return o nome do Evento
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do Evento para `nome` 
     * @param nome o novo nome do Evento
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Retorna o local do Evento
     * @return o local do Evento
     */
    public Local getLocal(){
        return local;
    }

    /**
     * Altera o local do Evento para `local` 
     * @param local o novo local do Evento
     */
    public void setLocal(Local local){
        this.local = local;
    }
    
    /**
     * Retorna a capacidade do local do evento
     * @return a capacidade do local do evento
     */
    public Double getCapacidade(){
        return local.getCapacidade();
    }

    /**
     * Retorna o preço do ingresso do Evento
     * @return o precoIngresso do Evento
     */
    public double getPrecoIngresso(){
        return precoIngresso;
    }

    /**
     * Altera o precoIngresso do Evento para `precoIngresso` 
     * @param precoIngresso o novo precoIngresso do Evento
     */
    public void setPrecoIngresso(double precoIngresso){
        this.precoIngresso = precoIngresso;
    }

    /**
     * Retorna a lista de ingressos vendidos
     * @return a lista de ingressos vendidos
     */
    public List<Ingresso> getIngressosVendidos(){
        return ingressosVendidos;
    }

    /**
     * Altera a lista de ingressos vendidos para 'ingressosVendidos'
     * @param ingressosVendidos lista de ingressos vendidos
     */
    public void setIngressosVendidos(List<Ingresso> ingressosVendidos){
        this.ingressosVendidos = ingressosVendidos;
    }
    
    /**
     * Retorna a data do Evento
     * @return a data do Evento
     */
    public String getData(){
        return data;
    }

    /**
     * Altera a data do Evento para `nome` 
     * @param data a nova data do Evento
     */
    public void setData(String data){
        this.data = data;
    }

    /**
     * Adiciona um novo ingresso à lista de ingressos vendidos
     * @param ingresso o ingresso que foi vendido
     * @param usuario o usuario que comprou o ingresso
     */
    public void adicionarIngresso(Ingresso ingresso, Usuario usuario){
        this.ingressosVendidos.add(ingresso);
        usuario.setIngresso(ingresso);
    }
    
    /**
     * Calcula o faturamento total dos ingressos vendidos
     * @return o valor total faturado para o evento
     */
    public Double calculaFaturamento(){
        Double faturamento = 0.0;
        for (int i = 0; i < ingressosVendidos.size(); i++){
            faturamento += ingressosVendidos.get(i).getPreco();
        }
        return faturamento;
    }

    /**
     * Imprime os dados relacionados ao evento
     */
    public abstract void exibirDetalhes();
}

/*
 * HistoricoEventos.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um histórico de eventos.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public class HistoricoEventos {
    private List<Evento> eventos;

    /**
     * Construtor que inicializa a lista de eventos.
     */
    public HistoricoEventos(){
        this.eventos = new ArrayList<Evento>();
    }

    /**
     * Adiciona um evento ao histórico.
     *
     * @param evento O evento a ser adicionado.
     */
    public void adicionarEvento(Evento evento){
        this.eventos.add(evento);
    }

    /**
     * Retorna a lista de eventos registrados.
     *
     * @return Lista de eventos.
     */
    public List<Evento> getEventos(){
        return eventos;
    }

    /**
     * Busca eventos pelo nome.
     *
     * @param nome O nome do evento a ser buscado.
     * @return Lista de eventos que possuem o nome especificado.
     */
    public List<Evento> buscarEventosPorNome(String nome){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        
        for (Evento evento : this.eventos){
            if (evento.getNome() == nome){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }
    
    /**
     * Busca eventos por data.
     *
     * @param data A data do evento a ser buscado.
     * @return Lista de eventos que ocorreram na data especificada.
     */
    public List<Evento> buscarEventosPorData(String data){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        
        for (Evento evento : this.eventos){
            if (evento.getData() == data){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }
    
    /**
     * Busca eventos pelo nome do local.
     *
     * @param nomeLocal O nome do local onde os eventos ocorreram.
     * @return Lista de eventos que ocorreram no local especificado.
     */
    public List<Evento> buscarEventosPorLocal(String nomeLocal){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        
        for (Evento evento : this.eventos){
            if (evento.local.getNome() == nomeLocal){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }
    
    /**
     * Busca eventos por tipo.
     *
     * @param tipoEvento A classe do tipo de evento a ser buscado.
     * @return Lista de eventos que pertencem ao tipo especificado.
     */
    public List<Evento> buscarEventosPorTipo(Class<?> tipoEvento){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        for (Evento evento : this.eventos){
            if (evento.getClass() == tipoEvento){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }

    /**
     * Busca eventos que atendem a um critério específico.
     *
     * @param filtro O critério de filtragem dos eventos.
     * @return Lista de eventos que atendem ao critério.
     */
    public List<Evento> buscarEventos(FiltroEventos filtro) {
        List<Evento> eventosFiltrados = new ArrayList<Evento>() ;
        for (Evento evento : this.eventos) {
            if (filtro.filtrar(evento)) {
                eventosFiltrados.add(evento);
            }
        }
        return eventosFiltrados ;
    }
}

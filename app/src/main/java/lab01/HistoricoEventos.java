package lab01;

import java.util.ArrayList;
import java.util.List;

public class HistoricoEventos {
    private List<Evento> eventos;

    public HistoricoEventos(){
        this.eventos = new ArrayList<Evento>();
    }

    public void adicionarEvento(Evento evento){
        this.eventos.add(evento);
    }

    public List<Evento> getEventos(){
        return eventos;
    }

    public List<Evento> buscarEventosPorNome(String nome){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        
        for (Evento evento : this.eventos){
            if (evento.getNome() == nome){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }
    
    public List<Evento> buscarEventosPorData(String data){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        
        for (Evento evento : this.eventos){
            if (evento.getData() == data){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }
    
    public List<Evento> buscarEventosPorLocal(String nomeLocal){
        List<Evento> eventosFiltrados = new ArrayList<Evento>();
        
        for (Evento evento : this.eventos){
            if (evento.local.getNome() == nomeLocal){
                eventosFiltrados.add(evento);
            }
        }

        return eventosFiltrados;
    }
}

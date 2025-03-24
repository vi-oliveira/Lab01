/*
 * FiltroEventos.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01.Eventos;

/**
 * Interface que representa um filtro de eventos.
 * 
 * @author Vinícius de Oliveira - 251527
 */
public interface FiltroEventos {

    /**
     * Filtra os eventos com base em algum atributo da classe
     * @param evento o evento que será filtrado
     * @return true ou false, dependendo de o evento atender aos
     * critérios do filtro
     */
    public boolean filtrar(Evento evento);
}
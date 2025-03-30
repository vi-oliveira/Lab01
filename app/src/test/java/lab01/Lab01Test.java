/*
 * Modificado:
 * - Preço dos ingressos para shows foi alterado de int para Double,
 * pois utilizar Double permite o uso de centavos.
 * - Mudanças nos parâmetros do construtor de EventoShow, com 1
 * parâmetro novo. Além disso, houve mudança na ordem em que eles aparecem,
 * para assim ter uma maior padronização entre as classes de evento.
 * - Como tentei organizar melhor criando mais pacotes, foi necessário
 * adicionar as importações.
 */

package lab01;
import org.junit.jupiter.api.Test;

import lab01.Eventos.EventoShow;
import lab01.Eventos.HistoricoEventos;
import lab01.Ingressos.IngressoInteira;
import lab01.Ingressos.IngressoMeia;

import static org.junit.jupiter.api.Assertions.*;



public class Lab01Test {

    /**
     * Testa se o getCapacidadeEvento retorna a capacidade do local do Evento
     */
    @Test
    public void getCapacidadeEventoShow() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal,
        150.0, "01/05/2025", "Djavan", "MPB");
        assertEquals(2000, testEvento.getCapacidade());
    }


    /**
     * Testa o get e seter do EventoShow para o atributo artista
     * Espera-se a troca de "01/05/2025" por "Anavitória"
     */

    @Test
    public void setAndGetArtistaEventoShow() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal,
        150.0, "01/05/2025", "Djavan", "MPB");
        testEvento.setArtista("Anavitória");
        assertEquals("Anavitória", testEvento.getArtista());
    }

    /**
     * Testa o método getPreco para o IngressoMeia
     * Espera o retorno da metade do valor (100) do ingresso do EventoShow criado (200)
     */

    @Test
    public void getPrecoIngressoMeia() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal,
        200.0, "01/05/2025", "Djavan", "MPB");
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        System.out.println("Resultado: " + ingressoMeia.getPreco());
        assertEquals(100, ingressoMeia.getPreco());
    }


    /**
     * Testa o método getPreco para o IngressoInteira
     * Espera o retorno do valor (250) do ingresso do EventoShow criado
     */
    @Test
    public void getPrecoIngressoInteira() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal,
        250.0, "01/05/2025", "Djavan", "MPB");
        IngressoInteira ingressoInteira = new IngressoInteira(testEvento);
        assertEquals(250, ingressoInteira.getPreco());
    }

    /**
     * Testa o método adicionarIngressoMeia
     * Verifica se o ingresso foi adicionado à lista de ingressos vendidos
     * e se o usuario agora tem o ingresso
     */
    @Test
    public void adicionarIngressoMeia() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal,
        200.0, "01/05/2025", "Djavan", "MPB");
        IngressoMeia ingressoMeia = new IngressoMeia(testEvento);
        Usuario usuarioTest = new Usuario("Gabriel", "gabriel@me.com");
        testEvento.adicionarIngresso(ingressoMeia, usuarioTest);
        assertEquals(1, testEvento.getIngressosVendidos().size());
        assertEquals(ingressoMeia, usuarioTest.getIngresso());

    }
    
    /**
     * Testa o método adicionarEvento do HistoricoEventos
     * Verifica se os dois eventos foram adicionados à lista de eventos
     * do HistoricoEventos
     */
    @Test
    public void adicionaEventoemHistorico() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento1 = new EventoShow("MPB em Campinas", testLocal,
        200.0, "01/05/2025", "Djavan", "MPB");
        EventoShow testEvento2 = new EventoShow("MPB em Campinas", testLocal,
        200.0, "02/05/2025", "Anavitória", "MPB");
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.adicionarEvento(testEvento1);
        historicoTeste.adicionarEvento(testEvento2);
        assertEquals(2, historicoTeste.getEventos().size());

    }

    /**
     * Testa o método buscarEventosPorTipo do HistoricoEventos
     * Verifica se os dois eventos do tipo EventoShow foram encontrados
     * pela busca
     */
    @Test
    public void buscarEventosPorTipo() {

        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento1 = new EventoShow("MPB em Campinas", testLocal,
        200.0, "01/05/2025", "Djavan", "MPB");
        EventoShow testEvento2 = new EventoShow("MPB em Campinas", testLocal,
        200.0, "02/05/2025", "Anavitória", "MPB"); 
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.adicionarEvento(testEvento1);
        historicoTeste.adicionarEvento(testEvento2);
        assertEquals(2, historicoTeste.buscarEventosPorTipo(EventoShow.class).size());
    }
}

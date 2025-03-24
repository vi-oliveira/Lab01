/*
 * App.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lab01.Eventos.Evento;
import lab01.Eventos.EventoEsporte;
import lab01.Eventos.EventoPalestra;
import lab01.Eventos.EventoShow;
import lab01.Eventos.EventoTeatro;
import lab01.Eventos.HistoricoEventos;
import lab01.Ingressos.IngressoFamiliar;
import lab01.Ingressos.IngressoInteira;
import lab01.Ingressos.IngressoMeia;
import lab01.Ingressos.IngressoVIP;

/**
 * Contém a estrutura de implementação da aplicação.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Vinícius de Oliveira - 251527
 */
public class App {

    /**
     * Aplicação principal
     * @param args argumentos para a main
     */
    public static void main(String[] args) {


        // DEMONSTRAÇÃO CÓDIGO PRELIMINAR
        
        Local local = new Local("Allianz Parque", 300);
        Usuario usuario = new Usuario("Gabriel", "gabriel@gmail.com");
        
        // Dados sobre evento
        System.out.println("Local: " + local.getNome());
        System.out.println("Nome do usuário: " + usuario.getNome());
        

        // DEMONSTRAÇÃO PASSO 1
        Local neoQuimica = new Local("Neo Química Arena", 4000);
        EventoShow show = new EventoShow("Esquinas", neoQuimica, 200.0, "Anavitoria", "22/09/2025");
        IngressoInteira ingreInteiraShow = new IngressoInteira(show);
        IngressoMeia ingreMeiaShow = new IngressoMeia(show);
        IngressoVIP ingreVIPShow = new IngressoVIP(show);
        IngressoFamiliar ingreFamiliarShow = new IngressoFamiliar(show);

        // Exibindo o preço de cada ingresso
        System.out.println("\nDEMONSTRAÇÃO DOS INGRESSOS:");

        System.out.println("Preço do ingresso comum: R$"
        + String.format("%.2f", ingreInteiraShow.getPreco()));

        System.out.println("Preço do ingresso meia: R$"
        + String.format("%.2f", ingreMeiaShow.getPreco()));

        System.out.println("Preço do ingresso VIP: R$"
        + String.format("%.2f", ingreVIPShow.getPreco()));

        System.out.println("Preço do ingresso familiar: R$"
        + String.format("%.2f", ingreFamiliarShow.getPreco()));


        // DEMONSTRAÇÃO PASSO 2
        System.out.println("\nDEMONSTRAÇÃO DOS EVENTOS:");

        Local unicamp = new Local("Teatro de Arena", 100);
        EventoEsporte evenEsporte = new EventoEsporte("Final da Copa do Mundo",
        "futebol", 110, 800.0, neoQuimica, "01/04/2025");
        EventoPalestra evenPalestra = new EventoPalestra("O avanço da computação computacional",
        "João", "Tecnologia", 60, 40.0, unicamp, "12/11/2025");
        List<String> atoresHam = new ArrayList<String>(Arrays.asList("Ana", "Beto", "Carlos"));
        EventoTeatro evenTeatro = new EventoTeatro("Hamlet",
        atoresHam, 240, 120.0, unicamp, "21/06/2025");
        
        System.out.println("\nTeatro:");
        evenTeatro.exibirDetalhes();

        System.out.println("\nPalestra:");
        evenPalestra.exibirDetalhes();

        System.out.println("\nEsporte:");
        evenEsporte.comecaPartida();
        evenEsporte.marcarPonto(1);
        evenEsporte.marcarPonto(2);
        evenEsporte.marcarPonto(1);
        evenEsporte.exibirPlacar();
        evenEsporte.terminaPartida();


        // DEMONSTRAÇÃO PASSO 3
        System.out.println("\nDEMONSTRAÇÃO DO FATURAMENTO:");
        Usuario alonso = new Usuario("Alonso", "alonso@hotmail.com");
        Usuario paula = new Usuario("Paula", "superemail@gmail.com");
        IngressoInteira palestraInteira = new IngressoInteira(evenPalestra);
        IngressoVIP palestraVIP = new IngressoVIP(evenPalestra);
        IngressoFamiliar palestraFamiliar = new IngressoFamiliar(evenPalestra);

        evenPalestra.adicionarIngresso(palestraInteira, usuario);
        evenPalestra.adicionarIngresso(palestraVIP, paula);
        evenPalestra.adicionarIngresso(palestraFamiliar, alonso);
        System.out.println("O faturamento foi de: R$"
        + String.format("%.2f", evenPalestra.calculaFaturamento()));
        

        // DEMONSTRAÇÃO PASSO 4
        System.out.println("\nDEMONSTRAÇÃO DO HISTÓRICO:");
        EventoShow evenShow2 = new EventoShow("Internacional", local, 800, "Linkin Park", "14/02/2026");
        HistoricoEventos historico = new HistoricoEventos();
        historico.adicionarEvento(show);
        historico.adicionarEvento(evenShow2);
        historico.adicionarEvento(evenTeatro);
        historico.adicionarEvento(evenPalestra);
        historico.adicionarEvento(evenEsporte);
        
        // Mostarndo busca por tipo
        List<Evento> eventosFiltrados = historico.buscarEventosPorTipo(EventoShow.class);
        for (Evento evento : eventosFiltrados) {
            System.out.println("nome: " + evento.getNome());
        }
        
        eventosFiltrados = historico.buscarEventosPorData("12/11/2025");
        for (Evento evento : eventosFiltrados) {
            System.out.println("nome: " + evento.getNome());
        }


        // DEMONSTRAÇÃO PASSO 5



        //  TEESTE
        // Local testLocal = new Local("Teatro Castro Mendes", 2000);
        // EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal, 250, "Djavan", "01/05/2025");
        // IngressoInteira ingressoInteira = new IngressoInteira(testEvento);
        // System.out.println("teste preço: " + ingressoInteira.getPreco());


        // Local testLocal = new Local("Teatro Castro Mendes", 2000);
        // EventoShow testEvento1 = new EventoShow("MPB em Campinas", testLocal, 200, "Djavan", "01/05/2025");
        // EventoShow testEvento2 = new EventoShow("MPB em Campinas", testLocal, 200, "Anavitória", "02/05/2025");
        // HistoricoEventos historicoTeste = new HistoricoEventos();
        // historicoTeste.adicionarEvento(testEvento1);
        // historicoTeste.adicionarEvento(testEvento2);
        // System.out.println("2: " + historicoTeste.getEventos().size());
    }
}

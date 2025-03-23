/*
 * App.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação da aplicação.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public class App {

    /**
     * Aplicação principal
     * @param args
     */
    public static void main(String[] args) {


        // DEMONSTRAÇÃO CÓDIGO PRELIMINAR
        
        Local local = new Local("Allianz Parque", 300);
        Usuario usuario = new Usuario("Gabriel", "gabriel@gmail.com");

        // Dados sobre evento
        System.out.println("Local: " + local.getNome());
        System.out.println("Nome do usuário: " + usuario.getNome());

        // DEMONSTRAÇÃO PASSO 1
        // EventoShow evento = new EventoShow("Esquinas", local, 80, "Anavitoria", "22/09/2025");
        // IngressoMeia ingressoMeia = new IngressoMeia(evento);


        // DEMONSTRAÇÃO PASSO 2
        EventoShow evento = new EventoShow("Esquinas", local, 80, "Anavitoria", "22/09/2025");
        // evento.exibirDetalhes();


        // DEMONSTRAÇÃO PASSO 3
        
        
        // DEMONSTRAÇÃO PASSO 4
        
        
        
        // DEMONSTRAÇÃO PASSO 5



        //  TEESTE
        // Local testLocal = new Local("Teatro Castro Mendes", 2000);
        // EventoShow testEvento = new EventoShow("MPB em Campinas", testLocal, 250, "Djavan", "01/05/2025");
        // IngressoInteira ingressoInteira = new IngressoInteira(testEvento);
        // System.out.println("teste preço: " + ingressoInteira.getPreco());


        Local testLocal = new Local("Teatro Castro Mendes", 2000);
        EventoShow testEvento1 = new EventoShow("MPB em Campinas", testLocal, 200, "Djavan", "01/05/2025");
        EventoShow testEvento2 = new EventoShow("MPB em Campinas", testLocal, 200, "Anavitória", "02/05/2025");
        HistoricoEventos historicoTeste = new HistoricoEventos();
        historicoTeste.adicionarEvento(testEvento1);
        historicoTeste.adicionarEvento(testEvento2);
        System.out.println("2: " + historicoTeste.getEventos().size());
    }
}

package lab01;

public class IngressoVIP extends Ingresso {
    private Evento evento;
    int codigo;
    
    public IngressoVIP(Evento evento, int codigo){
        super(evento, codigo);
    }

    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso() * 1.5;
    }
}
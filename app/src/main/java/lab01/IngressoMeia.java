package lab01;

public class IngressoMeia extends Ingresso{
    private Evento evento;
    int codigo;
    
    public IngressoMeia(Evento evento, int codigo){
        super(evento, codigo);
    }

    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso()/2;
    }
}
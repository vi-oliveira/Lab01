package lab01;

public class IngressoInteira extends Ingresso{
    private Evento evento;
    private int codigo;

    public IngressoInteira(Evento evento, int codigo){
        super(evento, codigo);
    }

    @Override
    public double getPreco () {
        return this.evento.getPrecoIngresso();
    }
}

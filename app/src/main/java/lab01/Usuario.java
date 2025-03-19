/*
 * Usuario.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */
package lab01;

/**
 * Contém a estrutura de implementação de um Usuario.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public class Usuario {
    private String nome;
    private String email;
    private Ingresso ingresso;

    /**
     * Construtor da classe Usuario
     * @param nome o nome do usuário
     * @param email o email do usuário
     */
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    /**
     * Retorna o nome do usuário
     * @return o nome do usupario
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Altera o ingresso do usuário para `ingresso` 
     * @param ingresso o novo ingresso
     */
    public void setIngresso(Ingresso ingresso){
        this.ingresso = ingresso;
    }
    
    /**
     * Retorna o ingresso do usuário
     * @return o ingresso do usupario
     */
    public Ingresso getIngresso(){
        return ingresso;
    }

    /**
     * Altera o nome do usuário para `nome` 
     * @param nome o novo nome do usuário
     */
    public void setNome(String nome){
        this.nome = nome;
    }
}

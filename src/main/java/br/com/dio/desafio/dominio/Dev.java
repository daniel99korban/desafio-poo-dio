package br.com.dio.desafio.dominio;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> consteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp){
        //this.conteudosInscritos.add(bootCamp)
    }

    public void progredir(){

    }

    public void calcularXp(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConsteudosConcluidos() {
        return consteudosConcluidos;
    }

    public void setConsteudosConcluidos(Set<Conteudo> consteudosConcluidos) {
        this.consteudosConcluidos = consteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(consteudosConcluidos, dev.consteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, consteudosConcluidos);
    }
}

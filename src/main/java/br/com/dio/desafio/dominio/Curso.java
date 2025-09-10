package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descicao;
    private int cargaHorario;

    public Curso(String titulo, String descicao, int cargaHorario) {
        this.titulo = titulo;
        this.descicao = descicao;
        this.cargaHorario = cargaHorario;
    }

    public Curso(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descicao='" + descicao + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }
}

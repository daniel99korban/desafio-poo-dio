package org.example;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescicao("Descrição do curso de Java");
        curso1.setCargaHorario(8);

        var curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescicao("Descrição do curso de Js");
        curso2.setCargaHorario(4);

        var mentoria = new Mentoria();
        mentoria.setTitulo("Mentaria de Java");
        mentoria.setDescicao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
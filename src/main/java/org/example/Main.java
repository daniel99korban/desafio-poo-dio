package org.example;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição bootcamp java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Daniel");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos Daniel : " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Daniel : " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Daniel : " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos Camila : " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila : " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila : " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());

    }
}
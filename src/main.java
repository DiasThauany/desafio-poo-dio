import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Curso  curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso  curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mmentoria java");
        mentoria.setData(LocalDate.now());

       /*ystem.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devThauany = new Dev();
        devThauany.inscreverBootcamp(bootcamp);
        devThauany.setNome("Thauany");
        System.out.println("Conteudos Inscritos" + devThauany.getConteudoInscritos());
        devThauany.progredir();
        devThauany.progredir();
        devThauany.progredir();
        System.out.println("Conteudos Inscritos" + devThauany.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Thauany" + devThauany.getConteudosConcluídos());
        System.out.println("XP:" + devThauany.calcularTotalXp());

        System.out.println("------");

        Dev devDaniel = new Dev();
        devDaniel.inscreverBootcamp(bootcamp);
        devDaniel.setNome("Daniel");

        System.out.println("Conteudos Inscritos" + devDaniel.getConteudoInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("Conteudos Inscritos" + devDaniel.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Daniel" + devDaniel.getConteudosConcluídos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());

    }
}

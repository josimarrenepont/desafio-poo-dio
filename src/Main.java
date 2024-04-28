import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso java = new Curso();
        java.setTitulo("Curso Java");
        java.setDescricao("Descrição Curso Java");
        java.setCargaHoraria(8);

        Curso javaScript = new Curso();
        javaScript.setTitulo("Curso JavaScript");
        javaScript.setDescricao("Descrição Curso JavaScript");
        javaScript.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(javaScript);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos José:" + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos José:" + devJose.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos José:" + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

    }

}

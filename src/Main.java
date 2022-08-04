import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.DesafioDeProjeto;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoCami1 = new Curso();
        cursoCami1.setTitulo("Dominando IDES Java");
        cursoCami1.setDescricao("");
        cursoCami1.setCargaHoraria(4);
        cursoCami1.setInstrutor("Camila Cavalcante");
        cursoCami1.setNivel("Intermediário");

        Curso cursoCami2 = new Curso();
        cursoCami2.setTitulo("Estruturas de Repetição e Arrays em Java");
        cursoCami2.setDescricao("");
        cursoCami2.setCargaHoraria(3);
        cursoCami2.setInstrutor("Camila Cavalcante");
        cursoCami2.setNivel("Básico");
        
        Curso cursoCami3 = new Curso();
        cursoCami3.setTitulo("Trabalhando com Collections Java");
        cursoCami3.setDescricao("");
        cursoCami3.setCargaHoraria(4);
        cursoCami3.setInstrutor("Camila Cavalcante");
        cursoCami3.setNivel("Intermediário");
        
        Curso cursoCami4 = new Curso();
        cursoCami4.setTitulo("Debugging Java");
        cursoCami4.setDescricao("");
        cursoCami4.setCargaHoraria(1);
        cursoCami4.setInstrutor("Camila Cavalcante");
        cursoCami4.setNivel("Intermediário");
        
        Curso cursoCami5 = new Curso();
        cursoCami5.setTitulo("Tratamento de Exceções em Java");
        cursoCami5.setDescricao("");
        cursoCami5.setCargaHoraria(2);
        cursoCami5.setInstrutor("Camila Cavalcante");
        cursoCami5.setNivel("Intermediário");

        Mentoria mentoriaCami = new Mentoria();
        mentoriaCami.setTitulo("Desenvolva seu pensamento computacional com orientação a objetos");
        mentoriaCami.setDescricao("");
        mentoriaCami.setData(LocalDate.now());
        mentoriaCami.setInstrutor("Camila Cavalcante");
        
        DesafioDeProjeto projetoCami = new DesafioDeProjeto();
        projetoCami.setTitulo("Abstraindo um Bootcamp usando Orientação a Objetos em Java");
        projetoCami.setDescricao("");
        projetoCami.setCargaHoraria(1);
        projetoCami.setInstrutor("Camila Cavalcante");
        projetoCami.setNivel("Intermediário");
        

        /*System.out.println(cursoCami1);
        System.out.println(cursoCami2);
        System.out.println(mentoriaCami);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Code Girls");
        bootcamp.setDescricao("Comece sua jornada na trilha de Java, assista as aulas, faça os desafios de códigos e projetos e conclua as atividades.\n"
                + "Todas as graduadas receberão certificado e terão chance de ingressar no mercado de trabalho!" +
"");
        bootcamp.getConteudos().add(cursoCami1);
        bootcamp.getConteudos().add(cursoCami2);
        bootcamp.getConteudos().add(cursoCami3);
        bootcamp.getConteudos().add(cursoCami4);
        bootcamp.getConteudos().add(cursoCami5);
        bootcamp.getConteudos().add(mentoriaCami);
        bootcamp.getConteudos().add(projetoCami);
      

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        Dev devKaren = new Dev();
        devKaren.setNome("Karen");
        devKaren.inscreverBootcamp(bootcamp);
        
        System.out.println(bootcamp);
        System.out.println();
        System.out.println();
        
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        System.out.println("Conteúdos Inscritos Karen:" + devKaren.getConteudosInscritos());
        devKaren.progredir();
        devKaren.progredir();
        devKaren.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Karen:" + devKaren.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Karen:" + devKaren.getConteudosConcluidos());
        System.out.println("XP:" + devKaren.calcularTotalXp());
        
    }

}

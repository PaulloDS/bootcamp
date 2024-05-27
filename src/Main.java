import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso Java", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descrição do curso JavaScript", 4);
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição da mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria1);

        Dev dev1 = new Dev("Camila");
        Dev dev2 = new Dev("João");

        bootcamp.inscreverDev(dev1);
        bootcamp.inscreverDev(dev2);

        System.out.println("Conteúdos Inscritos Camila: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Concluídos Camila: " + dev1.getConteudosConcluidos());
        System.out.println("XP Camila: " + dev1.calcularTotalXP());

        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP João: " + dev2.calcularTotalXP());
    }
}


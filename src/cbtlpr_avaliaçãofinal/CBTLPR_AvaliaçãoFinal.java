/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbtlpr_avaliaçãofinal;

/**
 *
 * @author aluno
 */
/**
 *  Nomes: João Victor Lima Venceslau - Rayssa Silva de Oliveira
 * 
 * 3) Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles
  serão solicitados:
  • Usando a classe ConsultaAgendada instancie o objeto p1 inicializado-o com o
  construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String m);
  • Exiba todas as propriedades de p1;
  • Agora instancie o objeto p2 usando o construtor ConsultaAgendada ();
  • Exiba todas as propriedades de p2;
  • Usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico altere
    as propriedades de p1;
  • Exiba todas as propriedades de p1 novamente.
  • Exiba a quantidade final de consultas.
 */
public class CBTLPR_AvaliaçãoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 6, 2024, "Rayssa Oliveira", "Dr.Venceslau");
        
        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        System.out.println("\nInstanciando p2 via teclado:");
        ConsultaAgendada p2 = new ConsultaAgendada();
        
        System.out.println("\nPropriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Medico: " + p2.getNomeMedico());

        System.out.println("\nAlterando p1 via teclado:");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\nPropriedades de p1 atualizadas:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        System.out.println("\nQuantidade final de consultas: " + p1.getAmostra());
    }
}
    


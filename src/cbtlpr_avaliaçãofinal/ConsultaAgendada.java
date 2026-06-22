/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbtlpr_avaliaçãofinal;
import java.util.*;
/**
 *
 * @author aluno
 *
 * 
 * * Nomes: João Victor Lima Venceslau - Rayssa Silva de Oliveira
/*
2)Crie a classe ConsultaAgendada conforme especificado abaixo (2,0):
┌──────────────────────────────────────────────────┐
|                         ConsultaAgendada                                         |
├──────────────────────────────────────────────────┤
|   - data: Data                                                                   |
|   - hora: Hora                                                                   |
|   - nomePaciente: String                                                         |
|   - quantidade: int (static)                                                     |
|   - nomeMedico: String                                                           |
├──────────────────────────────────────────────────┤
|+ ConsultaAgendada ()                                                             |
|+ ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String m)|
|+ ConsultaAgendada (Data d, Hora h, String p, String m)                           |
|+ setData(int a, int b, int c)                                                    |
|+ setData()                                                                       |
|+ setHora(int a, int b, int c)                                                    |
|+ setHora()                                                                       |
|+ setNomePaciente(String p)                                                       |
|+ setNomePaciente()                                                               |
|+ setNomeMedico(String m)                                                         |
|+ setNomeMedico()                                                                 |
|+ getAmostra(): int                                                               |
|+ getData(): String                                                               |
|+ getHora(): String                                                               |
|+ getNomePaciente (): String                                                      |
|+ getNomeMedico(): String                                                         |
└──────────────────────────────────────────────────┘

• O construtor ConsultaAgendada deve nos permitir a digitação dos valores de data,
hora, nome do paciente e do médico;
• Os outros dois construtores devem receber os valores de data, hora, nome do
paciente e do médico sob a forma de parâmetros;
• Qualquer construtor chamado deve acrescer 1 no atributo quantidade.
• Os métodos setData(), setHora(), setNomePaciente(), setNomeMedico() devem nos
permitir alterar os valores das respectivas propriedades através da digitação de
novos valores;
• Os demais métodos “set” devem alterar os valores das propriedades a partir dos
parâmetros recebidos;
• O método getData() deve nos devolver a data no formato: dd/mm/aa;
• O método getHora() deve nos devolver a hora no formato: hh:mm:ss.
*/

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Paciente: ");
        this.nomePaciente = sc.nextLine();
        System.out.print("Nome do Medico: ");
        this.nomeMedico = sc.nextLine();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public void setData(int a, int b, int c) { this.data = new Data(a, b, c); }
    public void setData() { this.data = new Data(); }
    public void setHora(int a, int b, int c) { this.hora = new Hora(a, b, c); }
    public void setHora() { this.hora = new Hora(); }
    public void setNomePaciente(String p) { this.nomePaciente = p; }
    public void setNomePaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Paciente: ");
        this.nomePaciente = sc.nextLine();
    }
    public void setNomeMedico(String m) { this.nomeMedico = m; }
    public void setNomeMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Medico: ");
        this.nomeMedico = sc.nextLine();
    }

    public int getAmostra() { return quantidade; }
    
    public String getData() {
        int d = this.data.getDia();
        int m = this.data.getMes();
        int a = this.data.getAno() % 100;
        
        String dStr = (d < 10 ? "0" : "") + d;
        String mStr = (m < 10 ? "0" : "") + m;
        String aStr = (a < 10 ? "0" : "") + a;
        
        return dStr + "/" + mStr + "/" + aStr;
    }
    
    public String getHora() { return this.hora.getHora1(); }
    public String getNomePaciente() { return this.nomePaciente; }
    public String getNomeMedico() { return this.nomeMedico; }
}
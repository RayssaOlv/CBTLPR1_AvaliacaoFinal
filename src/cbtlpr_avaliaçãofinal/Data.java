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
 */
/**
 * Nomes: João Victor Lima Venceslau - Rayssa Silva de Oliveira
 * 
 * 
 * 1)Reescreva as propriedades e métodos da classe Data, deixando-os de acordo com
     o padrão UML (Getter e Setter).
 */
public class Data {
 private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        while (true) {
            System.out.print("Digite o ano: ");
            a = sc.nextInt();
            if (a >= 0) break;
            System.out.println("Ano invalido.");
        }
        this.ano = a;
        while (true) {
            System.out.print("Digite o mes (1-12): ");
            m = sc.nextInt();
            if (m >= 1 && m <= 12) break;
            System.out.println("Mes invalido.");
        }
        this.mes = m;
        while (true) {
            System.out.print("Digite o dia: ");
            d = sc.nextInt();
            if (validarDia(d, this.mes, this.ano)) break;
            System.out.println("Dia invalido.");
        }
        this.dia = d;
    }

    public Data(int d, int m, int a) {
        if (a >= 0) this.ano = a;
        if (m >= 1 && m <= 12) this.mes = m;
        if (validarDia(d, this.mes, this.ano)) this.dia = d;
    }

    public void setDia(int d) { if (validarDia(d, this.mes, this.ano)) this.dia = d; }
    public void setMes(int m) { if (m >= 1 && m <= 12) this.mes = m; }
    public void setAno(int a) { if (a >= 0) this.ano = a; }

    public void setDia() {
        Scanner sc = new Scanner(System.in);
        int d;
        while (true) {
            System.out.print("Digite o dia: ");
            d = sc.nextInt();
            if (validarDia(d, this.mes, this.ano)) break;
            System.out.println("Dia invalido.");
        }
        this.dia = d;
    }

    public void setMes() {
        Scanner sc = new Scanner(System.in);
        int m;
        while (true) {
            System.out.print("Digite o mes (1-12): ");
            m = sc.nextInt();
            if (m >= 1 && m <= 12) break;
            System.out.println("Mes invalido.");
        }
        this.mes = m;
    }

    public void setAno() {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Digite o ano: ");
            a = sc.nextInt();
            if (a >= 0) break;
            System.out.println("Ano invalido.");
        }
        this.ano = a;
    }

    public int getDia() { return this.dia; }
    public int getMes() { return this.mes; }
    public int getAno() { return this.ano; }

    public String getMostra1() {
        String dStr = (dia < 10 ? "0" : "") + dia;
        String mStr = (mes < 10 ? "0" : "") + mes;
        return dStr + "/" + mStr + "/" + ano;
    }

    private boolean validarDia(int d, int m, int a) {
        if (m < 1 || m > 12) return false;
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) diasMes[1] = 29;
        return d >= 1 && d <= diasMes[m - 1];
    }
}

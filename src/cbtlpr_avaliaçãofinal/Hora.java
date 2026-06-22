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
 *  Nomes: João Victor Lima Venceslau - Rayssa Silva de Oliveira
 */
public class Hora {
     private int hora;
    private int min;
    private int seg;

    public Hora() {
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        while (true) {
            System.out.print("Digite a hora (0-23): ");
            h = sc.nextInt();
            if (h >= 0 && h <= 23) break;
            System.out.println("Hora invalida.");
        }
        this.hora = h;
        while (true) {
            System.out.print("Digite o minuto (0-59): ");
            m = sc.nextInt();
            if (m >= 0 && m <= 59) break;
            System.out.println("Minuto invalido.");
        }
        this.min = m;
        while (true) {
            System.out.print("Digite o segundo (0-59): ");
            s = sc.nextInt();
            if (s >= 0 && s <= 59) break;
            System.out.println("Segundo invalido.");
        }
        this.seg = s;
    }

    public Hora(int h, int m, int s) {
        if (h >= 0 && h <= 23) this.hora = h;
        if (m >= 0 && m <= 59) this.min = m;
        if (s >= 0 && s <= 59) this.seg = s;
    }

    public void setHor(int h) { if (h >= 0 && h <= 23) this.hora = h; }
    public void setMin(int m) { if (m >= 0 && m <= 59) this.min = m; }
    public void setSeg(int s) { if (s >= 0 && s <= 59) this.seg = s; }

    public void setHor() {
        Scanner sc = new Scanner(System.in);
        int h;
        while (true) {
            System.out.print("Digite a hora (0-23): ");
            h = sc.nextInt();
            if (h >= 0 && h <= 23) break;
            System.out.println("Hora invalida.");
        }
        this.hora = h;
    }

    public void setMin() {
        Scanner sc = new Scanner(System.in);
        int m;
        while (true) {
            System.out.print("Digite o minuto (0-59): ");
            m = sc.nextInt();
            if (m >= 0 && m <= 59) break;
            System.out.println("Minuto invalido.");
        }
        this.min = m;
    }

    public void setSeg() {
        Scanner sc = new Scanner(System.in);
        int s;
        while (true) {
            System.out.print("Digite o segundo (0-59): ");
            s = sc.nextInt();
            if (s >= 0 && s <= 59) break;
            System.out.println("Segundo invalido.");
        }
        this.seg = s;
    }

    public int getHor() { return hora; }
    public int getMin() { return min; }
    public int getSeg() { return seg; }

    public String getHora1() {
        String hStr = (hora < 10 ? "0" : "") + hora;
        String mStr = (min < 10 ? "0" : "") + min;
        String sStr = (seg < 10 ? "0" : "") + seg;
        return hStr + ":" + mStr + ":" + sStr;
    }
}
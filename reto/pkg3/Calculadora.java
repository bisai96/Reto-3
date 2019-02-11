/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkg3;

import javax.swing.*;

public class Calculadora {

    public static void main(String []agrs)

    {
        int op=0;
        double n1,n2,s,r,m,d;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Qué operacion desea realizar: "+" [1]Sumar "+" [2]Restar "+" [3]Multiplicar "+" [4]Dividir "+" [5]Salir "));

            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    s=n1+n2;
                    JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+s);
                    break;
                case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r=n1-n2;
                    JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+r);
                    break;
                case 3:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    m=n1*n2;
                    JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+m);
                    break;
                case 4:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    d=n1/n2;
                    JOptionPane.showMessageDialog(null,"El resultado de la division es: "+d);
                    break;
            }

        }while(op!=5);

    }



}

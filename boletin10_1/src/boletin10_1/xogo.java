/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class xogo 
{
  int num,intentos,num2;
  int contador;
 // int num1,intentos1; nun primeiro intento volquei os datos strin en string num,intentos e despois convertinos nunha variable distina, despois por facelo mais simple convertin directamente a string o JOptionPane
  public void numero() 
  {
    
    num=Integer.parseInt(JOptionPane.showInputDialog("teclea o numero co que vamos a xogar"));
    intentos=Integer.parseInt(JOptionPane.showInputDialog("teclea o numero de intentos que ten o usuario"));
    
    // num1 = Integer.parseInt(num);
    // intentos1 = Integer.parseInt(intentos);
   
   }
    
    public void xogador2()
    {
       
    
        
          num2=Integer.parseInt(JOptionPane.showInputDialog("teclea o numero que cres que é"));
              
            for (contador=0;contador<intentos-1;contador++)
            {
                
                 if (num2<num)
                 num2=Integer.parseInt(JOptionPane.showInputDialog("o numero que introduches e moi pequeno"));
                 
                else if (num2>num)
                    num2=Integer.parseInt(JOptionPane.showInputDialog("o numero introducido e moi grande"));
                   
                else ;
                    
                    
            
         
            }      
        
            if(num2==num) System.out.println("Ganaches o xogo");
            else if(num2!=num) System.out.println("Acabaronseche o numero de intentos");
            else;
    }
    
}

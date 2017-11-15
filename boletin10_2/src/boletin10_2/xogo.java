/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class xogo 
{
  int num,intentos,num2;
  
 
  public void numero() 
  {
    
    num=(int) ((Math.random()*50)+1);
   
           
    
   
   
   }
    
    public void xogador2()
    {
       
    
        
          num2=Integer.parseInt(JOptionPane.showInputDialog("teclea o numero que cres que é"));
              
            while (num2!=num)
            {
                
                 if ((num2-num)>20 || (num-num2)>20)
                 num2=Integer.parseInt(JOptionPane.showInputDialog("moi lonxe"));
                 
                else if ((10<=(num2-num)&&20>=(num2-num)) || (10<=(num-num2)&&20>=(num-num2)))
                    num2=Integer.parseInt(JOptionPane.showInputDialog("lonxe"));
                   
                else if ((5<=(num2-num)&&10>=(num2-num)) || (5<=(num-num2)&&10>=(num-num2)))
                    num2=Integer.parseInt(JOptionPane.showInputDialog("preto"));
                else if ((num2-num)<=5 || (num-num2)<=5)
                    num2=Integer.parseInt(JOptionPane.showInputDialog("moi preto"));
                else ;
                    
            
         
            }      
        
           System.out.println("Ganaches o xogo");
            
    }
    
}
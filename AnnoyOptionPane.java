/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package annoyoptionpane;
import javax.swing.*;
/**
 *
 * @author ACER
 */

class start{
    start(){
    int result =  JOptionPane.showConfirmDialog(null,"Are You Sure About That","",JOptionPane.YES_NO_OPTION);

    switch (result) {
         case JOptionPane.YES_OPTION:
         new start();
         break;
         case JOptionPane.NO_OPTION:
         new noo();
         break;
         case JOptionPane.CLOSED_OPTION:
         new close();
         break;
      }
    }
}

class noo{
    noo(){
    int result =  JOptionPane.showConfirmDialog(null,"Noooooo?????","",JOptionPane.YES_NO_OPTION);

    switch (result) {
         case JOptionPane.YES_OPTION:
         new start();
         break;
         case JOptionPane.NO_OPTION:
         new noo();
         break;
         case JOptionPane.CLOSED_OPTION:
         new close();
         break;
      }
    }
}

class close{
    close(){
    int result =  JOptionPane.showConfirmDialog(null,"( •̀ᴗ•́ )و ̑̑","",JOptionPane.YES_NO_OPTION);

    switch (result) {
         case JOptionPane.YES_OPTION:
         new start();
         break;
         case JOptionPane.NO_OPTION:
         new noo();
         break;
         case JOptionPane.CLOSED_OPTION:
         new close();
         break;
      }
    }
}
public class AnnoyOptionPane {   
public static void main(String[] args) {  
    new start();  
}  
}  

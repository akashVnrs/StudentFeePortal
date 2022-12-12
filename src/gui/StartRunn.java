/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

public class StartRunn {

    public static void main(String args[]){
//         try {
//            // Set System L&F
//        UIManager.setLookAndFeel(
//            UIManager.getSystemLookAndFeelClassName());
//         System.out.println(UIManager.getSystemLookAndFeelClassName());
//    } 
//    catch (UnsupportedLookAndFeelException e) {
//       // handle exception
//    } 
     

        JFrame jf = new JFrame();
        
        System.out.println(JFrame.getFrames());
        PalcomMainn obj = new PalcomMainn();

        jf.add(obj);
        //jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
         jf.setBounds(0,0,800,680);

        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
         

    }
}

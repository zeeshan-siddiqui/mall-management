/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manage;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Zeeshan
 */
public class Splashz
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        Splash s=new Splash();
        s.setVisible(true);
        try
        {
            
            for(int i=0; i<=100; i++)
            {
                Thread.sleep(25);
                s.jLabel2.setText(i+"%");
                s.bar.setValue(i);
                if(i==100)
                {
                    Main m=new Main();
                    
                    m.setVisible(true);
                    m.pack();
                    s.setVisible(false);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

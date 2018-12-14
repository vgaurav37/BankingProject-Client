/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingclient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Kuldeep Raj Tiwari
 */
public class TimeDate {
    public static void setDateTime(javax.swing.JLabel Dateshow,javax.swing.JLabel Timeshow){
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Dateshow.setText(sdf.format(d));
        new Timer(0,new ActionListener(){ 
           
           public void actionPerformed(ActionEvent e){
             Date d=new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("hh: mm: ss");
             Timeshow.setText(sdf.format(d));  
           }
        }).start();
    }
    
}

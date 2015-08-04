/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.text.DecimalFormat;

/**
 *
 * @author eploentham
 */
public class Persistent {
    public String pk_field;
    public String table;
    public String getGenID(String id) {
//        String tempid = String.valueOf(System.currentTimeMillis());
        java.security.SecureRandom  rd = new java.security.SecureRandom();
        String tempid = setTemp(String.valueOf( (double)(Math.random()*10000000000.0)));
        
        id = id + "00000" + tempid; 
        return id;
    }
    private String setTemp(String temp){   
       DecimalFormat df = new DecimalFormat();
        df.applyPattern("0000000000"); 
        temp = df.format(Double.parseDouble(temp));
        return temp;
    }
}

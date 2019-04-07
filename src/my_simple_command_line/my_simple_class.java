/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_simple_command_line;

import java.io.BufferedReader;

/**
 *
 * @author my name is nobody
 */
public class my_simple_class {
    
    
    String hashgot="";
    int count = 0;
    
    public my_simple_class(){}
    
    public String get_my_command_back(BufferedReader lineReader)
    {

    
        lineReader.lines().forEach(line -> {
          if(count == 0)
           {
            count = 1;
            hashgot=line;
           }
           else
           hashgot=hashgot+line;
        });
                
        return hashgot;
    }
}

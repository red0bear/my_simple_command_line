/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_simple_command_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author my name is nobody
 */
public class My_simple_command_line {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            String command;

            
            String ip = "192.168.40.2";
            String user = "user";
            String pass = "pass";
            String port = "8990";
            
            String myaccount = "FELIPE";
            
            String path_flo_cli = "flo-cli";
            String config_rpc   = "-rpcconnect=" + ip + " -rpcuser=" + user +" -rpcpassword="+ pass + " -rpcport=" + port;
            
            
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount " + '"'+'"';//+ Character.toString((char) 34) +""+ Character.toString((char) 34);
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount " + Character.toString((char) 34) +""+ Character.toString((char) 34);
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount" + " " + Character.toString((char) 34)  + myaccount + Character.toString((char) 34) ;
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount" + " " + "\""  + myaccount + "\"" ;
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount" + "\"\"";
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount" +" "+ "\"\"";
            //command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount" +" "+ '\"' + '\"';
            command = path_flo_cli +" "+ config_rpc +" "+ "getaddressesbyaccount" + " " + myaccount ;
            
            
            Runtime runtime = Runtime.getRuntime();
            
            Process process = runtime.exec(command);
            process.waitFor();
            
            BufferedReader lineReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            System.out.println( new my_simple_class().get_my_command_back(lineReader));
            
        } catch (IOException ex) {
            Logger.getLogger(My_simple_command_line.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(My_simple_command_line.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}

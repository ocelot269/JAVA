
package org.lasencinas.servidorweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServidorWeb {
    

//----------------------Iniciando Variables-----------------------------------//
    
    
private ServerSocket serverSocket;
private Socket socket;
private BufferedReader bufferEntrada;
private OutputStream bufferSalida;


//--------------------------Fin variables------------------------------------//


//-------------------------Inicio Constructor--------------------------------//
    public ServidorWeb() {

    }

//--------------------------Fin Constructor----------------------------------//
    

//------------------------Inicio Getters Y Setters----------------------------//
    
    
    //------------------------Inicio Getters---------------------------------//
    
    
    //----------------------Fin Getters--------------------------------------//
    
    
    //-------------------------Inicio Setters---------------------------------//
    
     
    //---------------------------Fin Setters---------------------------------//
    
    
//------------------------Fin Getters y Settters------------------------------//

    
    
//---------------------------Inicio Metodos------------------------------------//
    
    public void connectar (int port) throws IOException {
        try {
            serverSocket= new ServerSocket(port);
            System.out.println("Esperando conexión entrante....");
            socket=serverSocket.accept();
            System.out.println("Conexion establecida con: " + socket.getInetAddress());
        }
        catch (Exception e){
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
    
    
    public void canals(){
        try {
            bufferEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferSalida = socket.getOutputStream();
            bufferSalida.flush();
        }
        catch (Exception e) {
            System.out.println("Error a los canales: " + e.getMessage());
        }
    }
    
    
    public void recibir() {
        String input;
        try {
            do {
                input = bufferEntrada.readLine();
                System.out.println("input");
            }
            while (!input.isEmpty());
        }
        catch (Exception e) {
            System.out.println("Error al recibir: " + e.getMessage());
        }
    }
    
    public void enviar(){
    String web="#";
    try {
        bufferSalida.write(web.getBytes());
        System.out.println("Enviant: \n\n" + web);
        bufferSalida.flush();
    }
    catch (Exception e){
        System.out.println("Error al enviar: " + e.getMessage());
    }
    
    }
    
    
    public void cerrar(){
        try {
            serverSocket.close();
            socket.close();
            bufferEntrada.close();
            bufferSalida.close();
        }
        catch (Exception e){
            System.out.println("Error al cerrar: " + e.getMessage());
        }
     }   
        
    public void runServidor (int port){
        while (true) {
            try {
            connectar(port);
            canals();
            recibir();
            enviar();
        }
        catch (Exception e) {
            System.out.println("Error al runServidor: " + e.getMessage());
        }
        finally {
            cerrar();
        }
    }
    }
    
    
    
    
    
    
}
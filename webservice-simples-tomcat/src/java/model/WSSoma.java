/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author INGRID-PC
 */
@WebService(serviceName = "WSSoma")
public class WSSoma {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    //o projeto do webservice tem que ser do tipo -> java web -> aplicação web
    //dentro deste nosso projeto vamos adicionar na pasta pacotes de código fonte um novo item do 
    //tipo web service -> web service
    //ao ser questionado sobre o servidor não suportar o caminho JSR-109, escolher a opção "sim".
    @WebMethod(operationName = "soma")
    public String soma(@WebParam(name = "numero1") String numero1, @WebParam(name = "numero2") String numero2 ){
        try{
            Double res = Double.parseDouble(numero1) + Double.parseDouble(numero2);
            return res.toString();
        }catch(Exception e){
            return "erro na operação";
        }
    }
}

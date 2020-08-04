
package modelo;

/**
 *
 * @author INGRID-PC
 */
public class Controle 
{
    //Esse item pode ser importado diretamente do próprio projeto cliente, uma vez
    //que o cliente tenha a referencia do webservice.
    //Para se ter a referencia basta clicar no projeto cliente e escolher novo -> web service
    //-> cliente para webservice. No final do processo deverá ser adicionada a url do wsdl;
    //Para conseguir a URL basta executar o projeto do webservice. No navegador haverá um item
    //WSDL com o link.
    //Para importar o metodo basta arrastar da pasta referencias de web services os metodos encontrados
    //para esse arquivo.
    //o projeto cliente deve ser do tipo "aplicação java".
    private static String soma(java.lang.String numero1, java.lang.String numero2) {
        model.WSSoma_Service service = new model.WSSoma_Service();
        model.WSSoma port = service.getWSSomaPort();
        return port.soma(numero1, numero2);
    }
      
    public String somar(String numero1, String numero2){
        return soma(numero1,numero2);
    }
}

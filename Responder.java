import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // Genera respuestas aleatorias
    private Random aleatorio;
    // Guarda las respuestas que vamos a enviar
    private ArrayList<String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Expliqueme cuál es la causa de su consulta");
        respuestas.add("Deme mas detalles para poder ayudarle");
        respuestas.add("Esta seguro de que lo tiene correctamente enchufado");
        respuestas.add("Desconectelo de la corriente y vuelva a conectarlo");
        respuestas.add("Esto suena interesante, deme algun dato más");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(aleatorio.nextInt(respuestas.size()));
    }
}

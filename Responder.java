import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // Guarda las respuestas que vamos a enviar
    private ArrayList<String> respuestas;
    // Genera respuestas de manera aleatoria
    private Random aleatorio;
     // Guarda las respuestas que se relaccionan con la palabra introducida
    private HashMap<String, String> respu;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respu = new HashMap<>();
        respu.put("error","cual es el código de error que le está dando");
        respu.put("pantalla","detallemé mejor el mensaje que le sale por pantalla");
        respu.put("conexión","compruebe que el cable está correctamente conectado");
        respu.put("clave","compruebe que la clave introducida es la correcta");
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
    public String generateResponse(String clave)
    {
        String respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        if (respu.containsKey(clave)) {
            respuesta = respu.get(clave);
        }
        return respuesta;
    }
}

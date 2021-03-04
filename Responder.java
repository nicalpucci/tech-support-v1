import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random azar = new Random();
    private ArrayList <String> respuestas = new ArrayList <String>();
    private HashMap <HashSet<String>, String> hashInput;
    private HashSet <String> conjunto = new HashSet <String>();
    private HashSet <String> conjunto2 = new HashSet <String>();
    private HashSet <String> conjunto3 = new HashSet <String>();
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<String>();
        azar = new Random();
        hashInput = new HashMap <HashSet<String>, String>();
        conjunto = new HashSet <>();
        respuestas.add("I can solve this problem.");
        respuestas.add("Do u want to learn English?");
        respuestas.add("Mira aprende inglés macho porque no te entiendo nada.");
        respuestas.add("How is it possible?");
        respuestas.add("You could try reboot your PC.");
        respuestas.add("Ahhh filho da puta agora sim entendo");
        respuestas.add("Are you a believer?");
        respuestas.add("Nice joke");
        conjunto.add("free");
        conjunto.add("app");
        conjunto2.add("kfc");
        conjunto2.add("español");
        conjunto3.add("crash");
        conjunto3.add("linux");
        conjunto3.add("problem");
        hashInput.put(conjunto, "You can download our app in Play Store -not App Store- for free!");
        hashInput.put(conjunto2, "Vale, mejor hablamos en español");
        hashInput.put(conjunto3, "Perhaps... did you drop your computer?");
        hashInput.put(conjunto2, "llama al 900 711 117");        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String respuestaFinal = hashInput.get(userInput);
        if(respuestaFinal == null){
            respuestaFinal = respuestas.get(azar.nextInt(respuestas.size()));
        }    
        return respuestaFinal;

        /*for(HashSet<String> claveActual : hashInput.keySet()){
        for(String palabraUsuarioActual : userInput){
        if(palabraUsuarioActual.equals(claveActual)){
        respuestaFinal = hashInput.get(palabraUsuarioActual);
        respuestaAleatoria = false;
        }
        }
        if(hashInput.containsKey(claveActual)){
        respuestaFinal = hashInput.get(claveActual);
        respuestaAleatoria = false;
        }
        }
        if(respuestaAleatoria){
        respuestaFinal = respuestas.get(azar.nextInt(respuestas.size()));
        }    
        return respuestaFinal;*/
    }
}

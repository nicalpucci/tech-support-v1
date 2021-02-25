import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random azar = new Random();
    private ArrayList <String> respuestas = new ArrayList <String>();
    private HashMap <String, String> hashInput;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<String>();
        azar = new Random();
        hashInput = new HashMap <String, String>();
        respuestas.add("I can solve this problem.");
        respuestas.add("Do u want to learn English?");
        respuestas.add("Mira aprende ingl�s macho porque no te entiendo nada.");
        respuestas.add("How is it possible?");
        respuestas.add("You could try reboot your PC.");
        respuestas.add("Ahhh filho da puta agora sim entendo");
        respuestas.add("Are you a believer?");
        respuestas.add("Nice joke");
        hashInput.put("deficient", "Oh don�t worry I can solve it");
        hashInput.put("espa�ol", "Vale, mejor hablamos en espa�ol");
        hashInput.put("pandemia", "Eso a mi no me repercute");
        hashInput.put("KFC", "llama al 900 711 117");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String userInput)
    {
        String resultado;
        if(hashInput.get(userInput) == null){
            resultado = respuestas.get(azar.nextInt(respuestas.size()));
        } 
        else {
            resultado = hashInput.get(userInput); 
        }
        return resultado;   
    }
}

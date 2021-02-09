import java.util.Random;
import java.util.ArrayList;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<String>();
        azar = new Random();
        respuestas.add("I can solve this problem.");
        respuestas.add("Do u want to learn English?");
        respuestas.add("Mira aprende inglés macho porque no te entiendo nada.");
        respuestas.add("How is it possible?");
        respuestas.add("You could try reboot your PC.");
        respuestas.add("Ahhh filho da puta agora sim entendo");
        respuestas.add("Are you a believer?");
        respuestas.add("Nice joke");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(azar.nextInt(respuestas.size()));
    }
}

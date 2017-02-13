import java.util.ArrayList;

/**
 * Created by Hanna_Zhahala on 12.02.2017.
 */
public class ArrayListOfName {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();

        obj.add ("Anna");
        obj.add ("Hanna");
        obj.add ("Tomek");
        obj.add ("Romek");
        System.out.println(obj);

        obj.add (0,  "Hello " + "Anna");
        obj.add (1, "Hello " + "Hanna" );
        obj.add (2, "Hello " + "Tomek");
        obj. add (3, "Hello " + "Romek");

        obj. remove ("Anna");
        obj.remove ("Hanna");
        obj. remove ("Tomek");
        obj.remove ("Romek");

        System.out.println(obj);
    }
}

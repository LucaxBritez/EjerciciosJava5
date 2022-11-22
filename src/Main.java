import com.cocheCRUD.CocheCRUDImpl;
import com.cocheCRUD.cocheCRUD;

public class Main {

    static cocheCRUD coche = new CocheCRUDImpl();

    public static void main(String[] args) {

        coche.save();
        coche.findAll();
        coche.delete();


    }
}
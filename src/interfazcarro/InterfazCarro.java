package interfazcarro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusgabriel
 */
public class InterfazCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            conectar a= new conectar();
            a.setVisible(true);
              
        } catch (Exception ex) {
            Logger.getLogger(InterfazCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

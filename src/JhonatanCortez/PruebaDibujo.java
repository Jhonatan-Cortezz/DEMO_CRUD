
package JhonatanCortez;

import javax.swing.JFrame;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class PruebaDibujo {
    public static void main(String[] args) {
        DibujoArcoIris panel = new DibujoArcoIris();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400, 250);
        aplicacion.setVisible(true);
        
    }
}

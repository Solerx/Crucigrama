package progra1.crucigrama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class main extends JFrame {

    public static String name = "";

    public static void main(String[] args) {

        final Login login = new Login();                      /*se inicializa las ventana login y sus propiedades*/

        final CrosswordWindow crossInstance = new CrosswordWindow();

        //int category = crossInstance.getIndexFromComboBox();
        //System.out.println("category"+ category);
        //GetVerticalClues(category);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*cierra el programa al salirse de la ventana*/

        login.setVisible(true);
        login.setResizable(false);

        login.btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = login.inputText.getText();
                new CrosswordWindow().setVisible(true);
                login.dispose();
            }
        });

    }

    public static String[] GetVerticalClues(int category) {

        String verticalClues[] = new String[6];
        switch (category) {

            case 1:

                verticalClues[0] = "1. Mamífero acuático muy inteligente y simpático";
                verticalClues[1] = "2. Muy grande con colmillos, orejas enormes y trompa";
                verticalClues[2] = "3. Felino pintado a rayas, muy feroz";
                verticalClues[3] = "4. Es el animal con el cuello más largo";
                verticalClues[4] = "5. Al trote o al galope era el medio de transporte de indios y vaqueros";
                verticalClues[5] = "6. Como lleva un caparazón muy pesado, siempre va muy despacio";

                break;

            case 2:

                verticalClues[0] = "1. Los cristianos se refugiaban en…";
                verticalClues[1] = "2. Religión que en un principio fue perseguida pero después paso a ser la religión oficial del imperio romano";
                verticalClues[2] = "3. Era la moneda Romana";
                verticalClues[3] = "4. Era la principal actividad económica Romana";
                verticalClues[4] = "5. Nombre de la lengua del Imperio Romano";
                verticalClues[5] = "6. Nombre del principal dios romano en la época pre cristiana";

                break;

            case 3:
                
                verticalClues[0] = "1. Océano que baña a Islandia";
                verticalClues[1] = "2. País por el que pasa el rio Elba";
                verticalClues[2] = "3. Capital del país situado a la derecha de Suecia";
                verticalClues[3] = "4. País cuya capital es Zagreb";
                verticalClues[4] = "5. Rio que divide a Rusia en 2 mitades";
                verticalClues[5] = "6. Capital del país que se encuentra entre Venezuela y Ecuador";

                break;
        }

        return verticalClues;
    }

    public static String[] GetHorizontalClues(int category) {
        String horizontalClues[] = new String[6];

        switch (category) {

            case 1:

                horizontalClues[0] = "1. Tiene bigotes y siete vidas";
                horizontalClues[1] = "2. Oso grande, blanco y negro y es originario de Asia";
                horizontalClues[2] = "3. Tiene alas grandes, coloridas y sale de un capullo";
                horizontalClues[3] = "4. Dicen que es el mejor amigo del hombre";
                horizontalClues[4] = "5. El rey de la selva, con melena larga";
                horizontalClues[5] = "6. Vive en el agua y tiene una boca larga y llena de dientes";

                break;

            case 2:

                horizontalClues[0] = "1. Emperador que  concedió la libertad religiosa a los cristianos";
                horizontalClues[1] = "2. Nombre que recibe el conjunto de leyes romanas";
                horizontalClues[2] = "3. El español, francés, portugués, catalán, italiano y rumano se derivaron del…";
                horizontalClues[3] = "4. El culto domestico era dirigido por el…";
                horizontalClues[4] = "5. La arquitectura y escultura romana fue influenciada por la cultura…";
                horizontalClues[5] = "6. El descenso de la producción agrícola es una causa…";

                break;

            case 3:

                horizontalClues[0] = "1. Montes que están entre Francia, Suiza e Italia";
                horizontalClues[1] = "2. País cuya capital es Bagdad";
                horizontalClues[2] = "3. País que está a la par de Haití";
                horizontalClues[3] = "4. Tercer isla más grande del mundo";
                horizontalClues[4] = "5. Cabo en la península de Somalia";
                horizontalClues[5] = "6. Capital de Bolivia";

                break;
        }

        return horizontalClues;
    }
}

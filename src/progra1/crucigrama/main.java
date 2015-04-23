package progra1.crucigrama;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends JFrame {

    public static String name = "";
    public static int score = 100;
    static int count = 0;  
    
    public static void main(String[] args) {

        final Login login = new Login();                      /*se inicializa las ventana login y sus propiedades*/
        final CrosswordWindow cw = new CrosswordWindow();
        //int category = crossInstance.getIndexFromComboBox();
        //System.out.println("category"+ category);
        //GetVerticalClues(category);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*cierra el programa al salirse de la ventana*/
        login.setVisible(true);
        login.setResizable(false);
        login.btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = login.inputUserName.getText();
                 cw.setVisible(true);
                 count++;
                login.dispose();
            }
        });
        
        cw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cw.newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                cw.crossPanel.repaint();
                //cw.dispose();
                //new CrosswordWindow().setVisible(true);
                
                
            }

            });
    }
    public static String getScore(int userScore){
        
        String finalScore = ""+userScore;
        
        return finalScore;
    
    }
    
    public static void characterMinusScore(){
    
    score = score - 5;
        
    }
    public static void wordMinusScore(){
    
    score = score - 10;
        
    }
    public static void minusScore(){
    
    score = score - 100;
        
    }
    
    
    public static String[] getVerticalClues(int category) {

        String verticalClues[] = new String[6];
        switch (category) {

            case 0:

                verticalClues[0] = "1. Es delgada larga y se arrastra"; //culebra
                verticalClues[1] = "2. Considerado el segundo mejor amigo del hombre y es inteligente"; //delfin
                verticalClues[2] = "3. Es muy casado por los Japoneses"; //ballena
                verticalClues[3] = "4. Reptil pequeño de sangre fría, que necesita del sol "; //iguana

                break;

            case 1:

               
                verticalClues[0] = "1. Ciudad considerada el centro de la cultura Rusa"; //moscu
                verticalClues[1] = "2. Capital del país que esta entre Ecuador y Venezuela"; //bogota

                break;

            case 2:
                
                verticalClues[0] = "1. Rafagas de viento de gran velocidad que azotan en centro de Estados Unidos"; //tornado
                verticalClues[1] = "2. Las que contienen el agua de la lluvia en el cielo"; //nubes
                verticalClues[2] = "3. Cuando hay que ponerse un sueter es porque hace mucho..."; //frio
                verticalClues[3] = "4. Muy caracteristica en invierno, de los paises ubicados mas cerca de los polos"; //nieve

                break;
        }

        return verticalClues;
    }

    public static String[] getHorizontalClues(int category) {
        String horizontalClues[] = new String[6];

        switch (category) {

            case 0:

                horizontalClues[0] = "1. Le gusta revolcarse en el barro"; //cerdo
                horizontalClues[1] = "2. Animal en peligro de extinción que posee rayas y es rapido"; //tigre
                horizontalClues[2] = "3. Recientemente se descubrio una en el país que se parece a un personaje de los Muppets"; //rana
                horizontalClues[3] = "4. Animal casero odioso y que suelta muchos pelos"; //gato

                break;

            case 1:

                horizontalClues[0] = "1. La capital de Japón"; //tokio
                horizontalClues[1] = "2. La segunda ciudad mas grande de Texas"; //Houston
                horizontalClues[2] = "3. La capital de Costa Rica"; //san jose
                horizontalClues[3] = "4. La capital del país que tiene el lago Titicaca"; //la paz

                break;

            case 2:

                 horizontalClues[0] = "1. Corre antes de empezar una lluvia"; //viento
                horizontalClues[1] = "2. Lllamada ... frío"; //frente
                horizontalClues[2] = "3. Estación en el trópico que va desde Diciembre a Mayo"; //seca

                break;
        }

        return horizontalClues;
    }

    }
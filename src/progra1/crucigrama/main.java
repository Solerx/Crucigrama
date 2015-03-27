package progra1.crucigrama;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class main extends JFrame {

    public static String name = "";
    public static int score = 100;
    
    public static void main(String[] args) {

        final Login login = new Login();                      /*se inicializa las ventana login y sus propiedades*/
      
        //int category = crossInstance.getIndexFromComboBox();
        //System.out.println("category"+ category);
        //GetVerticalClues(category);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*cierra el programa al salirse de la ventana*/
        login.setVisible(true);
        login.setResizable(false);
        login.btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = login.inputUserName.getText();
                new CrosswordWindow().setVisible(true);
                login.dispose();
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

    public static String[] getHorizontalClues(int category) {
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
/*
    El arreglo con las palabras del crucigrama en sus respectivas coordenadas
    */
    public static String[][] crosswordAnswers(int category) {
        String[][] crosswordAnswers = new String[14][22];
        
        switch (category) {
            
            case 1:
                
                crosswordAnswers[0][0] = "";
                crosswordAnswers[1][0] = ""; crosswordAnswers[1][1] = ""; crosswordAnswers[1][2] = ""; crosswordAnswers[1][3] = ""; crosswordAnswers[1][4] = ""; crosswordAnswers[1][5] = ""; crosswordAnswers[1][6] = ""; crosswordAnswers[1][7] = ""; crosswordAnswers[1][8] = ""; crosswordAnswers[1][9] = ""; crosswordAnswers[1][10] = ""; crosswordAnswers[1][11] = ""; crosswordAnswers[1][12] = "";  crosswordAnswers[1][13] = ""; crosswordAnswers[1][14] = ""; crosswordAnswers[1][15] = "E";
                crosswordAnswers[2][0] = ""; crosswordAnswers[2][1] = ""; crosswordAnswers[2][2] = ""; crosswordAnswers[2][3] = ""; crosswordAnswers[2][4] = ""; crosswordAnswers[2][5] = ""; crosswordAnswers[2][6] = ""; crosswordAnswers[2][7] = ""; crosswordAnswers[2][8] = "C"; crosswordAnswers[2][9] = "O"; crosswordAnswers[2][10] = "C"; crosswordAnswers[2][11] = "O"; crosswordAnswers[2][12] = "D"; crosswordAnswers[2][13] = "R"; crosswordAnswers[2][14] = "I"; crosswordAnswers[2][15] = "L"; crosswordAnswers[2][16] = "O";
                crosswordAnswers[3][0] = ""; crosswordAnswers[3][1] = ""; crosswordAnswers[3][2] = ""; crosswordAnswers[3][3] = ""; crosswordAnswers[3][4] = ""; crosswordAnswers[3][5] = ""; crosswordAnswers[3][6] = ""; crosswordAnswers[3][7] = ""; crosswordAnswers[3][8] = ""; crosswordAnswers[3][9] = ""; crosswordAnswers[3][10] = ""; crosswordAnswers[3][11] = ""; crosswordAnswers[3][12] = ""; crosswordAnswers[3][13] = ""; crosswordAnswers[3][14] = ""; crosswordAnswers[3][15] = "E"; 
                crosswordAnswers[4][0] = ""; crosswordAnswers[4][1] = ""; crosswordAnswers[4][2] = ""; crosswordAnswers[4][3] = ""; crosswordAnswers[4][4] = ""; crosswordAnswers[4][5] = ""; crosswordAnswers[4][6] = ""; crosswordAnswers[4][7] = ""; crosswordAnswers[4][8] = ""; crosswordAnswers[4][9] = "C"; crosswordAnswers[4][10] = ""; crosswordAnswers[4][11] = ""; crosswordAnswers[4][12] = ""; crosswordAnswers[4][13] = ""; crosswordAnswers[4][14] = ""; crosswordAnswers[4][15] = "F"; crosswordAnswers[4][16] = ""; crosswordAnswers[4][17] = "J";
                crosswordAnswers[5][0] = ""; crosswordAnswers[5][1] = ""; crosswordAnswers[5][2] = ""; crosswordAnswers[5][3] = ""; crosswordAnswers[5][4] = ""; crosswordAnswers[5][5] = ""; crosswordAnswers[5][6] = "G"; crosswordAnswers[5][7] = ""; crosswordAnswers[5][8] = "M"; crosswordAnswers[5][9] = "A"; crosswordAnswers[5][10] = "R"; crosswordAnswers[5][11] = "I"; crosswordAnswers[5][12] = "P"; crosswordAnswers[5][13] = "O"; crosswordAnswers[5][14] = "S"; crosswordAnswers[5][15] = "A"; crosswordAnswers[5][16] = ""; crosswordAnswers[5][17] = "I"; crosswordAnswers[5][18] = ""; crosswordAnswers[5][19] = "L";  
                crosswordAnswers[6][0] = ""; crosswordAnswers[6][1] = ""; crosswordAnswers[6][2] = ""; crosswordAnswers[6][3] = ""; crosswordAnswers[6][4] = ""; crosswordAnswers[6][5] = ""; crosswordAnswers[6][6] = "A"; crosswordAnswers[6][7] = ""; crosswordAnswers[6][8] = ""; crosswordAnswers[6][9] = "B"; crosswordAnswers[6][10] = ""; crosswordAnswers[6][11] = ""; crosswordAnswers[6][12] = "A"; crosswordAnswers[6][13] = ""; crosswordAnswers[6][14] = ""; crosswordAnswers[6][15] = "N"; crosswordAnswers[6][16] = ""; crosswordAnswers[6][17] = "R"; crosswordAnswers[6][18] = ""; crosswordAnswers[6][19] = "E"; 
                crosswordAnswers[7][0] = ""; crosswordAnswers[7][1] = ""; crosswordAnswers[7][2] = ""; crosswordAnswers[7][3] = "T"; crosswordAnswers[7][4] = "O"; crosswordAnswers[7][5] = "R"; crosswordAnswers[7][6] = "T"; crosswordAnswers[7][7] = "U"; crosswordAnswers[7][8] = "G"; crosswordAnswers[7][9] = "A"; crosswordAnswers[7][10] = ""; crosswordAnswers[7][11] = ""; crosswordAnswers[7][12] = "N"; crosswordAnswers[7][13] = ""; crosswordAnswers[7][14] = ""; crosswordAnswers[7][15] = "T"; crosswordAnswers[7][16] = ""; crosswordAnswers[7][17] = "A"; crosswordAnswers[7][18] = ""; crosswordAnswers[7][19] = "O"; 
                crosswordAnswers[8][0] = ""; crosswordAnswers[8][1] = ""; crosswordAnswers[8][2] = ""; crosswordAnswers[8][3] = "I"; crosswordAnswers[8][4] = ""; crosswordAnswers[8][5] = ""; crosswordAnswers[8][6] = "O"; crosswordAnswers[8][7] = ""; crosswordAnswers[8][8] = ""; crosswordAnswers[8][9] = "L"; crosswordAnswers[8][10] = ""; crosswordAnswers[8][11] = ""; crosswordAnswers[8][12] = "D"; crosswordAnswers[8][13] = ""; crosswordAnswers[8][14] = "D"; crosswordAnswers[8][15] = "E"; crosswordAnswers[8][16] = "L"; crosswordAnswers[8][17] = "F"; crosswordAnswers[8][18] = "I"; crosswordAnswers[8][19] = "N";  
                crosswordAnswers[9][0] = ""; crosswordAnswers[9][1] = ""; crosswordAnswers[9][2] = ""; crosswordAnswers[9][3] = "G"; crosswordAnswers[9][4] = ""; crosswordAnswers[9][5] = ""; crosswordAnswers[9][6] = ""; crosswordAnswers[9][7] = ""; crosswordAnswers[9][8] = ""; crosswordAnswers[9][9] = "L"; crosswordAnswers[9][10] = ""; crosswordAnswers[9][11] = ""; crosswordAnswers[9][12] = "A"; crosswordAnswers[9][13] = ""; crosswordAnswers[9][14] = ""; crosswordAnswers[9][15] = ""; crosswordAnswers[9][16] = ""; crosswordAnswers[9][17] = "A"; 
                crosswordAnswers[10][0] = ""; crosswordAnswers[10][1] = ""; crosswordAnswers[10][2] = ""; crosswordAnswers[10][3] = "R"; crosswordAnswers[10][4] = ""; crosswordAnswers[10][5] = "P"; crosswordAnswers[10][6] = "E"; crosswordAnswers[10][7] = "R"; crosswordAnswers[10][8] = "R"; crosswordAnswers[10][9] = "O"; 
                crosswordAnswers[11][0] = ""; crosswordAnswers[11][1] = ""; crosswordAnswers[11][2] = ""; crosswordAnswers[11][3] = "E";
                
                break;
                
            case 2:
                
                crosswordAnswers[0][0] = ""; crosswordAnswers[0][1] = ""; crosswordAnswers[0][2] = ""; crosswordAnswers[0][3] = ""; crosswordAnswers[0][4] = ""; crosswordAnswers[0][5] = ""; crosswordAnswers[0][6] = ""; crosswordAnswers[0][7] = ""; crosswordAnswers[0][8] = ""; crosswordAnswers[0][9] = ""; crosswordAnswers[0][10] = ""; crosswordAnswers[0][11] = ""; crosswordAnswers[0][12] = ""; crosswordAnswers[0][13] = ""; crosswordAnswers[0][14] = ""; crosswordAnswers[0][15] = ""; crosswordAnswers[0][16] = ""; crosswordAnswers[0][17] = ""; crosswordAnswers[0][18] = ""; crosswordAnswers[0][19] = ""; crosswordAnswers[0][20] = ""; crosswordAnswers[0][21] = ""; crosswordAnswers[0][22] = "C"; 
                crosswordAnswers[1][0] = ""; crosswordAnswers[1][1] = ""; crosswordAnswers[1][2] = ""; crosswordAnswers[1][3] = "L"; crosswordAnswers[1][4] = ""; crosswordAnswers[1][5] = ""; crosswordAnswers[1][6] = ""; crosswordAnswers[1][7] = ""; crosswordAnswers[1][8] = ""; crosswordAnswers[1][9] = ""; crosswordAnswers[1][10] = "G"; crosswordAnswers[1][11] = ""; crosswordAnswers[1][12] = ""; crosswordAnswers[1][13] = "D"; crosswordAnswers[1][14] = ""; crosswordAnswers[1][15] = ""; crosswordAnswers[1][16] = ""; crosswordAnswers[1][17] = ""; crosswordAnswers[1][18] = ""; crosswordAnswers[1][19] = ""; crosswordAnswers[1][20] = ""; crosswordAnswers[1][21] = ""; crosswordAnswers[1][22] = "A";  
                crosswordAnswers[2][0] = ""; crosswordAnswers[2][1] = ""; crosswordAnswers[2][2] = ""; crosswordAnswers[2][3] = "A"; crosswordAnswers[2][4] = ""; crosswordAnswers[2][5] = ""; crosswordAnswers[2][6] = ""; crosswordAnswers[2][7] = ""; crosswordAnswers[2][8] = ""; crosswordAnswers[2][9] = ""; crosswordAnswers[2][10] = "R"; crosswordAnswers[2][11] = ""; crosswordAnswers[2][12] = ""; crosswordAnswers[2][13] = "E"; crosswordAnswers[2][14] = ""; crosswordAnswers[2][15] = ""; crosswordAnswers[2][16] = ""; crosswordAnswers[2][17] = ""; crosswordAnswers[2][18] = ""; crosswordAnswers[2][19] = ""; crosswordAnswers[2][20] = ""; crosswordAnswers[2][21] = ""; crosswordAnswers[2][22] = "T"; 
                crosswordAnswers[3][0] = ""; crosswordAnswers[3][1] = ""; crosswordAnswers[3][2] = ""; crosswordAnswers[3][3] = "T"; crosswordAnswers[3][4] = ""; crosswordAnswers[3][5] = ""; crosswordAnswers[3][6] = ""; crosswordAnswers[3][7] = "L"; crosswordAnswers[3][8] = "A"; crosswordAnswers[3][9] = "T"; crosswordAnswers[3][10] = "I"; crosswordAnswers[3][11] = "N"; crosswordAnswers[3][12] = ""; crosswordAnswers[3][13] = "R"; crosswordAnswers[3][14] = ""; crosswordAnswers[3][15] = ""; crosswordAnswers[3][16] = ""; crosswordAnswers[2][17] = ""; crosswordAnswers[3][18] = ""; crosswordAnswers[3][19] = ""; crosswordAnswers[3][20] = ""; crosswordAnswers[3][21] = ""; crosswordAnswers[3][22] = "A";
                crosswordAnswers[4][0] = "J"; crosswordAnswers[4][1] = "U"; crosswordAnswers[4][2] = "P"; crosswordAnswers[4][3] = "I"; crosswordAnswers[4][4] = "T"; crosswordAnswers[4][5] = "E"; crosswordAnswers[4][6] = "R"; crosswordAnswers[4][7] = ""; crosswordAnswers[4][8] = ""; crosswordAnswers[4][9] = ""; crosswordAnswers[4][10] = "E"; crosswordAnswers[4][11] = ""; crosswordAnswers[4][12] = ""; crosswordAnswers[4][13] = "E"; crosswordAnswers[4][14] = ""; crosswordAnswers[4][15] = ""; crosswordAnswers[4][16] = ""; crosswordAnswers[4][17] = ""; crosswordAnswers[4][18] = ""; crosswordAnswers[4][19] = ""; crosswordAnswers[4][20] = ""; crosswordAnswers[4][21] = ""; crosswordAnswers[4][22] = "C"; 
                crosswordAnswers[5][0] = ""; crosswordAnswers[5][1] = ""; crosswordAnswers[5][2] = ""; crosswordAnswers[5][3] = "N"; crosswordAnswers[5][4] = ""; crosswordAnswers[5][5] = "C"; crosswordAnswers[5][6] = ""; crosswordAnswers[5][7] = ""; crosswordAnswers[5][8] = ""; crosswordAnswers[5][9] = "A"; crosswordAnswers[5][10] = "G"; crosswordAnswers[5][11] = "R"; crosswordAnswers[5][12] = "I"; crosswordAnswers[5][13] = "C"; crosswordAnswers[5][14] = "U"; crosswordAnswers[5][15] = "L"; crosswordAnswers[5][16] = "T"; crosswordAnswers[5][17] = "U"; crosswordAnswers[5][18] = "R"; crosswordAnswers[5][19] = "A"; crosswordAnswers[5][20] = ""; crosswordAnswers[5][21] = ""; crosswordAnswers[5][22] = "U";  
                crosswordAnswers[6][0] = ""; crosswordAnswers[6][1] = ""; crosswordAnswers[6][2] = ""; crosswordAnswers[6][3] = ""; crosswordAnswers[6][4] = ""; crosswordAnswers[6][5] = "O"; crosswordAnswers[6][6] = ""; crosswordAnswers[6][7] = ""; crosswordAnswers[6][8] = ""; crosswordAnswers[6][9] = ""; crosswordAnswers[6][10] = "A"; crosswordAnswers[6][11] = ""; crosswordAnswers[6][12] = ""; crosswordAnswers[6][13] = "H"; crosswordAnswers[6][14] = ""; crosswordAnswers[6][15] = ""; crosswordAnswers[6][16] = ""; crosswordAnswers[6][17] = ""; crosswordAnswers[6][18] = ""; crosswordAnswers[6][19] = ""; crosswordAnswers[6][20] = ""; crosswordAnswers[6][21] = ""; crosswordAnswers[6][22] = "M"; 
                crosswordAnswers[7][0] = ""; crosswordAnswers[7][1] = ""; crosswordAnswers[7][2] = ""; crosswordAnswers[7][3] = ""; crosswordAnswers[7][4] = ""; crosswordAnswers[7][5] = "N"; crosswordAnswers[7][6] = ""; crosswordAnswers[7][7] = ""; crosswordAnswers[7][8] = ""; crosswordAnswers[7][9] = ""; crosswordAnswers[7][10] = ""; crosswordAnswers[7][11] = ""; crosswordAnswers[7][12] = ""; crosswordAnswers[7][13] = "O"; crosswordAnswers[7][14] = ""; crosswordAnswers[7][15] = ""; crosswordAnswers[7][16] = ""; crosswordAnswers[7][17] = ""; crosswordAnswers[7][18] = ""; crosswordAnswers[7][19] = ""; crosswordAnswers[7][20] = "P"; crosswordAnswers[7][21] = ""; crosswordAnswers[7][22] = "B"; 
                crosswordAnswers[8][0] = ""; crosswordAnswers[8][1] = ""; crosswordAnswers[8][2] = ""; crosswordAnswers[8][3] = ""; crosswordAnswers[8][4] = ""; crosswordAnswers[8][5] = "O"; crosswordAnswers[8][6] = ""; crosswordAnswers[8][7] = ""; crosswordAnswers[8][8] = ""; crosswordAnswers[8][9] = "D"; crosswordAnswers[8][10] = "E"; crosswordAnswers[8][11] = "N"; crosswordAnswers[8][12] = "A"; crosswordAnswers[8][13] = "R"; crosswordAnswers[8][14] = "I"; crosswordAnswers[8][15] = "O"; crosswordAnswers[8][16] = "D"; crosswordAnswers[8][17] = "E"; crosswordAnswers[8][18] = "P"; crosswordAnswers[8][19] = "L"; crosswordAnswers[8][20] = "A"; crosswordAnswers[8][21] = "T"; crosswordAnswers[8][22] = "A"; 
                crosswordAnswers[9][0] = ""; crosswordAnswers[9][1] = ""; crosswordAnswers[9][2] = ""; crosswordAnswers[9][3] = ""; crosswordAnswers[9][4] = ""; crosswordAnswers[9][5] = "M"; crosswordAnswers[9][6] = ""; crosswordAnswers[9][7] = ""; crosswordAnswers[9][8] = ""; crosswordAnswers[9][9] = ""; crosswordAnswers[9][10] = ""; crosswordAnswers[9][11] = ""; crosswordAnswers[9][12] = ""; crosswordAnswers[9][13] = "O"; crosswordAnswers[9][14] = ""; crosswordAnswers[9][15] = ""; crosswordAnswers[9][16] = ""; crosswordAnswers[9][17] = ""; crosswordAnswers[9][18] = ""; crosswordAnswers[9][19] = ""; crosswordAnswers[9][20] = "D"; crosswordAnswers[9][21] = ""; crosswordAnswers[9][22] = "S"; 
                crosswordAnswers[10][0] = ""; crosswordAnswers[10][1] = ""; crosswordAnswers[10][2] = ""; crosswordAnswers[10][3] = "C"; crosswordAnswers[10][4] = "R"; crosswordAnswers[10][5] = "I"; crosswordAnswers[10][6] = "S"; crosswordAnswers[10][7] = "T"; crosswordAnswers[10][8] = "I"; crosswordAnswers[10][9] = "A"; crosswordAnswers[10][10] = "N"; crosswordAnswers[10][11] = "I"; crosswordAnswers[10][12] = "S"; crosswordAnswers[10][13] = "M"; crosswordAnswers[10][14] = "O"; crosswordAnswers[10][15] = ""; crosswordAnswers[10][16] = ""; crosswordAnswers[10][17] = ""; crosswordAnswers[10][18] = ""; crosswordAnswers[10][19] = ""; crosswordAnswers[10][20] = "R"; 
                crosswordAnswers[11][0] = ""; crosswordAnswers[11][1] = ""; crosswordAnswers[11][2] = ""; crosswordAnswers[11][3] = ""; crosswordAnswers[11][4] = ""; crosswordAnswers[11][5] = "C"; crosswordAnswers[11][6] = ""; crosswordAnswers[11][7] = ""; crosswordAnswers[11][8] = ""; crosswordAnswers[11][9] = ""; crosswordAnswers[11][10] = ""; crosswordAnswers[11][11] = ""; crosswordAnswers[11][12] = ""; crosswordAnswers[11][13] = "A"; crosswordAnswers[11][14] = ""; crosswordAnswers[11][15] = ""; crosswordAnswers[11][16] = ""; crosswordAnswers[11][17] = ""; crosswordAnswers[11][18] = ""; crosswordAnswers[11][19] = ""; crosswordAnswers[11][20] = "E"; 
                crosswordAnswers[12][0] = ""; crosswordAnswers[12][1] = ""; crosswordAnswers[12][2] = ""; crosswordAnswers[12][3] = ""; crosswordAnswers[12][4] = ""; crosswordAnswers[12][5] = "A"; crosswordAnswers[12][6] = ""; crosswordAnswers[12][7] = "C"; crosswordAnswers[12][8] = "O"; crosswordAnswers[12][9] = "N"; crosswordAnswers[12][10] = "S"; crosswordAnswers[12][11] = "T"; crosswordAnswers[12][12] = "A"; crosswordAnswers[12][13] = "N"; crosswordAnswers[12][14] = "T"; crosswordAnswers[12][15] = "I"; crosswordAnswers[12][16] = "N"; crosswordAnswers[12][17] = "O"; 
                crosswordAnswers[13][0] = ""; crosswordAnswers[13][1] = ""; crosswordAnswers[13][2] = ""; crosswordAnswers[13][3] = ""; crosswordAnswers[13][4] = ""; crosswordAnswers[13][5] = ""; crosswordAnswers[13][6] = ""; crosswordAnswers[13][7] = ""; crosswordAnswers[13][8] = ""; crosswordAnswers[13][9] = ""; crosswordAnswers[13][10] = ""; crosswordAnswers[13][11] = ""; crosswordAnswers[13][12] = ""; crosswordAnswers[13][13] = "O"; 
                
                break;
                
            case 3:
                
                crosswordAnswers[0][0] = ""; crosswordAnswers[0][1] = ""; crosswordAnswers[0][2] = ""; crosswordAnswers[0][3] = ""; crosswordAnswers[0][4] = ""; crosswordAnswers[0][5] = ""; crosswordAnswers[0][6] = ""; crosswordAnswers[0][7] = ""; crosswordAnswers[0][8] = ""; crosswordAnswers[0][9] = "G"; crosswordAnswers[0][10] = ""; crosswordAnswers[0][11] = ""; crosswordAnswers[0][12] = ""; crosswordAnswers[0][13] = ""; crosswordAnswers[0][14] = "H"; 
                crosswordAnswers[1][0] = ""; crosswordAnswers[1][1] = ""; crosswordAnswers[1][2] = ""; crosswordAnswers[1][3] = ""; crosswordAnswers[1][4] = ""; crosswordAnswers[1][5] = "B"; crosswordAnswers[1][6] = ""; crosswordAnswers[1][7] = ""; crosswordAnswers[1][8] = ""; crosswordAnswers[1][9] = "U"; crosswordAnswers[1][10] = ""; crosswordAnswers[1][11] = "A"; crosswordAnswers[1][12] = ""; crosswordAnswers[1][13] = ""; crosswordAnswers[1][14] = "E"; crosswordAnswers[1][15] = ""; crosswordAnswers[1][16] = "A"; 
                crosswordAnswers[2][0] = ""; crosswordAnswers[2][1] = ""; crosswordAnswers[2][2] = ""; crosswordAnswers[2][3] = "C"; crosswordAnswers[2][4] = "R"; crosswordAnswers[2][5] = "O"; crosswordAnswers[2][6] = "A"; crosswordAnswers[2][7] = "C"; crosswordAnswers[2][8] = "I"; crosswordAnswers[2][9] = "A"; crosswordAnswers[2][10] = ""; crosswordAnswers[2][11] = "L"; crosswordAnswers[2][12] = ""; crosswordAnswers[2][13] = ""; crosswordAnswers[2][14] = "L"; crosswordAnswers[2][15] = ""; crosswordAnswers[2][16] = "T"; crosswordAnswers[2][17] = ""; crosswordAnswers[2][18] = "I"; 
                crosswordAnswers[3][0] = ""; crosswordAnswers[3][1] = ""; crosswordAnswers[3][2] = ""; crosswordAnswers[3][3] = ""; crosswordAnswers[3][4] = ""; crosswordAnswers[3][5] = "G"; crosswordAnswers[3][6] = ""; crosswordAnswers[3][7] = ""; crosswordAnswers[3][8] = ""; crosswordAnswers[3][9] = "R"; crosswordAnswers[3][10] = ""; crosswordAnswers[3][11] = "E"; crosswordAnswers[3][12] = ""; crosswordAnswers[3][13] = ""; crosswordAnswers[3][14] = "S"; crosswordAnswers[3][15] = ""; crosswordAnswers[3][16] = "L"; crosswordAnswers[3][17] = ""; crosswordAnswers[3][18] = "R"; crosswordAnswers[3][19] = ""; crosswordAnswers[3][20] = "A"; 
                crosswordAnswers[4][0] = "B"; crosswordAnswers[4][1] = "O"; crosswordAnswers[4][2] = "R"; crosswordAnswers[4][3] = "N"; crosswordAnswers[4][4] = "E"; crosswordAnswers[4][5] = "O"; crosswordAnswers[4][6] = ""; crosswordAnswers[4][7] = ""; crosswordAnswers[4][8] = ""; crosswordAnswers[4][9] = "D"; crosswordAnswers[4][10] = "O"; crosswordAnswers[4][11] = "M"; crosswordAnswers[4][12] = "I"; crosswordAnswers[4][13] = "N"; crosswordAnswers[4][14] = "I"; crosswordAnswers[4][15] = "C"; crosswordAnswers[4][16] = "A"; crosswordAnswers[4][17] = "N"; crosswordAnswers[4][18] = "A"; crosswordAnswers[4][19] = ""; crosswordAnswers[4][20] = "L";
                crosswordAnswers[5][0] = ""; crosswordAnswers[5][1] = ""; crosswordAnswers[5][2] = ""; crosswordAnswers[5][3] = ""; crosswordAnswers[5][4] = ""; crosswordAnswers[5][5] = "T"; crosswordAnswers[5][6] = ""; crosswordAnswers[5][7] = ""; crosswordAnswers[5][8] = ""; crosswordAnswers[5][9] = "A"; crosswordAnswers[5][10] = ""; crosswordAnswers[5][11] = "A"; crosswordAnswers[5][12] = ""; crosswordAnswers[5][13] = ""; crosswordAnswers[5][14] = "N"; crosswordAnswers[5][15] = ""; crosswordAnswers[5][16] = "N"; crosswordAnswers[5][17] = ""; crosswordAnswers[5][18] = "K"; crosswordAnswers[5][19] = ""; crosswordAnswers[5][20] = "P"; 
                crosswordAnswers[6][0] = ""; crosswordAnswers[6][1] = ""; crosswordAnswers[6][2] = "L"; crosswordAnswers[6][3] = "A"; crosswordAnswers[6][4] = "P"; crosswordAnswers[6][5] = "A"; crosswordAnswers[6][6] = "Z"; crosswordAnswers[6][7] = ""; crosswordAnswers[6][8] = ""; crosswordAnswers[6][9] = "F"; crosswordAnswers[6][10] = ""; crosswordAnswers[6][11] = "N"; crosswordAnswers[6][12] = ""; crosswordAnswers[6][13] = ""; crosswordAnswers[6][14] = "K"; crosswordAnswers[6][15] = ""; crosswordAnswers[6][16] = "T"; crosswordAnswers[6][17] = ""; crosswordAnswers[6][18] = ""; crosswordAnswers[6][19] = ""; crosswordAnswers[6][20] = ""; crosswordAnswers[6][21] = "E"; 
                crosswordAnswers[7][0] = ""; crosswordAnswers[7][1] = ""; crosswordAnswers[7][2] = ""; crosswordAnswers[7][3] = ""; crosswordAnswers[7][4] = ""; crosswordAnswers[7][5] = ""; crosswordAnswers[7][6] = ""; crosswordAnswers[7][7] = ""; crosswordAnswers[7][8] = ""; crosswordAnswers[7][9] = "U"; crosswordAnswers[7][10] = ""; crosswordAnswers[7][11] = "I"; crosswordAnswers[7][12] = ""; crosswordAnswers[7][13] = ""; crosswordAnswers[7][14] = "I"; crosswordAnswers[7][15] = ""; crosswordAnswers[7][16] = "I"; crosswordAnswers[7][17] = "R"; crosswordAnswers[7][18] = "T"; crosswordAnswers[7][19] = "I"; crosswordAnswers[7][20] = "S"; crosswordAnswers[7][21] = "H"; 
                crosswordAnswers[8][0] = ""; crosswordAnswers[8][1] = ""; crosswordAnswers[8][2] = ""; crosswordAnswers[8][3] = ""; crosswordAnswers[8][4] = ""; crosswordAnswers[8][5] = ""; crosswordAnswers[8][6] = ""; crosswordAnswers[8][7] = ""; crosswordAnswers[8][8] = ""; crosswordAnswers[8][9] = "I"; crosswordAnswers[8][10] = "I"; crosswordAnswers[8][11] = "A"; crosswordAnswers[8][12] = "A"; crosswordAnswers[8][13] = ""; crosswordAnswers[8][14] = ""; crosswordAnswers[8][15] = ""; crosswordAnswers[8][16] = "C"; crosswordAnswers[8][17] = "";
                crosswordAnswers[9][0] = ""; crosswordAnswers[9][1] = ""; crosswordAnswers[9][2] = ""; crosswordAnswers[9][3] = ""; crosswordAnswers[9][4] = ""; crosswordAnswers[9][5] = ""; crosswordAnswers[9][6] = ""; crosswordAnswers[9][7] = ""; crosswordAnswers[9][8] = ""; crosswordAnswers[9][9] = ""; crosswordAnswers[9][10] = ""; crosswordAnswers[9][11] = ""; crosswordAnswers[9][12] = ""; crosswordAnswers[9][13] = ""; crosswordAnswers[9][14] = ""; crosswordAnswers[9][15] = ""; crosswordAnswers[9][16] = "O"; 
                
                break;
                
        }
        return crosswordAnswers;
    }
        
}

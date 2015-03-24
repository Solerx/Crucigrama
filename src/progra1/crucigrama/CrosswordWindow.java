package progra1.crucigrama;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;



public class CrosswordWindow extends JFrame {
  
    public JLabel player;   
    public JLabel horizontalText;
    public JLabel verticalText;
    public JLabel score;
    public JLabel userName;
    public JComboBox crosswordCategories;
    public JPanel crossPanel;
    public JButton newGame;
    public JButton revealAll;
    public JButton showChar;
    public JButton showWord;
    public JButton verifyWord;
    public JList horizList;
    public JList vertList;
    
    
    public CrosswordWindow() {
        super("Crucigrama");  /*Titulo de la ventana*/
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        
        
        /*tamaño de la ventana y el centrado de la ventana. Si se pone el valor setSize en la clase main, que vendria siendo crosswordWindow.setSize();,
        no funciona bien con el paquete Toolkit y Dimension, que son los que centran la ventana*/
        setSize(950, 650);
        Toolkit toolkit = getToolkit();
        Dimension centerCross = toolkit.getScreenSize();
        setLocation(centerCross.width/2 - getWidth()/2, centerCross.height/2 - getHeight()/2);
        
        
        player = new JLabel("Jugador:");
        Dimension sizePlayer = player.getPreferredSize();
        player.setBounds(15, 30, sizePlayer.width, sizePlayer.height); /*los primeros 2 valores definen el posicionamiento en la ventana -> horizontal y vertical.*/
        add(player);
        
        
        //aca va el nombre digitado por el usuario en la pantalla login
        userName = new JLabel(Main.setName); 
        Dimension sizeUser = userName.getPreferredSize();
        userName.setBounds(69, 30, sizeUser.width, sizeUser.height);
        userName.setFont(new Font("Arial", Font.BOLD, 12));
        add(userName);
        
        
        score = new JLabel("Puntuación:");
        Dimension scoreText = score.getPreferredSize();
        score.setBounds(15, 370, scoreText.width, scoreText.height);
        add(score);
        
        
        horizontalText = new JLabel("Pistas Horizontales");
        Dimension hzList = horizontalText.getPreferredSize();
        horizontalText.setBounds(40, 410, hzList.width, hzList.height);
        horizontalText.setFont(new Font("Arial", Font.PLAIN, 12));
        add(horizontalText);
        
        
        verticalText = new JLabel("Pistas Verticales");
        Dimension vtList = verticalText.getPreferredSize();
        verticalText.setBounds(495, 410, vtList.width, vtList.height);
        verticalText.setFont(new Font("Arial", Font.PLAIN, 12));
        add(verticalText);
        
        
        crosswordCategories = new JComboBox();
        crosswordCategories.setBounds(20, 100, 150, 21); /*Los últimos 2 valores definen el tamaño del objeto*/
        crosswordCategories.setFont(new Font("Tahoma", Font.PLAIN, 11)); /*cambio de letra y tamaño*/
        crosswordCategories.setToolTipText("Seleccione una categoria");
        add(crosswordCategories);
        
        
        /*El panel que va a contener el crucigrama en si*/
        crossPanel = new JPanel(); 
        crossPanel.setBounds(240, 40, 680, 360);
        crossPanel.setBackground(Color.white);
        crossPanel.setBorder(BorderFactory.createEtchedBorder(1, Color.lightGray, Color.lightGray));
        add(crossPanel);
        
        
        newGame = new JButton("Nuevo juego"); 
        newGame.setBounds(20, 160, 130, 25);  /*El tamaño de los botones se ponen a mano porque tienen que coincidir todos en tamaño*/
        newGame.setFont(new Font("Tahoma", Font.PLAIN, 11));
        add(newGame);
        
        
        showChar = new JButton("Revelar letra");
        showChar.setBounds(20, 215, 130, 25);
        showChar.setFont(new Font("Tahoma", Font.PLAIN, 11));
        add(showChar);
        
        
        showWord = new JButton("Revelar palabra");
        showWord.setBounds(20, 250, 130, 25);
        showWord.setFont(new Font("Tahoma", Font.PLAIN, 11));
        add(showWord);
        
        
        verifyWord = new JButton("Verificar palabra");
        verifyWord.setBounds(20, 285, 130, 25);
        verifyWord.setFont(new Font("Tahoma", Font.PLAIN, 11));
        add(verifyWord);
        
        
        revealAll = new JButton("Solucionar juego");
        revealAll.setBounds(20, 320, 130, 25);
        revealAll.setFont(new Font("Tahoma", Font.PLAIN, 11));
        add(revealAll);
        
        
        /*creacion y propiedades de la lista JList con las pistas horizontales.*/
        horizList = new JList();  
        horizList.setBounds(35, 430, 420, 170);
        horizList.setBackground(Color.white);
        horizList.setBorder(BorderFactory.createEtchedBorder(1));
        add(horizList);
        
        
        /*creacion y propiedades de la lista JList con las pistas verticales.*/
        vertList = new JList();  
        vertList.setBounds(490, 430, 420, 170);
        vertList.setBackground(Color.white);
        vertList.setBorder(BorderFactory.createEtchedBorder(1));
        add(vertList);
        
}
    
    public static void clueVertAnimals(){
        ArrayList clueVert = new ArrayList();
        clueVert.add("Mamífero acuático muy inteligente y simpático"); //DELFIN
        clueVert.add("Muy grande con colmillos, orejas enormes y trompa"); //ELEFANTE
        clueVert.add("Felino pintado a rayas, muy feroz"); //TIGRE
        clueVert.add("Es el animal con el cuello más largo"); //JIRAFA
        clueVert.add("Al trote o al galope era el medio de transporte de indios y vaqueros"); //CABALLO
        clueVert.add("Como lleva un caparazón muy pesado, siempre va muy despacio"); //TORTUGA
    }
    
    public static void clueHoriAnimals(){
        ArrayList clueHori = new ArrayList();
        clueHori.add("Tiene bigotes y siete vidas"); //GATO
        clueHori.add("Oso grande, blanco y negro y es originario de Asia"); //PANDA
        clueHori.add("Tiene alas grandes, coloridas y sale de un capullo"); //MARIPOSA
        clueHori.add("Dicen que es el mejor amigo del hombre"); //PERRO
        clueHori.add("El rey de la selva, con melena larga"); //LEON
        clueHori.add("Vive en el agua y tiene una boca larga y llena de dientes"); //COCODRILO
    }
    
    public static void clueVertRoman(){
        ArrayList clueVert = new ArrayList();
        clueVert.add("Los cristianos se refugiaban en…"); //CATACUMBAS
        clueVert.add("Religión que en un principio fue perseguida pero después paso a ser la religión oficial del imperio romano"); //CRISTIANISMO
        clueVert.add("Era la moneda Romana"); //DENARIODEPLATA <--- palabra mas larga con 14 chars
        clueVert.add("Era la principal actividad económica Romana"); //AGRICULTURA
        clueVert.add("Nombre de la lengua del Imperio Romano "); //LATIN
        clueVert.add("Nombre del principal dios romano en la época pre cristiana"); //JUPITER
    }
    
    public static void clueHoriRoman(){
        ArrayList clueHori = new ArrayList();
        clueHori.add("Emperador que  concedió la libertad religiosa a los cristianos"); //CONSTANTINO
        clueHori.add("Nombre que recibe el conjunto de leyes romanas"); //DERECHOROMANO
        clueHori.add("El español, francés, portugués, catalán, italiano y rumano se derivaron del… "); //LATIN
        clueHori.add("El culto domestico era dirigido por el… "); //PADRE
        clueHori.add("La arquitectura y escultura romana fue influenciada por la cultura… "); //GRIEGA
        clueHori.add("El descenso de la producción agrícola es una causa… "); //ECONOMICA
    }
    
    public static void clueVertGeography(){
        ArrayList clueVert = new ArrayList();
        clueVert.add("Océano que baña a Islandia"); //ATLANTICO
        clueVert.add("País por el que pasa el rio Elba"); //ALEMANIA
        clueVert.add("Capital del país situado a la derecha de Suecia"); //HELSINKI
        clueVert.add("País cuya capital es Zagreb"); //CROACIA
        clueVert.add("Rio que divide a Rusia en 2 mitades"); //IRTISH
        clueVert.add("Capital del país que se encuentra entre Venezuela y Ecuador"); //BOGOTA
    }
    
    public static void clueHoriGeography(){
        ArrayList clueHori = new ArrayList();
        clueHori.add("Montes que están entre Francia, Suiza e Italia"); //ALPES
        clueHori.add("País cuya capital es Bagdad"); //IRAK
        clueHori.add("País que está a la par de Haití"); //DOMINICANA
        clueHori.add("Tercer isla más grande del mundo"); //BORNEO
        clueHori.add("Cabo en la península de Somalia"); //GUARDAFUI
        clueHori.add("Capital de Bolivia"); //LAPAZ
    }
}

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
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class CrosswordWindow extends JFrame {

    public JLabel player;
    public JLabel horizontalText;
    public JLabel verticalText;
    public JLabel labelScore;
    public JLabel userScore;
    public JLabel userName;
    public JComboBox crosswordCategories;
    public JPanel crossPanel;
    public JButton newGame;
    public JButton revealAll;
    public JButton showChar;
    public JButton showWord;
    public JButton verifyWord;
    public JList horizontalList;
    public JList verticalList;

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
        setLocation(centerCross.width / 2 - getWidth() / 2, centerCross.height / 2 - getHeight() / 2);

        player = new JLabel("Jugador:");
        Dimension sizePlayer = player.getPreferredSize();
        player.setBounds(15, 30, sizePlayer.width, sizePlayer.height); /*los primeros 2 valores definen el posicionamiento en la ventana -> horizontal y vertical.*/

        add(player);

        //aca va el nombre digitado por el usuario en la pantalla login
        userName = new JLabel(main.name);
        Dimension sizeUser = userName.getPreferredSize();
        userName.setBounds(70, 30, sizeUser.width, sizeUser.height);
        userName.setFont(new Font("ARIAL", Font.BOLD, 12));
        add(userName);

        labelScore = new JLabel("Puntuación:");
        Dimension scoreText = labelScore.getPreferredSize();
        labelScore.setBounds(15, 370, scoreText.width, scoreText.height);
        add(labelScore);
        
        userScore = new JLabel(main.getScore(main.score));
        Dimension scoreUserText = userScore.getPreferredSize();
        userScore.setBounds(90, 370, scoreText.width, scoreText.height);
        add(userScore);
        

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

        final String categories[] = {"Seleccione una categoria: ", "Animales", "Imperio Romano", "Geografía"};
        crosswordCategories = new JComboBox(categories);
        crosswordCategories.setBounds(20, 100, 150, 21); /*Los últimos 2 valores definen el tamaño del objeto*/
        crosswordCategories.setFont(new Font("Tahoma", Font.PLAIN, 11)); /*cambio de letra y tamaño*/
        crosswordCategories.setToolTipText("Seleccione una categoria");
        add(crosswordCategories);
        crosswordCategories.addActionListener(actionListener);

        /*El panel que va a contener el crucigrama en si*/
        crossPanel = new JPanel();
        crossPanel.setBounds(240, 40, 680, 360);
        crossPanel.setBackground(Color.white);
        crossPanel.setBorder(BorderFactory.createEtchedBorder(1, Color.lightGray, Color.lightGray));
        add(crossPanel);
        

        newGame = new JButton("Nuevo juego");
        newGame.setBounds(20, 160, 130, 25);  /*El tamaño de los botones se ponen a mano porque tienen que coincidir todos en tamaño*/
        newGame.setFont(new Font("Tahoma", Font.PLAIN, 11));
        newGame.addActionListener(newGameListener);
        add(newGame);

        showChar = new JButton("Revelar letra");
        showChar.setBounds(20, 215, 130, 25);
        showChar.setFont(new Font("Tahoma", Font.PLAIN, 11));
        showChar.addActionListener(showCharacterListener);
        add(showChar);

        showWord = new JButton("Revelar palabra");
        showWord.setBounds(20, 250, 130, 25);
        showWord.setFont(new Font("Tahoma", Font.PLAIN, 11));
        showWord.addActionListener(showWordListener);
        add(showWord);

        verifyWord = new JButton("Verificar palabra");
        verifyWord.setBounds(20, 285, 130, 25);
        verifyWord.setFont(new Font("Tahoma", Font.PLAIN, 11));
        add(verifyWord);

        revealAll = new JButton("Solucionar juego");
        revealAll.setBounds(20, 320, 130, 25);
        revealAll.setFont(new Font("Tahoma", Font.PLAIN, 11));
        revealAll.addActionListener(showAllListener);
        add(revealAll);

        /*creacion y propiedades de la lista JList con las pistas horizontales.*/
        horizontalList = new JList();
        horizontalList.setBounds(35, 430, 420, 170);
        horizontalList.setBackground(Color.white);
        horizontalList.setBorder(BorderFactory.createEtchedBorder(1));
        add(horizontalList);

        /*creacion y propiedades de la lista JList con las pistas verticales.*/
        verticalList = new JList();
        verticalList.setBounds(490, 430, 420, 170);
        verticalList.setBackground(Color.white);
        verticalList.setBorder(BorderFactory.createEtchedBorder(1));
        add(verticalList);

    }

    final ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            horizontalList.setListData(main.getHorizontalClues(crosswordCategories.getSelectedIndex()));
            verticalList.setListData(main.getVerticalClues(crosswordCategories.getSelectedIndex()));
            crosswordCategories.hide();
           
        }
    };
    
     final ActionListener newGameListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            crosswordCategories.show();
            main.score = 100;
            userScore.setText(main.getScore(main.score));
        }
    };
    
    
    final ActionListener showCharacterListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            main.characterMinusScore();
            System.out.println(""+main.score);
            userScore.setText(main.getScore(main.score));
        }
    };
    
    final ActionListener showWordListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            main.wordMinusScore();
            System.out.println(""+main.score);
            userScore.setText(main.getScore(main.score));
        }
    };

    final ActionListener showAllListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            main.minusScore();
            System.out.println(""+main.score);
            userScore.setText(main.getScore(main.score));
        }
    };
}

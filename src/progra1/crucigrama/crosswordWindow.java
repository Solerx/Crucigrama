package progra1.crucigrama;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;

public class CrosswordWindow extends JFrame {
/*Creation of Objects*/
    
    JLabel player;
    JLabel horizontalText;
    JLabel verticalText;
    JLabel labelScore;
    JLabel userScore;
    JLabel userName;
    JComboBox crosswordCategories;
    JPanel crossPanel;
    JButton newGame;
    JButton revealAll;
    JButton showChar;
    JButton showWord;
    JButton verifyWord;
    JList horizontalList;
    JList verticalList;
    JLabel gridLetters;
    Container container;
    int category = 0;
    
    /*Window properties and adding objects to the window*/
    public CrosswordWindow() {
        super("Crucigrama");  


        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setSize(950, 650);
        Toolkit toolkit = getToolkit();
        Dimension centerCross = toolkit.getScreenSize();
        setLocation(centerCross.width / 2 - getWidth() / 2, centerCross.height / 2 - getHeight() / 2);

        player = new JLabel("Jugador:");
        Dimension sizePlayer = player.getPreferredSize();
        player.setBounds(15, 30, sizePlayer.width, sizePlayer.height); 

        add(player);

        
        userName = new JLabel(main.name);
        Dimension sizeUser = userName.getPreferredSize();
        userName.setBounds(70, 30, sizeUser.width, sizeUser.height);
        userName.setFont(new Font("Arial", Font.PLAIN, 12));
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

        final String categories[] = {"Animales", "Capitales del Mundo", "El Clima"};
        crosswordCategories = new JComboBox(categories);
        crosswordCategories.setSelectedIndex(-1);
        crosswordCategories.setBounds(20, 100, 150, 21); 

        crosswordCategories.setFont(new Font("Tahoma", Font.PLAIN, 11)); 

        crosswordCategories.setToolTipText("Seleccione una categoria");
        add(crosswordCategories);
        crosswordCategories.addActionListener(comboboxactionListener);

        
        crossPanel = new JPanel(new GridLayout(10, 10, 5, 5));
        crossPanel.setBounds(240, 40, 680, 360);
        crossPanel.setBackground(Color.white);

//        crossPanel.setLayout(new GridLayout(10, 10, 5, 5));
//        crossPanel.setBorder(BorderFactory.createEtchedBorder(1, Color.lightGray, Color.lightGray));
//        add(crossPanel);
        newGame = new JButton("Nuevo juego");
        newGame.setBounds(20, 160, 130, 25);  
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

        
        horizontalList = new JList();
        horizontalList.setBounds(35, 430, 420, 170);
        horizontalList.setBackground(Color.white);
        horizontalList.setBorder(BorderFactory.createEtchedBorder(1));
        add(horizontalList);

        
        verticalList = new JList();
        verticalList.setBounds(490, 430, 420, 170);
        verticalList.setBackground(Color.white);
        verticalList.setBorder(BorderFactory.createEtchedBorder(1));
        add(verticalList);

    }
    /*the painting of the matrix in to the JPanel*/
    public JPanel createMatrix(JPanel crosswordPanel) {

        JPanel crosswordMatrix[][] = new JPanel[10][10]; // declaracion de la matriz de paneles

        for (int i = 0; i < crosswordMatrix.length; i++) {
            for (int j = 0; j < crosswordMatrix[0].length; j++) {

                crosswordMatrix[i][j] = new JPanel();

                crosswordMatrix[i][j].setBackground(Color.black);
                crosswordMatrix[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                crosswordMatrix[i][j].add(gridLetters = getText(category, i, j));

                if (gridLetters.getText() == "") {

                    crosswordMatrix[i][j].setBackground(Color.black);
                    crosswordMatrix[i][j].enableInputMethods(true);

                } else {

                    crosswordMatrix[i][j].setBackground(Color.lightGray);
                    gridLetters.setText("");
                }

                crosswordPanel.add(crosswordMatrix[i][j]);
            }
        }

        return crosswordPanel;
    }

    /*Filling the matrix with the */
    public JPanel createFilledMatrix(JPanel crosswordPanel) {

        JPanel crosswordMatrix[][] = new JPanel[10][10]; // declaracion de la matriz de paneles

        for (int i = 0; i < crosswordMatrix.length; i++) {
            for (int j = 0; j < crosswordMatrix[0].length; j++) {

                crosswordMatrix[i][j] = new JPanel();

                crosswordMatrix[i][j].setBackground(Color.black);
                crosswordMatrix[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                crosswordMatrix[i][j].add(gridLetters = getText(category, i, j));

                if (gridLetters.getText() == "") {

                    crosswordMatrix[i][j].setBackground(Color.black);
                    crosswordMatrix[i][j].enableInputMethods(true);
                    crosswordMatrix[i][j].addMouseListener(mouseClick);
                    crosswordMatrix[i][j].addKeyListener(keyPress);
                    crosswordMatrix[i][j].addFocusListener(focusItem);

                } else {

                    crosswordMatrix[i][j].setBackground(Color.lightGray);

                }

                crosswordPanel.add(crosswordMatrix[i][j]);
            }
        }

        return crosswordPanel;
    }

    /*cross words with their respective coordenates*/
    public JLabel getText(int category, int i, int j) {

        JLabel jlabel = new JLabel();
        String crossword[][] = new String[10][10];

        switch (category) {

            case 0:

                crossword = new String[][]{{"", "", "", "", "", "", "", "", "", ""},
                {"", "C", "E", "R", "D", "O", "", "B", "", ""},
                {"", "U", "", "", "E", "", "G", "A", "T", "O"},
                {"", "L", "", "", "L", "", "", "L", "", ""},
                {"", "E", "", "", "F", "", "", "L", "", "I"},
                {"", "B", "", "T", "I", "G", "R", "E", "", "G"},
                {"", "R", "", "", "N", "", "", "N", "", "U"},
                {"", "A", "", "", "", "", "R", "A", "N", "A"},
                {"", "", "", "", "", "", "", "", "", "N"},
                {"", "", "", "", "", "", "", "", "", "A"}};
                jlabel = new JLabel(crossword[i][j]);
                jlabel.addMouseListener(mouseClick);
                jlabel.addKeyListener(keyPress);
                jlabel.addFocusListener(focusItem);

                break;

            case 1:

                crossword = new String[][]{{"", "", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "M", "", "", "", "", ""},
                {"", "", "", "T", "O", "K", "I", "O", "", ""},
                {"", "", "", "", "S", "", "", "", "", ""},
                {"", "", "", "", "C", "", "", "B", "", ""},
                {"", "", "H", "O", "U", "S", "T", "O", "N", ""},
                {"", "", "", "", "", "", "", "G", "", ""},
                {"", "", "", "S", "A", "N", "J", "O", "S", "E"},
                {"", "", "", "", "", "", "", "T", "", ""},
                {"", "", "", "", "L", "A", "P", "A", "Z", ""}};
                jlabel = new JLabel(crossword[i][j]);
                jlabel.addMouseListener(mouseClick);
                jlabel.addKeyListener(keyPress);
                jlabel.addFocusListener(focusItem);

                break;

            case 2:

                crossword = new String[][]{{"", "", "", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", "", "", "T"},
                {"", "", "", "", "V", "I", "E", "N", "T", "O"},
                {"", "", "", "", "", "", "", "U", "", "R"},
                {"", "", "", "F", "", "", "", "B", "", "N"},
                {"", "", "F", "R", "E", "N", "T", "E", "", "A"},
                {"", "", "", "I", "", "I", "", "S", "", "D"},
                {"", "", "", "O", "", "E", "", "", "", "O"},
                {"", "", "", "", "", "V", "", "", "", ""},
                {"", "", "", "", "S", "E", "C", "O", "", ""}};
                jlabel = new JLabel(crossword[i][j]);
                jlabel.addMouseListener(mouseClick);
                jlabel.addKeyListener(keyPress);
                jlabel.addFocusListener(focusItem);

                break;
        }

        return jlabel;
    }

    /*action listener that sets the Jlists with the clues*/
    final ActionListener comboboxactionListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            horizontalList.setListData(main.getHorizontalClues(crosswordCategories.getSelectedIndex()));
            verticalList.setListData(main.getVerticalClues(crosswordCategories.getSelectedIndex()));
            crosswordCategories.hide();

            /*El panel que va a contener el crucigrama en si*/
            category = crosswordCategories.getSelectedIndex();
            crossPanel.removeAll();
            add(createMatrix(crossPanel));

        }
    };

    /*ActionListener that handles creation of a new game, with the refresh method and the combobox activation*/
    final ActionListener newGameListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            
            crosswordCategories.show();
            crossPanel.removeAll();
            main.score = 100;
            userScore.setText(main.getScore(main.score));

        }
    };

    KeyListener keyPress = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    MouseListener mouseClick = new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(" hola ");
            setBackground(Color.yellow);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };

    FocusListener focusItem = new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {

            setBackground(Color.yellow);
        }

        @Override
        public void focusLost(FocusEvent e) {
            setBackground(Color.yellow);
        }
    };

    /*ActionListener that handles the character score button*/
    final ActionListener showCharacterListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            main.characterMinusScore();
            System.out.println("" + main.score);
            userScore.setText(main.getScore(main.score));
        }
    };

    /*ActionListener that handles the word score button*/
    final ActionListener showWordListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            main.wordMinusScore();
            System.out.println("" + main.score);
            userScore.setText(main.getScore(main.score));
        }
    };

    /*ActionListener that handles the revealing of the entire crossword*/
    final ActionListener showAllListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {
            category = crosswordCategories.getSelectedIndex();
            crossPanel.removeAll();
            add(createFilledMatrix(crossPanel));
            main.minusScore();
            System.out.println("" + main.score);
            userScore.setText(main.getScore(main.score));
        }
    };
}

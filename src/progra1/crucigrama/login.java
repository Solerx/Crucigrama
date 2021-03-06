package progra1.crucigrama;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Login extends JFrame{   
    
        
        JButton btnEnter;
        JLabel labelUserName;   
        JTextField inputUserName;
       
    /*Login window properties and the creation of objects*/    
    public Login(){ 
        
        super ("Ingreso");                                                                        
        setLayout(null);
        
        /*tamaño de la ventana y el centrado de la ventana. Si se pone el valor setSize en la clase main, que vendria siendo login.setSize();,
        no funciona bien con el paquete Toolkit y Dimension, que son los que centran la ventana*/
        setSize(300,190); 
        Toolkit toolkit = getToolkit();
        Dimension centerLogin = toolkit.getScreenSize();
        setLocation(centerLogin.width/2 - getWidth()/2, centerLogin.height/2 - getHeight()/2);
        
        labelUserName = new JLabel("Ingrese su nombre"); 
        Dimension sizeText = labelUserName.getPreferredSize();              /*propiedad de posicionamiento en la ventana*/
        labelUserName.setBounds(95, 30, sizeText.width, sizeText.height);   /*posicionamiento en la ventana horizontal y vertical*/
        add(labelUserName);                                                                             
        
        
        inputUserName = new JTextField(15);                             /*el número define el largo del textField*/
        Dimension sizeTextField = inputUserName.getPreferredSize();
        inputUserName.setBounds(65, 60, sizeTextField.width, sizeTextField.height);
        add(inputUserName);                                                                         
        inputUserName.setToolTipText("Es necesario su nombre para poder entrar");
        
        
        btnEnter = new JButton("Jugar!");
        Dimension sizeButton = btnEnter.getPreferredSize();
        btnEnter.setBounds(108, 100, sizeButton.width, sizeButton.height);
        add(btnEnter);   

        
    }
    
    }
    


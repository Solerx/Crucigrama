package progra1.crucigrama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class main {
    
    public static String name = "";
    
    public static void main(String[] args) {
        
        final login login = new login();                            /*se inicializa las ventana login y sus propiedades*/
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*cierra el programa al salirse de la ventana*/
        login.setVisible(true);
        login.setResizable(false);
        
        login.btnEnter.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            name = login.inputText.getText();
            new crosswordWindow().setVisible(true);
            login.dispose();
            }
        });
    
        
    }
    
    
}

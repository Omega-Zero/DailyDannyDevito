import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.applet.*;


public class DevitoGenerator extends JFrame implements ActionListener{
	// frame 
    static JFrame dannyFrame; 
  
    // main class 
    public static void main(String[] args) { 
 
    	// create a object, button image 
        DevitoGenerator dannyObj = new DevitoGenerator(); 
        JButton dannyButton = new JButton("Next Devito"); 
        ImageIcon image = new ImageIcon("C:\\Users\\Dell User\\eclipse-workspace\\DailyDannyDevito\\src\\classicDannyD.png");
        
    	// create a new frame, panel, label
        JFrame dannyFrame = new JFrame("Danny Window"); 
        JPanel dannyPanel = new JPanel(); 
        JLabel imageLabel = new JLabel(image); 
        
        // Jframe domain contraints 
        


        dannyFrame.setSize(800, 800); 
        dannyFrame.setVisible(true);    
        
        // add actionlistener to button 
        dannyButton.addActionListener(dannyObj); 
  
        // add commands
        dannyFrame.add(dannyButton); 
        dannyFrame.add(dannyPanel); 
        dannyFrame.add(imageLabel);
        imageLabel.setVisible(true);
        
        dannyPanel.setBounds(900, 500, 100, 100);
        dannyButton.setBounds(400, 100, 100, 50);
        
        dannyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } 
  
    
 
    // if button is pressed 
    public void actionPerformed(ActionEvent e) { 
    	
      } 


}

import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.applet.*;


public class DevitoGenerator extends JFrame implements ActionListener{
	// frame 
    static JFrame dannyFrame; 
  
    // main class 
    public static void main(String[] args) { 
 
    	// create a new frame 
        dannyFrame = new JFrame("Danny Window"); 
  
        // create a object 
        DevitoGenerator dannyObj = new DevitoGenerator(); 
  
        // create a panel 
        JPanel dannyPanel = new JPanel(); 
  
        JButton dannyButton = new JButton("Next Devito"); 
  
        // add actionlistener to button 
        dannyButton.addActionListener(dannyObj); 
  
        // add button to panel 
        dannyPanel.add(dannyButton); 
  
        dannyFrame.add(dannyPanel); 

        ImageIcon image = new ImageIcon("C:\\Users\\Dell User\\eclipse-workspace\\DailyDannyDevito\\src\\classicDannyD.png");
        JLabel imageLabel = new JLabel(image); 
        dannyFrame.add(imageLabel);
        imageLabel.setBounds(10, 10, 400, 400);
        imageLabel.setVisible(true);
        
  
        // set the size of frame 
        dannyFrame.setSize(400, 400); 
  
        dannyFrame.setVisible(true); 
        dannyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } 
  
    
 
    // if button is pressed 
    public void actionPerformed(ActionEvent e) { 
    	
      } 


}

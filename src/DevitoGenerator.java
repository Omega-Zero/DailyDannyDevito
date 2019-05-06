import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.applet.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class DevitoGenerator extends JFrame implements ActionListener{
 
    Timer dannyTimer = new Timer();
    
    static Random randomDannyNum = new Random();
    
    static ImageIcon[] dannyImageArray = {
    		new ImageIcon("C:\\Users\\Dell User\\eclipse-workspace\\DailyDannyDevito\\src\\classicDannyD.png"),
    		new ImageIcon("C:\\Users\\Dell User\\eclipse-workspace\\DailyDannyDevito\\src\\classicDannyD1.png"),
    		new ImageIcon("C:\\Users\\Dell User\\eclipse-workspace\\DailyDannyDevito\\src\\classicDannyD2.png"),
    };
    
    // main class 
    public static void main(String[] args) { 
 
    	
    	// create a object, button image 
        DevitoGenerator dannyObj = new DevitoGenerator(); 
        JButton dannyButton = new JButton("Next Devito"); 
        
        
    	// create a new frame, panel, label
        JFrame dannyFrame = new JFrame("Danny Window"); 
        JPanel dannyPanel = new JPanel(); 
        JLabel imageLabel = new JLabel(dannyImageArray[randomDannyNum.nextInt(dannyImageArray.length)]); 
        
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
        
//        Timer timer = new Timer(); 
//        TimerTask taskManager = new TaskManager(); 
//        timer.schedule(taskManager, 2000, 5000);
        
        dannyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    } 
//    
//    class TaskManager extends TimerTask { 
//        public int i = 0; 
//        public void run() 
//        { 
//            System.out.println("Timer ran " + ++i); 
//        } 
//    } 
  
  
    
 
    // if button is pressed 
    public void actionPerformed(ActionEvent e) { 
    	
      } 


}

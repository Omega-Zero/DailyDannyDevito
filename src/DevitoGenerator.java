import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class DevitoGenerator extends JFrame {
 
    private Timer dannyTimer = new Timer();
    
    private Random randomDannyNum = new Random();
    
    private  ImageIcon[] dannyImageArray = {
    		new ImageIcon("classicDannyD.png"),
    		new ImageIcon("classicDannyD1.png"),
    		new ImageIcon("classicDannyD2.png"),
    };
    
    // main class 
    public static void main(String[] args) { 
 
    	
    	// Create the DevitoGenerator, which is a new window
       new DevitoGenerator();
    } 
    
    
    public DevitoGenerator() {
    	super("Danny Window");
    	 JButton dannyButton = new JButton("Next Devito"); 
         
         
     	// create a new frame, panel, label
         JLabel imageLabel = new JLabel(dannyImageArray[randomDannyNum.nextInt(dannyImageArray.length)]); 
         
         // Jframe domain contraints 
         
         
          
   
         // add commands
         add(dannyButton, BorderLayout.SOUTH); 
         add(imageLabel, BorderLayout.CENTER);
        
         
         
//         Timer timer = new Timer(); 
//         TimerTask taskManager = new TaskManager(); 
//         timer.schedule(taskManager, 2000, 5000);
         
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         
         this.addWindowListener(new WindowAdapter() {
        	 
        	 public void windowClosing(WindowEvent e) {
        		 dannyTimer.cancel();
        		 dispose();        		 
        	 }
         });
         
         dannyButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e){
            	 
            	 imageLabel.setIcon(dannyImageArray[randomDannyNum.nextInt(dannyImageArray.length)]);
             }
         });
         
         setSize(800, 800); 
         setVisible(true);    
         
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


}

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Timer;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@SuppressWarnings("serial")
public class DevitoGenerator extends JFrame {
 
    private Timer dannyTimer = new Timer();
    
    private Random randomDannyNum = new Random();
    
    private  ImageIcon[] dannyImageArray = {
    		new ImageIcon("classicDannyD0.png"),
    		new ImageIcon("classicDannyD1.png"),
    		new ImageIcon("classicDannyD2.png"),
    		new ImageIcon("classicDannyD3.png"),
    		new ImageIcon("classicDannyD4.png"),
    		new ImageIcon("classicDannyD5.png"),
    		new ImageIcon("classicDannyD6.png"),
    		new ImageIcon("classicDannyD7.png"),
    		new ImageIcon("classicDannyD8.png"),
    		new ImageIcon("classicDannyD9.png"),
    		new ImageIcon("classicDannyD10.png"),
    		new ImageIcon("classicDannyD11.png"),
    		new ImageIcon("classicDannyD12.png"),
    		new ImageIcon("classicDannyD13.png"),
    		new ImageIcon("classicDannyD14.png")
    };
    
   List<Integer> alreadyDevitodArray = Arrays.asList();
    
    // main class 
    public static void main(String[] args) { 
 
    	// Create the DevitoGenerator, which is a new window
       new DevitoGenerator();
       
    } 
    
    
    
    public DevitoGenerator() {
    	super("Danny Window");
    	
    	 // button
    	 JButton dannyButton = new JButton("Next Devito"); 
    	 
     	 // create a new frame, panel, label
         JLabel imageLabel = new JLabel(dannyImageArray[randomDannyNum.nextInt(dannyImageArray.length)]); 
   
         // add commands
         add(dannyButton, BorderLayout.SOUTH); 
         add(imageLabel, BorderLayout.CENTER);
      
         
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         
         this.addWindowListener(new WindowAdapter() {
        	 
        	 public void windowClosing(WindowEvent e) {
        		 dannyTimer.cancel();
        		 dispose();        		 
        	 }
         });
         
         
         //button listener
         dannyButton.addActionListener(new ActionListener() {
         
        	 public void actionPerformed(ActionEvent e){
            	
            	 int randomDanny = randomDannyNum.nextInt(dannyImageArray.length);
            	 
            	 //If the random number is not in the array AKA hasn't been shown yet
            	 if (!alreadyDevitodArray.contains(randomDanny)) {
            		 
            		 //Display the image
            		 imageLabel.setIcon(dannyImageArray[randomDanny]);
            		 //Add that image to the array so it doesn't repeat.
            		 alreadyDevitodArray.add(randomDanny);
            		 
            		 
            	 }else {
            		 
            		  //Choose a new image index
            		  randomDanny = randomDannyNum.nextInt();
            		  //Call button listener again
            		  dannyButton.doClick();
            	 }
             }
         });
         
         super.setSize(800, 800); 
         setVisible(true);    
         
    }
  

}

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


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

	private List<ImageIcon> alreadyDisplayed = new ArrayList<ImageIcon>();
	private JLabel imageLabel;

	// main class 
	public static void main(String[] args) { 

		// Create the DevitoGenerator, which is a new window
		new DevitoGenerator();

	} 


	//Makes the window 
	public DevitoGenerator() {

		super("Danny Window");


		// button variable
		JButton dannyButton = new JButton("Next Devito"); 

		// create a JLabel, put in it to start a random index in the imageArray
		imageLabel = new JLabel(dannyImageArray[randomDannyNum.nextInt(dannyImageArray.length)]); 

		// add label and button to the frame(super)
		add(dannyButton, BorderLayout.SOUTH); 
		add(imageLabel, BorderLayout.CENTER);

		//stop program on close
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dannyTimer.cancel();
				dispose();        		 
			}
		});

		//button listener - what happens when button is clicked
		dannyButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e){
				updateImage();            	 
			}
		});



		super.setSize(800, 800); 
		setVisible(true); 
		

		//Set rate at which new devitos appear
		dannyTimer.scheduleAtFixedRate(new TimerTask() {

			//The timer task also updates the image
			@Override
			public void run() {
				updateImage();			
			}
			
			
		}, 2000, 5000);
	}

	public synchronized void updateImage() {
		
		//If the visited list is the same size, then all the images have already been visited, so we have to clear the list
		if (alreadyDisplayed.size() == dannyImageArray.length) 
			alreadyDisplayed.clear();

		ImageIcon randomDanny;

		//Search for unvisited image   		
		do
		{
			randomDanny = dannyImageArray[randomDannyNum.nextInt(dannyImageArray.length)];   			
		} while (alreadyDisplayed.contains(randomDanny));

		//add selected image
		alreadyDisplayed.add(randomDanny);
		imageLabel.setIcon(randomDanny);
	}
}

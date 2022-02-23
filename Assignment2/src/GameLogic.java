import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*; 

public class GameLogic implements ActionListener {

 // ADD YOUR INSTANCE VARIABLES HERE
    private GameState gs;
    private GameUserInterface gui;


    public GameLogic(int size) { //The parameter size is the size of the board on which the game will be played
		this.gs= new GameState(size);
        this.gui = new GameUserInterface(gs,this);
	// It creates the game's userInterface and the game's state instances
    }

  
    /**
     * Starts the game
     */
    public void start(){
		
    }

 
    /**
     * resets the game
     */
    public void reset(){
	
    }


    public void actionPerformed(ActionEvent e) {
		//the logic of the game goes in this method        
		// YOUR CODE HERE
		if(e.getActionCommand().equals("Quit")){
			System.exit(0);
			
		}
		System.out.print(e.getActionCommand());
    }

 
}


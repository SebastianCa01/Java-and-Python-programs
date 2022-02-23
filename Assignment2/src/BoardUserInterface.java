import javax.swing.*;
import java.awt.*;

public class BoardUserInterface extends JPanel {

	private GameState gameState;
    private GameLogic gameLogic;
	private Cube[] cubes;
    private int row;

    public BoardUserInterface(GameState gameState, GameLogic gameLogic,int row) {
		
		this.gameState=gameState;
        this.gameLogic=gameLogic;
		this.row=row;
		FlowLayout fl= new FlowLayout(FlowLayout.LEFT);
		setLayout(fl);
		cubes = new Cube[gameState.getSize()];
		for(int c=0;c<gameState.getSize();c++){
			cubes[c]= new Cube(row,c,gameState.getCurrentStatus(row,c));
			//cubes[c].setBorder(new EmptyBorder(0,0,0,0));;
			cubes[c].addActionListener(gameLogic);
			add(new Cube(row,c,gameState.getCurrentStatus(row,c)));
		}
		
		//for(int r=0;r<state.getSize();r++){
			 
			//for(int c=0;c<state.getSize();c++){
				
			//}
		//}
    }



    //updates the status of the board's cubes instances following the game state
	//calls setType() from the class Cube, as needed.
    public void update(){
		for(int c=0;c<gameState.getSize();c++){
			cubes[c].setType(gameState.getCurrentStatus(row,c));
		}

        }

}

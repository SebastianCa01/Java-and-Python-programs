import javax.swing.*;
import java.awt.*;

 /*the class GameUserInterface provides the user interface of the Game. It extends
 JFrame and lays out an instance of BoardUserInterface and  two instances of JButton: one to reset and the second the quit the game at any time.*/

public class GameUserInterface extends JFrame {

	private JButton reset;
	private JButton quit;
	private BoardUserInterface[] rows;
	//ALL PRIVATE
 
    /* Constructor 
	 * initializes the board
     * takes as parameters the state of the game and the gameLogic */

    public GameUserInterface(GameState state, GameLogic gameLogic) {
		super("mousegame");
		setSize(500,500);
		setLayout(null);
		rows = new BoardUserInterface[state.getSize()];
		for(int r=0;r<state.getSize();r++){
			rows[r]=new BoardUserInterface(state,gameLogic,r);
			if(r%2==0){
				rows[r].setBounds(0,60*r,100*state.getSize(),60);
			}else{
				rows[r].setBounds(30,60*r,100*state.getSize(),60);
			}
			add(rows[r]);
		}
		
		reset = new JButton("Reset");
		reset.setBounds(150,400,80,25);
		reset.addActionListener(gameLogic);
		add(reset);
		quit = new JButton("Quit");
		quit.setBounds(250,400,60,25);
		quit.addActionListener(gameLogic);
		add(quit);
		
		
		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


	public JButton getReset(){
		return this.reset;
	}
	public JButton getQuit(){
		return this.quit;
	}
    public BoardUserInterface[] getBoardUserInterface(){
		return rows;
   }

}

import javax.swing.JButton;
import javax.swing.ImageIcon;


/********************************************************************
 * The Cube is a type of JButton that represents a cube in the game 
*********************************************************************/

public class Cube extends JButton {

    private int row;
	private int column;
	private int type;

    /**
     * Constructor*/

    public Cube(int row, int column, int type) {
		super();
		this.row=row;
		this.column=column;
		setType(type);
    }


     //Sets the type of a square. 
	 //sets the icon of the square.
	
    public void setType(int type) {
		this.type=type;
		if(this.type==GameState.FREE_CUBE){
			ImageIcon icons = new ImageIcon("icons\\icons\\square-0.png");
			this.setIcon(icons);
		}else if(this.type==GameState.SELECTED){
		ImageIcon icons = new ImageIcon("icons\\icons\\square-1.png");
		this.setIcon(icons);
		}else if(this.type==GameState.RED_CUBE){
		ImageIcon icons = new ImageIcon("icons\\icons\\square-2.png");
		this.setIcon(icons);
	}
	}

 
    // Getter method for the attribute row.
    public int getRow() {
		return row;
    }

    //Getter method for the attribute column.
    public int getColumn() {
		return column;
    }
}

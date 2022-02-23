import java.util.Random;

public class GameState {

		//static final variables public
		public static final int FREE_CUBE = 0;
		public static final int SELECTED = 1;
		public static final int RED_CUBE = 2;
		public static final int MAX_SELECTED = 5;
		
		//non-final variables private
		private int boardSize;
		private Point redCube;
        
        private int[][] board;	
    /**
     * Constructor 
	 * initializes the state to the size of board
     *  The parameter size is the size of the board
     */
    public GameState(int size) {
        // set all cubes on board to free, some to selected, and place red cube  
	    int select = 0;
        Random ran = new Random();
		boardSize = size;
        board = new int[size][size];
        for(int r=0;r<boardSize;r++){
        	for(int c=0;c<boardSize;c++){
              	int upperbound = 10; 
                int ranint = ran.nextInt(upperbound);
              	if(ranint==0 && select<MAX_SELECTED){
					board[r][c]= SELECTED;
                  	select++;
                }else{
                	board[r][c]= FREE_CUBE;
                }
                
            }
          
        }
      
      	int topleft = size/2 - 1;
      	int b = 3;
      	if(size%2==0){
        	b = 2; 
        }
     
      	int rowadd = ran.nextInt(b);
        int coladd = ran.nextInt(b);
        board[topleft + rowadd][topleft + coladd] = RED_CUBE;
      	
    }
	//
   	public int getSize(){
	    
		return boardSize;
   	}
    /**
     * returns the current status (FREE_CUBE, SELECTED or RED_CUBE) of a given cube in the game
     * 
     * i is the x coordinate of the cube
     * j is the y coordinate of the cube
     * return the status of the cube at location (i,j)
     */   
    public int getCurrentStatus(int i, int j){
		return board[i][j];
    }
    /**
     * Sets the status of the cube at coordinate (i,j) to SELECTED
     * i is the x coordinate of the cube
     * j is the y coordinate of the cube
     */   
    public void select(int i, int j){
    	
		board[i][j] = SELECTED;
    }
    /**
     * Puts the red cube at coordinate (i,j). Clears the previous location 
     * of the red cube.
     *
      * i is the x coordinate of the cube
     * j is the y coordinate of the cube
     */   
    public void setCube(int i, int j){
        board[redCube.getX()][redCube.getY()] = FREE_CUBE;
		redCube.reset(i,j);
        board[i][j]=RED_CUBE;

   }
    /* Getter method for the current red cube
     * return the location of the curent red cube */   
    public Point getCurrentCube(){
		return redCube;
    }
    
   
    
    /*
    
    private boolean isNeigbourofSnake(int i, int j)
    {
    	// first row
    	if((i==0) && (j== 0))
    	{
    	   for(i==)	
    	}
    	
    	return false;
    }*/
    
    
    }


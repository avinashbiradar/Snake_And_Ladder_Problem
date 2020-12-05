package com.SnakeAndLadder.java;

import java.util.Random;

public class SnakeAndLadder
{
	//uc1 variables initialized at starting positions
	static  int STARTINGPOSITION=0;
	
	
	static  int PLAYER=1;
	static Random random= new Random();
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
   
    //uc2 rolling a random value to the player
    public int diceRoll(){
	int dice = (random.nextInt(6)+1);
	System.out.println("number generated " +dice);
	return dice;
    }
    
    public void gamePlay() {
    	int playerPosition=STARTINGPOSITION;
    	System.out.println("current player position:"+playerPosition); 
    	int dice=diceRoll();
    	int action = random.nextInt(3);
    	System.out.println("action Invoked:"+action); 
		switch(action)
		{
			case LADDER:
				 playerPosition = playerPosition + dice;
				 System.out.println("current player position:"+playerPosition); 
			     break;
			case SNAKE:
				playerPosition = playerPosition - dice;
				System.out.println("current player position:"+playerPosition); 
			    break;
			case NOPLAY:
				playerPosition = playerPosition;
				System.out.println("current player position"+playerPosition);
				break;
		}
		
    	
    }

    public static void main(String[]args){
	 SnakeAndLadder snakeAndLadder=new SnakeAndLadder();
	 snakeAndLadder.gamePlay();
	 }
  
}


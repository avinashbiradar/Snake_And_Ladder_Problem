package com.SnakeAndLadder.java;

import java.util.Random;

public class SnakeAndLadder
{
	//uc1 variables initialized at starting positions
	static final int STARTINGPOSITION=0;
	static final int PLAYER=1;
	static Random RANDOM = new Random();
   
//uc2 rolling a random value to the player
public void diceRoll()
{
	int DICE = (RANDOM.nextInt(6)+1);
	System.out.println("number generated " +DICE);
}
public static void main(String[]args)
{
	 SnakeAndLadder s=new SnakeAndLadder();
	 s.diceRoll();
}
}


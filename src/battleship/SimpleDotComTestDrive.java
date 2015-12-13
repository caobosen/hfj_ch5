package battleship;

public class SimpleDotComTestDrive {
	
	//Declare an int variable to hold the number of user guess, named numOfGuess, set it to 0
	//Make a new SimpleDotCom instance
	//Compute a random number between 0 and 4
	//Make a array with 3 ints using the randomly-generated number. that number incremented by 1 and another number incremented by 2
	//Invoke the setLocationCells() method from the simpleDotCom instance
	//Declare a boolean variable representing the state of game, named isAlive, SET it to ture
	//While the dot com is still alive (isAlive == true)
	// Get user input from the command line
	// check the user guess
	// Invoke the checkyourself() method on the SimpleDotCOM instance
	// Increment numOfGuess
	//check for dotcom state 
	//if result is "Kill"
	//     set isAlive to false
	//	   print numOfGuess
	// endif
	// endWhile
	//endmethod

	public static void main(String[] args) {
		int numOfGuess=0;
		
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNum = (int)(Math.random()*5);
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive == true){
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuess++;
			
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuess + "guesses");
			}
			
		}
		

		//int[] locations = { 2, 3, 4 };

//		dot.setLocationCells(locations);
//
//		String userGuess = "2";
//
//		String result = dot.checkYourself(userGuess);

//		String testResult = "failed";
//
//		if (result.equals("hit")) {
//			testResult = "passed";
//		}
//
//		System.out.println(testResult);
	}

}

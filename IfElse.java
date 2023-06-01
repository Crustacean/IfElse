public class IfElse{
	
	
	public static void ScoreCalculator(int score, int levelCompleted, int bonus){
		
		boolean gameOver = true;
		
		int finalScore = score;
		
		if(gameOver){
			finalScore += (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
	}
	
	public static void main(String[] args){
		
		ScoreCalculator(10000, 8, 200);
		ScoreCalculator(1000, 5, 100);
		
	}
	
}
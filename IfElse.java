public class IfElse{
	
	
	public static int ScoreCalculator(int score, int levelCompleted, int bonus){
		
		boolean gameOver = true;
		
		int finalScore = score;
		
		if(gameOver){
			finalScore += (levelCompleted * bonus);
		}
		
		return finalScore;
		
	}
	
	public static void main(String[] args){
		
		int highScore = ScoreCalculator(10000, 8, 200);
		System.out.println("Your final score was " + highScore);
		System.out.println("Your other final score was " + ScoreCalculator(1000, 5, 100));
		
	}
	
}
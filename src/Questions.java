import java.util.Scanner;
public class Questions {

	public static void introduce()
	{
		System.out.println("Hello, and welcome to your personalized inheritance quizzer. What is your name?");
		Scanner userName = new Scanner (System.in);
		String name = userName.nextLine();
		System.out.println("Good day " + name +"! Let's begin your quiz");
	}
	public static void runQuestions()
	{
		int score = 0;
		int number = 0;
		System.out.println("For the purposes of this quiz, the following characters will represent the transition to a new line: {}{}{}{}{}{}{}");
		for (int i = 0; i<20; i++)
		{
			System.out.println("Question " + (i+1) + ":");
			System.out.println(Answer.getQuizzer().get(i).getQuestion());
			System.out.println("If this code will work, enter 1. If it will not work, enter 2");
			Scanner userInput = new Scanner (System.in);
			int answer = userInput.nextInt();
			number++;
			if (answer == Answer.Quizzer.get(i).getResponse())
			{
				score++;
				System.out.println("Good work! You answered correctly. Your score now is " + score + " out of " + number + ".");
			}
			else
			{
				System.out.println("That is incorrect. Your score now is " + score + " out of " + number + ".");
			}
			System.out.println();
		}
	}
}

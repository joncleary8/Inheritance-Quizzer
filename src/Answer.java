 import java.util.ArrayList;
public class Answer
	{
		public String question;
		public int response;
		public static ArrayList<Answer>Quizzer=new ArrayList<Answer>();
		public Answer(String q, int r)
			{
				question=q;
				response=r;
			}
		public static void Questions()
			{
				
				Quizzer.add(new Answer("Bird b = new Animal(); {}{}{}{}{}{}{} b.bearsYoung();",2));
				Quizzer.add(new Answer("Animal a = new Bird(); {}{}{}{}{}{}{} a.findsShiny();",2));
				Quizzer.add(new Answer("Animal a = new Animal();",1));
				Quizzer.add(new Answer("Animal a = new Animal(); {}{}{}{}{}{}{} a.bearsYoung();",1));
				Quizzer.add(new Answer("Animal a = new Bird();",1));
				Quizzer.add(new Answer("Animal a = new Bird(); {}{}{}{}{}{}{} a.eatsFood();",1));
				Quizzer.add(new Answer("Animal a = new Animal(); {}{}{}{}{}{}{} a.cleansClaws();",2));
				Quizzer.add(new Answer("Animal a = new Bird(); {}{}{}{}{}{}{} a.bearsYoung();",1));
				Quizzer.add(new Answer("Bird b = new Animal(); {}{}{}{}{}{}{} b.cleansClaws();",2));
				Quizzer.add(new Answer("Bird b = new Animal(); {}{}{}{}{}{}{} b.findsShiny();",2));
				Quizzer.add(new Answer("Bird b = new Bird(); {}{}{}{}{}{}{} b.findsShiny();",1));
				Quizzer.add(new Answer("Animal a = new Animal(); {}{}{}{}{}{}{} a.eatsFood();",1));
				Quizzer.add(new Answer("Bird b = new Bird(); {}{}{}{}{}{}{} b.cleansClaws();",1));
				Quizzer.add(new Answer("Bird b = new Animal(); {}{}{}{}{}{}{} b.eatsFood();",2));
				Quizzer.add(new Answer("Bird b = new Animal();",2));
				Quizzer.add(new Answer("Bird b = new Bird();",1));
				Quizzer.add(new Answer("Animal a = new Bird(); {}{}{}{}{}{}{} a.cleansClaws();",2));
				Quizzer.add(new Answer("Animal a = new Animal(); {}{}{}{}{}{}{} a.findsShiny();",2));
				Quizzer.add(new Answer("Bird b = new Bird(); {}{}{}{}{}{}{} b.bearsYoung();",1));
				Quizzer.add(new Answer("Bird b = new Bird(); {}{}{}{}{}{}{} b.eatsFood();",1));
				
			}
		public int getResponse() {
			return response;
		}
		public void setResponse(int response) {
			this.response = response;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public static ArrayList<Answer> getQuizzer() {
			return Quizzer;
		}
		public static void setQuizzer(ArrayList<Answer> quizzer) {
			Quizzer = quizzer;
		}
		
	}

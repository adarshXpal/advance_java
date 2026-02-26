package Quiz;
import java.util.Scanner;

public class QuestionService {
   Question[] questions=new Question[5];
   String[] answers=new String[5];

   public QuestionService(){
    setQuestions();
   }
   private void setQuestions(){
    // Question 1
    String[] opt1 = {"Adarsh", "Vijay", "Neelam", "Utkarsh"};
    this.questions[0] = new Question(1, "What is your name ?", opt1, "Adarsh");
    
    // Question 2
    String[] opt2 = {"Mumbai", "Delhi", "Kolkata", "Chennai"};
    this.questions[1] = new Question(2, "What is the capital of India?", opt2, "Delhi");
    
    // Question 3
    String[] opt3 = {"Python", "Java", "C++", "JavaScript"};
    this.questions[2] = new Question(3, "Which programming language is this?", opt3, "Java");
    
    // Question 4
    String[] opt4 = {"3", "4", "5", "6"};
    this.questions[3] = new Question(4, "What is 2 + 2?", opt4, "4");
    
    // Question 5
    String[] opt5 = {"Earth", "Mars", "Jupiter", "Saturn"};
    this.questions[4] = new Question(5, "Which is the largest planet in our solar system?", opt5, "Jupiter");
   }

   public void printScore(){
    int score=0;
    for(int i=0;i<questions.length;i++){
        if(questions[i].getAnswer().equals(answers[i].trim())){
            ++score;
        }
    }
    System.out.println("Your score is: "+score);
   }

   public void playQuiz(){
    int i=0;
    Scanner sc=new Scanner(System.in);
        for(Question q:questions){
            System.out.println("Question No. : "+q.getId());
            System.out.println(q.getQuestion());
            for(String s:q.getOptions()){
                System.out.println(s);
            }
            System.err.println("Enter Your Answer: ");
           answers[i++]= sc.nextLine();
        }
        sc.close();
        for(String str:answers){
            System.out.print(str+" ");
        }
        System.out.println();
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kidslanguagelearning_project;

import kidslanguagelearning_project.KidsLanguageLearning_Project.QuizView.BeginnerScoring.QuizController;
import kidslanguagelearning_project.KidsLanguageLearning_Project.QuizView.ScoringStrategy;

/**
 *
 * @author A
 */
public class KidsLanguageLearning_Project {

    

/**
 *
 * @author A
 */
public class Quiz {
    private final int quizID;
    private double score;
       
    
    public Quiz(int quizID) {
        this.quizID = quizID;
        this.score = 0.0;
    }
    
    
    public int getQuizID() { return quizID; }
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
       }
      
public class QuizView
  {
    public void displayResult(Quiz quiz) {
        System.out.println("--- Interactive Quiz Result ---");
        System.out.println("Quiz ID: " + quiz.getQuizID());
        System.out.println("Final Score: " + quiz.getScore() + "%");
        System.out.println("Well done! Keep learning...");
    }

     public interface ScoringStrategy 
     {
    
    double calculate(int correctAnswers, int totalQuestions);
     }
  
  public class BeginnerScoring implements ScoringStrategy {

    @Override
    public double calculate(int correctAnswers, int totalQuestions) {
        
        if (totalQuestions == 0) return 0;
        return (correctAnswers / (double) totalQuestions) * 100;
    }
    public class QuizController {
    private final Quiz model;
    private final ScoringStrategy strategy;

    public QuizController(Quiz model, ScoringStrategy strategy)
    {
        this.model = model;
        this.strategy = strategy;
    }

    public void processResult(int correct, int total)
    {
        double finalScore = strategy.calculate(correct, total);
        model.setScore(finalScore);
    }
    
    }
    }
   





}
}

    
    
    
  
    
    

    
    
 
    




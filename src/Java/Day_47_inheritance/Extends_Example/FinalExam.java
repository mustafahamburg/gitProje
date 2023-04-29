package Java.Day_47_inheritance.Extends_Example;

public class FinalExam extends GeradeActivity{
    private int questionNumber;
    private double pointQuestion;
    private int numberMiss;
    public FinalExam(int questionNumber,int numberMiss){
        double numericScore;

        this.questionNumber=questionNumber;
        this.numberMiss=numberMiss;

        pointQuestion=100.0/questionNumber;
        numericScore=pointQuestion*(questionNumber-numberMiss);

        setScore(numericScore); // burada bu set methodun oldugu class i extends ettik
                                // ve ona deger atayip score degerini belirledik
    }
}

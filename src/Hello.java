public class Hello {

    public static void main(String args[]){
        System.out.println("Hello World!!");
        int highScore = 50;
        double kilometers = (100 * 1.69);
        if(highScore==50){
            System.out.println("Wow bro impressed!");
        }
        //calculateScore();

    }

    public static void calculateScore(){
        System.out.println("This is from the calculateScore method");
    }

    public static void displayHighScorePosition(String name, int pos){
        System.out.println(name + " player has scored" + pos + " position");

    }

    public static int calculateHighScorePosition(int score){
        if(score>1000){
            return 1;
        }
        else if(score>500 && score<1000){
            return 2;
        }
        else if(score>100 && score<500){
            return 3;
        }
        else return 4;
    }
}

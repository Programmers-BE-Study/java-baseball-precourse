package Application.baseball_ver3;

import camp.nextstep.edu.missionutils.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Generator genIns = Generator.getInstance();
        ScoreCounter scoreIns = ScoreCounter.getInstance();
        Views view = new Views();
        int restart =1;
        while(restart == 1){
            genIns.setAnsComList();
            genIns.setAnsCom();
            System.out.println(genIns.getAnsCom());
            int ansUser = view.mainView();

            scoreIns.checkScore(genIns.getAnsComList(),ansUser);
            if(scoreIns.getScores(0) == 0 && scoreIns.getScores(1) == 0){
                System.out.println("낫싱");
            } else if(scoreIns.getScores(0) == 3  ){
              restart = view.restartView();
            } else if(scoreIns.getScores(0) == 0){
                System.out.println(scoreIns.getScores(1) + "스트라이크");
            }else if(scoreIns.getScores(1) == 0){
                System.out.println(scoreIns.getScores(0) + "볼");
            }else{
                System.out.println(scoreIns.getScores(0) + "볼" + " " +scoreIns.getScores(1) + "스트라이크");
            }
            if(restart == 1 ){
                genIns.clearAnsComList();
            }else{
                sc.close();
            }
        }


    }
}

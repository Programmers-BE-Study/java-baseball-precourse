package Application.baseball_ver3;

import java.util.ArrayList;
import java.util.List;

public class CheckScore {
    private static CheckScore instance = CheckScore.getInstance();

    private int []score = new int[2];
    private List<Integer> ansUserList = new ArrayList<>();

    private CheckScore() {}

    public static CheckScore getInstance() {return instance;}

    public void setScore(int index, int n){
        score[index] = n;
    }
    public int getScore(int index){
        return score[index];
    }
    public void clearScore(){
        score = new int[2];
    }
    public void printScore(){
        System.out.println(getScore(0) +"볼"+ " " + getScore(1) + "스트라이크");
    }
    public static int listToInt(List<Integer> list){
        // List -> int
        int temp = 0;
        temp = list.get(0) * 100 + list.get(1) * 10 + list.get(2);
        return temp;
    }

    public void setAnsUserList(int num){
        this.ansUserList.add(num);
    }

    public List<Integer> getAnsUserList(){
        return ansUserList;
    }

    public static List<Integer> intToList(int num){
        //int -> List
        int temp = num % 100;
        //ansUserList.add(num / 100);
        instance.setAnsUserList(num/100);
        //ansUserList.add(temp / 10);
        instance.setAnsUserList(temp/10);
        temp = num % 10;
        instance.setAnsUserList(temp);
        return instance.getAnsUserList();
    }

    /*public boolean checkAns(int ansCom, int ansUser){
        boolean check = false;
        if(ansCom == ansUser){
            check = true;
        }
        return check;
    }*/

    public void checkBall(List<Integer> ansComList, int ansUser){
        int ballCnt = 0;
        int strikeCnt = 0;
        List<Integer> ansUserList = intToList(ansUser);
        for(int i = 0; i < 3; i++){
            if(ansComList.get(i).equals(ansUserList.get(i))){
                ballCnt++;
                System.out.println("ballCnt: " + ballCnt);
            }
            if(!ansComList.get(i).equals(ansUserList.get(i))){
                strikeCnt = checkStrike(ansComList, ansUserList, strikeCnt,i);
            }
        }
        setScore(0,ballCnt);
        setScore(1,strikeCnt);
    }

    private static int checkStrike(List<Integer> ansComList, List<Integer> ansUserList, int strikeCnt, int i ) {
        for(int j = 0; j < 3; j++){
            if(j != i && ansComList.get(i).equals(ansUserList.get(j))){
                strikeCnt++;
                System.out.println("StrikeCnt: " + strikeCnt);
            }
        }
        return strikeCnt;
    }


}

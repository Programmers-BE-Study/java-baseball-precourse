package Application.baseball_ver3;

import java.util.ArrayList;
import java.util.List;

public class ScoreCounter {
    private static int [] scores = new int[2];
    private static ScoreCounter scoureInstance;

    private ScoreCounter(){}
    public static ScoreCounter getInstance() {
        if (scoureInstance == null) {
            scoureInstance = new ScoreCounter();
        }
        return scoureInstance;
    }


    //getter
    public int getScores(int index) {
        return scores[index];
    }

    //setter
    private static void setScores(int index, int num) {
        scores[index] = num;
    }

    //check
    public void checkScore(List<Integer> ansComList, int ansUser){
        int ballCnt = 0;
        int strikeCnt = 0;
        List<Integer> ansUserList = intToList(ansUser);

        for(int i = 0; i < 3; i++){
            if(ansComList.get(i).equals(ansUserList.get(i))){
                ballCnt++;
            } else{
                strikeCnt = checkStrike(ansComList,ansUserList,strikeCnt,i);
            }
        }
        setScores(0,ballCnt);
        setScores(1,strikeCnt);
    }

    private static int checkStrike(List<Integer> ansComList, List<Integer> ansUserList, int strikeCnt, int index){
        for(int j = 0; j < 3; j++){
            if(j != index && ansComList.get(index).equals(ansUserList.get(j))){
                strikeCnt++;
            }
        }
        return strikeCnt;
    }

    //check 보조
    static List<Integer> intToList(int num){
        List<Integer> list = new ArrayList<Integer>();
        int temp = num % 100;
        list.add(num / 100);
        list.add(temp / 10);
        temp = num % 10;
        list.add(temp);
        return list;
    }
}

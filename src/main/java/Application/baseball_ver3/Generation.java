package Application.baseball_ver3;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Generation {
    private List<Integer> ansLogs = new ArrayList<>();
    private List<Integer> ansComList = new ArrayList<>();
    private int ansCom;

    private Generation() {}
    private static Generation instance = new Generation();
    public static Generation getInstance() {
        return instance;
    }
    public List<Integer> getAnsLogs() {return ansLogs;}
    public void clearAnsLogs() {this.ansLogs.clear();}

    public void setAnsCom(){instance.ansCom = listToInt(getAnsComList());}
    public int getAnsCom(){return ansCom; }

    public static int getAnsLog(int n) {
        return instance.ansLogs.get(n);
    }
    public void setAnsLog(int ansLog) {
        this.ansLogs.add(ansLog);
    }
    public int reroll(int start, int end){
        return Randoms.pickNumberInRange(start, end);
    }
    public int ansLogsSize(){
        return this.ansLogs.size();
    }

    public List<Integer> getAnsComList() {return ansComList;}
    public void setAnsComList(int num) {this.ansComList.add(num);}
    public void clearAnsComList(){this.ansComList.clear();}

    public static boolean logCheck(int num){
        for(int i = 0; i < instance.ansLogsSize(); i++){
            if(getAnsLog(i) == num){
                return false;
            }
        }
        return true;
    }

    public void genAnsComList() {
        //랜덤한 3자리 수 정답 생성 중복 X
        //100의 자리수 저장
        int rand = Randoms.pickNumberInRange(1,9);
        instance.setAnsLog(rand);
        instance.setAnsComList(rand);

        //10자리수 저장
        for(int i = 0; i < 2; i++){
            rand = Randoms.pickNumberInRange(0,9);
            if(logCheck(rand)){
                instance.setAnsLog(rand);
                instance.setAnsComList(rand);
            }
        }
        //instance.setAnsCom();
    }
    public static int listToInt(List<Integer> list){
        // List -> int
        int temp = 0;
        temp = list.get(0) * 100 + list.get(1) * 10 + list.get(2);
        return temp;
    }
}

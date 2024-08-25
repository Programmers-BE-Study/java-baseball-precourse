package Application.baseball_ver3;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private static List<Integer> ansComList = new ArrayList<>();
    private static List<Integer> randLogs = new ArrayList<>();
    private static int ansCom;

    //싱글톤..해야될거 같은 느낌
    private static Generator genInstace;
    private Generator() {}
    public static Generator getInstance() {
        if (genInstace == null) {
            genInstace = new Generator();
        }
        return genInstace;
    }

    //setter
    public void setAnsComList() {
        clearAnsLogs(); // 새로 생성할 때 대비 로그 클리어
        int rand = Randoms.pickNumberInRange(1,9);
        randLogs.add(rand);
        ansComList.add(rand);

        while(ansComList.size() < 3){
            rand = Randoms.pickNumberInRange(0,9);
            if(logCheck(rand)){
                randLogs.add(rand);
                ansComList.add(rand);
            }
        }
    }
    public void setAnsCom(){
        ansCom = (ansComList.get(0) * 100) + (ansComList.get(1) * 10) + ansComList.get(2);
    }

    // getter
    public List<Integer> getAnsComList() { return ansComList; }
    public int getAnsCom() { return ansCom; }

    //clear
    private void clearAnsLogs(){ randLogs.clear();}
    public void clearAnsComList(){ansComList.clear();}

    //setter 서포트
    private static boolean logCheck(int rand){
        //램덤한 수 생성시 중복 체크
        for(int i = 0; i< randLogs.size(); i++){
            if(randLogs.get(i) == rand){
                return false;
            }
        }
        return true;
    }



}//class

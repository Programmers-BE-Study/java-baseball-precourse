package baseball_ver1;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 함수로 빼기
    //depth 2 이하
    // 추가 작업해야 될 것 : 3 자리 중복 제거 , 정답 맞춘 후 다시 시작
    static Scanner sc = new Scanner(System.in);
    public static List<Integer> generateAnsCom(){
        //랜덤한 3자리 수 정답 생성 중복 가능
        List<Integer> ansComList = new ArrayList<>();
        ansComList.add(Randoms.pickNumberInRange(1,9));
        for(int i = 0; i < 2; i++){
            ansComList.add(Randoms.pickNumberInRange(0,9));
        }
        return ansComList;
    }

    public static int listToInt(List<Integer> list){
        // List -> int
        int temp = 0;
        temp = list.get(0) * 100 + list.get(1) * 10 + list.get(2);
        return temp;
    }

    public static List<Integer> intToList(int num){
        List<Integer> ansList = new ArrayList<>();
        int temp = num % 100;
        ansList.add(num / 100);
        ansList.add(num / 10);
        temp = num % 10;
        ansList.add(temp);
        return ansList;
    }

    public static void mainView(){
        List<Integer> ansComList = generateAnsCom();
        int ansCom = listToInt(ansComList);
        System.out.println("답" + ansCom);
        int [] score = new int[2];
        while (true){
            System.out.println("숫자를 입력해주세요 :");
            int ansUser = sc.nextInt();
            List<Integer> ansUserList = intToList(ansUser);

            if(checkAns(ansCom,ansUser)) break;
            score = checkBall(ansComList,ansUserList);
            System.out.println(score[0] + "볼, " + score[1] +"스트라이크");
        }

    }

    public static boolean checkAns(int ansCom, int ansUser){
        boolean check = false;
        if(ansCom == ansUser){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            check = true;
        }
        return check;
    }
    public static int[] checkBall(List<Integer> ansComList, List<Integer> ansUserList){
        int score[] = new int[2];
        int ballCnt = 0;
        int strikeCnt = 0;
        for(int i = 0; i < 3; i++){
            if(ansComList.get(i).equals(ansUserList.get(i))){
                ballCnt++;
            }
            else{
                strikeCnt += checkStrike(ansComList, ansUserList, strikeCnt,i);
            }
        }
        score[0] = ballCnt;
        score[1] = strikeCnt;
        return score;
    }

    //스트라이크가 제대로 안됨..
    private static int checkStrike(List<Integer> ansComList, List<Integer> ansUserList, int strikeCnt, int i ) {
        for(int j = 0; j < 3; j++){
            if(j != i && ansComList.get(i).equals(ansUserList.get(j))){
                strikeCnt++;
            }
        }
        return strikeCnt;
    }

    public static void main(String[] args) {
        mainView();
    }
}

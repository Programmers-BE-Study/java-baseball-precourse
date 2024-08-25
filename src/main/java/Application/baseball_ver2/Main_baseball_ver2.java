package Application.baseball_ver2;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_baseball_ver2 {
    static List<Integer> ansComList = new ArrayList<>();
    static List<Integer> randLogs = new ArrayList<>();

    static List<Integer> genAnsComList(){
        //랜덤한 3자리수 정답 생성 중복 X
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
        return ansComList;
    }
    public static boolean logCheck(int num){
        // 랜덤 수 생성할 때 중복 체크
        for(int i = 0; i < randLogs.size(); i++){
            if(randLogs.get(i) == num){
                return false;
            }
        }
        return true;
    }

    public static int listToInt(List<Integer> list){
        // List -> int
        int temp = 0;
        temp = list.get(0) * 100 + list.get(1) * 10 + list.get(2);
        return temp;
    }
    public static List<Integer> intToList(int num){
        //int -> List
        List<Integer> list = new ArrayList<>();
        int temp = num % 100;
        //ansUserList.add(num / 100);
        list.add(num/100);
        //ansUserList.add(temp / 10);
        list.add(temp/10);
        temp = num % 10;
        list.add(temp);
        return list;
    }
    public static int[] checkBall(List<Integer> ansComList, int ansUser){
        int ballCnt = 0;
        int strikeCnt = 0;
        int[] score = new int[2];
        List<Integer> ansUserList = intToList(ansUser);
        for(int i = 0; i < 3; i++){
            if(ansComList.get(i).equals(ansUserList.get(i))){
                ballCnt++;
            }
            if(!ansComList.get(i).equals(ansUserList.get(i))){
                strikeCnt = checkStrike(ansComList, ansUserList, strikeCnt,i);
            }
        }
        score[0] = ballCnt;
        score[1] = strikeCnt;
        return score;
    }

    private static int checkStrike(List<Integer> ansComList, List<Integer> ansUserList, int strikeCnt, int i ) {
        for(int j = 0; j < 3; j++){
            if(j != i && ansComList.get(i).equals(ansUserList.get(j))){
                strikeCnt++;
            }
        }
        return strikeCnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int restart = 1;
        int [] score;
        while(restart == 1){
            score = new int[2];
            genAnsComList();
            int ansCom = listToInt(ansComList);
            System.out.println("답 : " + ansCom);
            System.out.println("숫자를 입력하세요 :");
            int ansUser = Integer.parseInt(Console.readLine());
            score=checkBall(ansComList, ansUser);
            if(score[0] == 0 && score[1] == 0){
                System.out.println("낫싱");
            }
            System.out.println(score[0] + "볼 " + score[1] + "스트라이크");
            if(score[0] == 3){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
                ansComList.clear();
                randLogs.clear();
                restart = Integer.parseInt(Console.readLine());
            }
            if(restart == 2){
                sc.close();
            }
        }
    }
}

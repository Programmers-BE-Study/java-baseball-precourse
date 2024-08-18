package baseball_ver0;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ansCom = 0, ansUser = 0;
        List<Integer> ansComList = new ArrayList<>();
        List<Integer> ansUserList = new ArrayList<>();
        // 정답 생성 3자리
        int rand = Randoms.pickNumberInRange(1,9);
        ansComList.add(rand);
        for(int i = 0; i < 2; i++){
            rand = Randoms.pickNumberInRange(0,9);
            ansComList.add(rand);
        }
        ansCom = (ansComList.get(0)*100) + (ansComList.get(1)*10) + ansComList.get(2);

        // 정답 들어갔는지 확인
        /*for(int i : ansComList){
            System.out.println(i);
        }*/

        while (true){
            int strikeCnt = 0, ballCnt = 0;
            ansUserList.clear();
            ansUser = 0;
            //게임 스타트
            System.out.println("--정답 생성 완료--");
            System.out.println("----게임 시작----");
            System.out.println("정답 체크: " +  ansCom );
            //사용자 입력
            System.out.println("숫자를 입력해주세요 :");
            ansUser = sc.nextInt();

            //사용자 답 (int -> List)
            int temp = ansUser % 100;
            ansUserList.add(ansUser / 100);
            ansUserList.add(temp / 10);
            temp = ansUser % 10;
            ansUserList.add(temp);

            //정답과 사용자 답 확인
            if(ansCom == ansUser) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다 ! 게임종료");
                break;
            }

            // 볼,스트라이크 체크
            for(int i = 0; i < 3; i++){
                if(ansComList.get(i) == ansUserList.get(i)){ // 볼체크
                    ballCnt++;
                }
                else {
                    for(int j = 0; j < 3; j++){
                        if(j != i && ansComList.get(i) == ansUserList.get(j)){ // 스트라이크 체크
                            strikeCnt++;
                        }
                    }
                }
            }
            System.out.println(ballCnt + "볼" + " " +strikeCnt + "스트라이크");

        } //while------------------------------------

    }
}

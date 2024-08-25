package Application.baseball_ver3;

import camp.nextstep.edu.missionutils.Console;

import java.util.Scanner;

public class Views {
    private static Scanner scanner = new Scanner(System.in);
    public static int mainView(){
        System.out.println("숫자를 입력하세요 : ");
        int ansUser = Integer.parseInt(Console.readLine());
        scanner.close();
        if(ansUser < 100 || ansUser > 999 ){
            throw new IllegalArgumentException("범위 외의 숫자 입니다 (100 ~ 999 입력 바람)" + ansUser);
        } else{
            return ansUser;
        }
    }

    public static int restartView(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        int restart = Integer.parseInt(Console.readLine());
        scanner.close();
        if(restart > 2){
            throw new IllegalArgumentException("범위 외의 숫자 입니다. (1 or 2 입력 바람)" + restart);
        } else{
            return restart;
        }
    }


}

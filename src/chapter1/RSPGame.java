package chapter1;

import java.util.*;

public class RSPGame {

    public static int result(String input, String com){
        String message = "당신의 " + input + " 그리고 상대는 " + com + " 으로 ";
        if(input.equals(com)){
            System.out.println( message + "서로 비겼습니다.");
            return 0;
        }

        else if(
                (input.equals("가위") && com.equals("보")) ||
                (input.equals("바위") && com.equals("가위")) ||
                (input.equals("보") && com.equals("바위"))
        ){
            System.out.println(message + "당신이 이겼습니다!");
            return 1;
        }

        System.out.println(message + "당신이 졌습니다..");
        return 0;
    }

    public static void main(String[] args){
        List<String> rsp = List.of(
                "가위",
                "바위",
                "보"
        );
        Map<Integer, String> gifts = new HashMap<>();
        gifts.put(0, "꽝");
        gifts.put(1, "곰돌이 인형");
        gifts.put(2, "스파르타 랜드 입장권");
        gifts.put(3, "스파르타 캐니언 항공 투어권");
        gifts.put(4, "호텔 스파르타 숙박권");
        gifts.put(5, "스파르테이트 항공권");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int life = 5;
        int win = 0;

        while(life > 0){
            System.out.println("가위 바위 보 중 하나를 입력해주세요!");
            String com = rsp.get(rand.nextInt(3));
            String input = sc.nextLine();

            if(!rsp.contains(input)){
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            win += result(input, com);
            life--;
        }

        System.out.println("축하합니다! 총 " + win + " 회 승리하여 경품으로 [" + gifts.get(win) + "] 을 획득하셨습니다!");

    }
}

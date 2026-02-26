package chapter1;

import java.util.Map;
import java.util.Scanner;

public class spartaVending {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> beverages = Map.of(
                "사이다", 1700,
                "콜라" , 1900,
                "식혜",2500,
                "솔의눈", 3000
        );

        for(Map.Entry<String, Integer> beverage: beverages.entrySet()){
            System.out.println(beverage.getKey() + " " + beverage.getValue() + "원");
        }
        System.out.println();

        System.out.print("원하는 음료수를 입력해주세요: ");
        String item = sc.nextLine();
        if(!beverages.containsKey(item)){
            System.out.println("실행을 종료합니다.");
            return;
        }

        System.out.print("지불할 금액을 입력해주세요: ");
        int money = sc.nextInt();
        if(money<beverages.get(item)){
            System.out.println("돈이 부족합니다.");
            return;
        }

        System.out.println("남은 잔액 :" + (money - beverages.get(item)));
    }
}

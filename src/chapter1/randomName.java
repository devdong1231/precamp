package chapter1;

import java.util.Random;

public class randomName {

    public static int randNum(int num){
        Random random = new Random();
        return random.nextInt(num);
    }

    public static void main(String[] args){
        String[] first = {"기절초풍 ", "멋있는 ", "재미있는 "};
        String[] second = {"도전적인 ", "노란색의 ", "바보같은 "};
        String[] third = {"돌고래", "개발자", "오랑우탄"};


        System.out.print(first[randNum(3)]);
        System.out.print(second[randNum(3)]);
        System.out.print(third[randNum(3)]);

    }

}

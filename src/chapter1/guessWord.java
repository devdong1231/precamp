package chapter1;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class guessWord {

    public static String initWord(){
        List<String> words = List.of(
                "airplane", "apple", "arm", "bakery", "banana", "bank", "bean", "belt", "bicycle", "biography", "blackboard", "boat", "bowl",
                "broccoli", "bus", "car", "carrot", "chair", "cherry", "cinema", "class", "classroom", "cloud", "coat", "cucumber", "desk", "dictionary",
                "dress", "ear", "eye", "fog", "foot", "fork", "fruits", "hail", "hand", "head", "helicopter", "hospital", "ice", "jacket", "kettle",
                "knife", "leg", "lettuce", "library", "magazine", "mango", "melon", "motorcycle", "mouth", "newspaper", "nose", "notebook", "novel",
                "onion", "orange", "peach", "pharmacy", "pineapple", "plate", "pot", "potato", "rain", "shirt", "shoe", "shop", "sink", "skateboard",
                "ski", "skirt", "sky", "snow", "sock", "spinach", "spoon", "stationary", "stomach", "strawberry", "student", "sun", "supermarket",
                "sweater", "teacher", "thunderstorm", "tomato", "trousers", "truck", "vegetables", "vehicles", "watermelon", "wind"
        );
        Random rand = new Random();

        return words.get(rand.nextInt(words.size()));
    }

    public static String printWord(String word, int[] answer){
        String string = "";
        for(int i=0;i<word.length();i++){
            if(answer[i] == 0)
                string += "_";
            else
                string += word.charAt(i);
        }

        return string;
    }

    public static boolean checkAnswer(String word, String ch, int[] answer){
        boolean isCorrect = false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch.charAt(0)){
                answer[i] = 1;
                isCorrect = true;
            }
        }

        return isCorrect;
    }

    public static boolean checkChar(String str){
        if(str.length() > 1){
            return false;
        }
        char ch = str.charAt(0);
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String[] args) {
        String answerWord = initWord();
        int[] correct = new int[answerWord.length()];
        Scanner sc = new Scanner(System.in);
        int life = 9;

        while(life>0){
            System.out.println(printWord(answerWord, correct));
            System.out.print("입력한 값: ");
            String input = sc.next().toLowerCase(Locale.ROOT);

            if(!checkChar(input)){
                System.out.println("다시 입력하세요.");
                continue;
            }

            if(!checkAnswer(answerWord, input, correct)){
                life--;
                System.out.println("남은 기회: "+ life);
            }


            if(answerWord.equals(printWord(answerWord, correct)))
                break;
        }

        if(life == 0){
            System.out.println("정답은 " + answerWord + " / 게임오버");
        }
        else{
            System.out.println("정답은 " + answerWord + " / 플레이어의 승리!");
        }

    }
}

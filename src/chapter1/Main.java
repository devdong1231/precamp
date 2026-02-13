package chapter1;

public class Main {

    public static void main(String[] args){
        String name = "김유하"; // 본인 이름 입력
        int age = 23;      // 본인 나이 입력
        double height = 155.0; // 본인 키 입력
        char grade = '3';    // 학년 입력
        boolean isStudent = true; // 재학중 여부

        // TODO: 학생 정보 출력
        System.out.println("=== 학생 정보 ===");
        // 여기에 출력 코드 작성
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("학년 : " + grade);
        System.out.println("재학중 : " + isStudent);
    }
}

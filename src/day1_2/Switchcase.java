package day1_2;

public class Switchcase {
    public static void main(String[] args) {
        int score = 80;
        char grade = ' ';
        switch(score)//char, byte, short, int, String 타입만 올 수 있음
        {
            case 100: grade = 'A';
                break;
            case 90: grade = 'B';
                break;
            case 80: grade = 'C';
                break;
            default: grade = 'D';
                break;
        }
        System.out.println("당신의 학점은"+grade+"입니다.");
    }
}

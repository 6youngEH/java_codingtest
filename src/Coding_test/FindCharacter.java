package Coding_test;


import java.util.Scanner;

class FindCharacter {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char c = s.next().charAt(0);

        FindCharacter findCharacter = new FindCharacter();
        System.out.println(findCharacter.solution(str, c));
    }
}


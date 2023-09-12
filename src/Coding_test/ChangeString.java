package Coding_test;

import java.util.Scanner;

class ChangeString {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);

        }
        return answer;
    }
    public static void main(String[] args) {
        ChangeString T = new ChangeString();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(T.solution(str));

    }

}

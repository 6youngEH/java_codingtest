package Coding_test;


import java.util.Scanner;
class Main{

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str+" "+t);
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T= new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char c = s.next().charAt(0);
        System.out.println(T.solution(str,c));

    }
}

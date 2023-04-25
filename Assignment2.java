import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        if(ContainsAll(s)){
            System.out.println("The given String contains all alphabets");
        }
        else{
            System.out.println("The given String does not contain all alphabets");
        }
    }
    static boolean ContainsAll(String s){
        s=s.toLowerCase();
        boolean[] alpha=new boolean[26];
        for(char c:s.toCharArray()){
            if('a'-c>=-25 && 'a'-c <=0){
                alpha[c-'a']=true;
            }
        }
        for(boolean b:alpha){
            if(!b)return false;
        }
        return true;
    }
}

//time complexity - O(n) 

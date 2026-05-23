package StringProblems.StringProblems;

public class CharString {
    public static void main(String[] args) {
        String s="Hello World";
        char c=s.charAt(0);
        System.out.println("First character: "+c);
        char d=s.charAt(s.length()-1);
        System.out.println("Last character: "+d);
    }
}

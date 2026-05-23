// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CharacterCount {
    public static void main(String[] args) {
        String s="BharathC@123";
        int uc=0,lc=0,ne=0,sp=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
            {
                uc++;
            }
            else if(c>='a' && c<='z')
            {
                lc++;
            }
            else if(c>='0' && c<='9')
            {
                ne++;
            }
            else
            {
                sp++;
            }
        }
        System.out.println("Upper Case:   "+uc);
        System.out.println("Lower Case:   "+lc);
        System.out.println("Number Case:  "+ne);
        System.out.println("Specail Case: "+sp);
    }
}

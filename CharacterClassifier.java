class CharacterClassifier {
    public static void main(String[] args) {
        String s="BharathC@123";
        String uc="",lc="",ne="",sp="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
            {
                uc+=c;
            }
            else if(c>='a' && c<='z')
            {
                lc+=c;
            }
            else if(c>='0' && c<='9')
            {
                ne+=c;
            }
            else
            {
                sp+=c;
            }
        }
        System.out.println("Upper Case:   "+uc);
        System.out.println("Lower Case:   "+lc);
        System.out.println("Number Case:  "+ne);
        System.out.println("Specail Case: "+sp);
    }
}

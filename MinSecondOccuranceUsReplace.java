class MinSecondOccuranceUsReplace{
    public static void main(String[] args) {
        String s1="abbcccdddd";
        char minChar1=' ';
        char minChar2=' ';
        int minCount1=s1.length();
        int minCount2=s1.length();
        while(s1.length()>0)
        {
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if(count<minCount1)
            {
                minCount2=minCount1;
                minCount1=count;
                minChar2=minChar1;
                minChar1=ch;
            }
            else if(count>minCount1 && count<minCount2)
            {
                minCount2=count;
                minChar2=ch;
            }
            System.out.println(ch+"="+count);
            s1=s2;
        }
        System.out.println("===============");
        System.out.println(minChar2+" : "+minCount2);
    }
}

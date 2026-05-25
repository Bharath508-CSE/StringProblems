class MaxSecondOccuranceUsReplace{
    public static void main(String[] args) {
        String s1="abbcccdddd";
        char maxChar1=' ';
        char maxChar2=' ';
        int maxCount1=0;
        int maxCount2=0;
        while(s1.length()>0)
        {
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if(count>maxCount1)
            {
                maxCount2=maxCount1;
                maxCount1=count;
                maxChar2=maxChar1;
                maxChar1=ch;
            }
            else if(count>maxCount2  && count!=maxCount1)
            {
                maxCount2=count;
                maxChar2=ch;
            }
            System.out.println(ch+"="+count);
            s1=s2;
        }
        System.out.println("===============");
        System.out.println(maxChar2+" : "+maxCount2);
    }
}

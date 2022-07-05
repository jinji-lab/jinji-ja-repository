public class anvil {
    public static void main(String[] args){
        char[] chars =createArray();

        System.out.println("The lowercase letters are:");                 //主体，输入数组中的随机字母，再输出每个字母的出现次数
        displayArray(chars);

        int[] counts =countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    //创造一个充满100个随机字母的数组
    public static char[] createArray(){
        char[] chars =new char[100];

        for(int i=0;i<chars.length;i++)
            chars[i]=getRandomLowerCaseLetter('a','z');
        return chars;
    }

    //打印随机字母
    public static void displayArray(char[] chars){
        for(int i=0;i<chars.length;i++){
            if((i+1)%20==0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i]+" ");
        }
    }

    //在counts数组中记录26个字母对应的次数
    public static int[] countLetters(char[] chars){
        int[] counts=new int[26];
        for (char aChar : chars)
            counts[aChar - 'a']++;
        return counts;
    }


    //打印字母出现次数与相应字母
    public static void displayCounts(int[] counts){
        for(int i=0;i<counts.length;i++){
            if((i+1)%10==0)
                System.out.println(counts[i]+" "+(char)(i+'a'));
            else
                System.out.print(counts[i]+" "+(char)(i+'a')+" ");
        }
    }

    //返回一个随机字母
    public static char getRandomLowerCaseLetter(int ch1, int ch2){
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
}

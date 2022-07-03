import java.util.Scanner;
//十六进制转十进制
//import java.util.Random;
public class anvil {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex =input.nextLine();

        System.out.println("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase()));
    }
    public static int hexToDecimal(String hex){  //核心句
        int decimalValue =0;
        for(int i=0;i<hex.length();i++){
            char hexChar =hex.charAt(i);
            decimalValue= decimalValue * 16 + hexCharToDecimal(hexChar);//霍纳算法
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')  //是字母
            return 10 + ch- 'A';
        else                         //是数字
            return ch- '0';
    }
}

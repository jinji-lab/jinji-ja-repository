import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class anvil {
    public static void main(String[] args){
        int flag,aid;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int sum=input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slot=input.nextInt();

        int [] slots=new int[8];
        Random randBool=new Random();

        for(int i=0;i<sum;i++) {
            aid=sum;
            flag=0;
            for(int j=0;j<7;j++){
                if (randBool.nextBoolean()) {
                    flag++;
                    System.out.print("R");
                }else
                    System.out.print("L");
            }
            slots[flag]++;  //增加一个槽的小珠数
            System.out.println();
        }
        System.out.println(Arrays.toString(slots));
        for(int i = sum; i > 0; i--){  //balls_number=5
            for(int j = 0; j < slot; j++){ //slots_numbers=8
                if(slots[j] < i)
                    System.out.print(" ");     //core
                else
                    System.out.print("O");
            }
            System.out.println();
        }
    }
}

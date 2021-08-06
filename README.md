# jinji-ja-repository
my java study notes
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("请输入行数");  //自行输入行数(为奇数)
        int z = y.nextInt();
        int x = z/2;  //将行数对折(取对称轴的一半行数(不包括对称轴中间))
        for(int i =x;Math.abs(i)<=x;i--){   //通过math.abs的方法使得0的两边都为正数，使其对称
            for(int j = 1;j<=Math.abs(i);j++ ){  //通过变量i来判断一行开始时需要打印的空格数
                System.out.p rint(" ");
            }
            for(int k = 1;k<=(2*x+1)-2*Math.abs(i);k++){//查找两排数字的规律，得出每行菱形打印字符数
                if(k==1 || k==(2*x+1)-2*Math.abs(i)) {  //如果是一行的开头或结束输出“*”，也就是最外围
                    System.out.print("*");               
                }else{
                    System.out.print(" ");              //不然输出空格(菱形中的空心)
                }
            }
            System.out.println();
        }
    }
}

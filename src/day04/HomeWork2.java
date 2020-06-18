package day04;
/*从键盘输入8个整数存放到一个数组中
  然后将奇数和偶数分别存入到两个不同的数组中，
  并按奇数、偶数交替的顺序输出这两个数组中的所有数据
  先交替输出，如果奇数个数多，则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数。

  提示与要求：
       （1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，
       才能定义存储奇数和偶数的数组的长度；
       （2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法
 */
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=8;
        int[] array=new int[n]; //保存输入的数据
        int oddsum=0,evensum=0;//奇数个数，偶数个数
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if((array[i]&1)==1){   //奇数，位运算效率高，而且负数也是这个条件
                oddsum++;
            }else{
                evensum++;
            }
        }
        int[] oddarray=new int[oddsum];//奇数数组
        int[] evenarray=new int[evensum];//偶数数组
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if((array[i]&1)==1){  //奇数
                oddarray[x++]=array[i];
            }else{
                evenarray[y++]=array[i];
            }
        }
        x=0;
        y=0;
        while(x<oddsum||y<evensum){
            if(x<oddsum){  //如果还有奇数，输出一个
                System.out.print(oddarray[x++]+" ");
            }
            if(y<evensum){  //如果还有偶数，输出一个
                System.out.print(evenarray[y++]+" ");
            }
        }

    }
}

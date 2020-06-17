package day03;

public class HomeWork {
    public static void main(String[] args) {

         // 打印等腰三角形
        int m = 5;//行数设置
        for (int i = 1; i <= m; i++)//控制行数
        {
            for (int j = i; j <= m; j++) //打印空格
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

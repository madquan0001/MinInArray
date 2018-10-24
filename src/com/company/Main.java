package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soPhanTu;
        System.out.printf("Nhập số phần tử của mảng : ");
        soPhanTu = scanner.nextInt();
        int a[] = new int[soPhanTu];
        for (int i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        for (int j = 0 ; j < a.length ; j++)
        {
            int count = 0;
            for (int k = 0 ; k < a.length ; k++)
            {
                if (a[j] <= a[k])
                {
                    count++;
                }
            }
            if (count == a.length)
            {
                System.out.println();
                System.out.println("Phần tử nhỏ nhất là a[" + j + "] = " + a[j] + " đứng thứ " + (j + 1) + " trong danh sách .");
            }
        }
    }



}
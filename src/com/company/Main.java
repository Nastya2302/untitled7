package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int k=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size= ");
        int size = scanner.nextInt();
        Random random = new Random(100);
        int min = -100, max = 100;
        int[][] array = new int[size][2];
        for (int i=0; i<array.length; i++)
        for (int j=0; j<array[i].length; j++) {
            array[i][j] = random.nextInt(max - min) + min;
        }
        for(int i=0;i<size; i++){
            if(array[i][0]<0&&array[i][1]<0)
                k++;
        }
        for (int i=0; i<array.length; i++)
        System.out.println(Arrays.toString(array[i]));

        System.out.println("Кількість точок в третьому квадранті: " + k);
    }
}

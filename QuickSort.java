package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a,0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
    public static int partition(int[] a, int s, int e){
        int i = s, temp = 0, p = a[e];
        for (int j = s; j < e; j++) {
            if(a[j] < p && i < e){
                temp = a[i];
                a[i] = a[j];
                a[j]= temp;
                i++;
            }
        }
        temp = a[i];
        a[i] = a[e];
        a[e] = temp;
        return i;
    }
    public static void quickSort(int[] a,int s, int e) {
        if(s>=e) return;
        int p = partition(a,s,e);
        quickSort(a, s, p - 1);
        quickSort(a, p + 1, e);
    }
}

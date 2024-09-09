import java.util.*;
import java.util.Scanner;

public class sort0s1sand2s {
    static int n;
     int[] ans;

    public sort0s1sand2s(int n,int[] ans){
        this.n=n;
        this.ans= ans;
    }
    public void sort0s1s2s() {
        int low = 0;
        int mid = 0;
        int high = ans.length - 1;

        while(mid <= high){
            if(ans[mid] == 0){
                int temp = ans[mid];
                ans[mid] = ans[low];
                ans[low] = temp;
                low++;
                mid++;
            }
            else if(ans[mid] == 1){
                mid++;
            }
            else{
                int temp = ans[mid];
                ans[mid] = ans[high];
                ans[high] = temp;
                high--;
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int[] ans = new int[n];
        System.out.println("Enter array of 0's 1's and 2's Only: ");
        for(int i=0; i<n; i++)
        {
            ans[i] = sc.nextInt();
        }
        sort0s1sand2s obj = new sort0s1sand2s(n, ans);
        obj.sort0s1s2s();
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}

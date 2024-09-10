import java.util.Scanner;
import java.util.*;


class day2 {
  int[] arr;

  public day2(int[] arr){
    this.arr = arr;
  }

  public int find_missed_number(){
    int number_missed = -1;
    int n = arr.length;
    int temp = n + 1;
    int totSum = (temp*(temp+1)) / 2;
    int sum = 0;
    for(int i=0; i<n; i++){
      sum += arr[i];
    }
    number_missed = totSum - sum;
    return number_missed;
  }
}

public class FindMissingNumber{
  public static void main(String[] args){
    int[] arr = {1,2,4,5};

  day2 obj = new day2(arr);
  int number = obj.find_missed_number();
  
    System.out.println("Missing Number is "+ number);
  }
}

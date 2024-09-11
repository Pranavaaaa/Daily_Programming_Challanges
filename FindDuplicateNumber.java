public class FindDuplicateNumber {
  public static int findDuplicate(int[] arr) {
      int oneStep = arr[0];
      int twoStep = arr[0];
      
      
      do {
        oneStep = arr[oneStep];      
        twoStep = arr[arr[twoStep]];       
      } while (oneStep != twoStep);
      
      oneStep = arr[0]; 
      
      while (oneStep != twoStep) {
        oneStep = arr[oneStep];  
        twoStep = arr[twoStep];          
      }
      return twoStep;
  }

  public static void main(String[] args) {
      int[] arr1 = {1, 3, 4, 2, 2};
      System.out.println("Duplicate number: " + findDuplicate(arr1)); 
      
      int[] arr2 = {3, 1, 3, 4, 2};
      System.out.println("Duplicate number: " + findDuplicate(arr2)); 
      
      int[] arr3 = {1, 1};
      System.out.println("Duplicate number: " + findDuplicate(arr3)); 
      
      int[] arr4 = {1, 4, 4, 2, 3};
      System.out.println("Duplicate number: " + findDuplicate(arr4)); 
  }
}

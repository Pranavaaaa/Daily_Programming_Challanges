import java.util.*;

public class LeadersInArray {
    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leadersList = new ArrayList<>();
        
        // Start from the rightmost element and assume it's the first leader
        int maxFromRight = arr[n - 1];
        leadersList.add(maxFromRight);  // The rightmost element is always a leader
        
        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leadersList.add(maxFromRight);
            }
        }
        
        // Since we added leaders from right to left, reverse the list to maintain original order
        Collections.reverse(leadersList);
        
        // Convert the list to an array
        int[] leadersArray = new int[leadersList.size()];
        for (int i = 0; i < leadersList.size(); i++) {
            leadersArray[i] = leadersList.get(i);
        }
        
        return leadersArray;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders: " + Arrays.toString(findLeaders(arr1)));  // Output: [17, 5, 2]
        
        int[] arr2 = {1, 2, 3, 4, 0};
        System.out.println("Leaders: " + Arrays.toString(findLeaders(arr2)));  // Output: [4, 0]
        
        int[] arr3 = {7, 10, 4, 10, 6, 5, 2};
        System.out.println("Leaders: " + Arrays.toString(findLeaders(arr3)));  // Output: [10, 6, 5, 2]
        
        int[] arr4 = {5};
        System.out.println("Leaders: " + Arrays.toString(findLeaders(arr4)));  // Output: [5]
        
        int[] arr5 = {100, 50, 20, 10};
        System.out.println("Leaders: " + Arrays.toString(findLeaders(arr5)));  // Output: [100, 50, 20, 10]
    }
}

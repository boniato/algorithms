public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        
        int start = 0;
        int end = sortedArray.length - 1;
        int mid = 0;
        
        while (start <= end) {
            mid = (start + end) / 2;
            
            if (sortedArray[mid] < lessThan) {
               if (mid < sortedArray.length - 1 && sortedArray[mid + 1] < lessThan) { // check id next value is also valid
                   start = mid + 1;
                   continue;
               } else
                   return mid + 1;
           }
           end = mid - 1;
        }
        
        return 0;
        
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}

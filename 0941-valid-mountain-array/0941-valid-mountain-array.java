class Solution {
    public boolean validMountainArray(int[] arr) {
      
    
        //int[] arr = {5,4,3,3};
      int n = arr.length;   //4
      int right = arr.length-1;  // 3
      int left = 0;
      
      
        
       while(left < n-1 && arr[left]< arr[left + 1]) {
           left++; //1 
       } 
        
       while(right>0 && arr[right] < arr[right-1]) {
           right--;
       }
       if(right == 0 && left == 0 ) return false;
       if(left != right) return  false;
       if(left == right && right == n-1 ) return false;
        return true;
        
    }
}
     
    
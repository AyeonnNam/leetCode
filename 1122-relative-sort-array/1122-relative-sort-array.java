class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int n = arr1.length;
        int[] result = new int[n];     
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //배열 정렬 
        Arrays.sort(arr1);
        
        //맵에 arr1의 값과 횟수를 저장한다.
        for(int i=0; i< arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i],0) + 1);    
        }
        
        //리스트 선언
        List<Integer> list = new ArrayList<Integer>();

        //arr에 있는 값이 맵에 있으면 해당 값의 횟수만큼 리스트에 넣기
        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i])){
                for(int j=0; j<map.get(arr2[i]); j++) {
                    list.add(arr2[i]);
                }map.put(arr2[i],0);
            }
        }
        
        //남아있는 arr1값 list에 넣기 
        for(int i=0; i< n; i++){
            if(map.containsKey(arr1[i])&&map.get(arr1[i]) > 0) {
                for(int j = 0; j< map.get(arr1[i]) ; j ++) {
                    list.add(arr1[i]);
                }map.put(arr1[i],0);
                
                
            }
        }
        
       result =  list.stream().mapToInt(Integer::valueOf).toArray();
        return result;
        
        
    }
}
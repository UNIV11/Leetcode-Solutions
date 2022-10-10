class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();	
        List<Integer> nums=new ArrayList<Integer>();
		if(numRows>0)
		{
			nums.add(1);
			list.add(nums);
		}	
		if(numRows>1)
		{
			nums=new ArrayList<Integer>();
			nums.add(1);
			nums.add(1);
			list.add(nums);
		}	

		for (int j = 0; j < numRows-2; j++) {
			Integer[] arr=new Integer[nums.size()+1];
			for (int i = 1; i < nums.size(); i++) {			
				arr[0]=1;arr[nums.size()]=1;
				arr[i]=nums.get(i)+nums.get(i-1);
			}
			nums=Arrays.asList(arr);
			list.add(nums);
			
		}
		
        return list;
    }
}



//	public static void main(String[]  args)
//	{
//		int[]  nums={1,2,4};
//		int[] n=twoSum(nums,3);
//		for(int i=0;i<n.length;i++)
//		{
//			System.out.println(n[i]);
//		}
//	}
//		
//		 public static int[] twoSum(int[] nums, int target) {
//		        for(int i=0;i<nums.length;i++)
//		        
//		        {
//		           for(int j=i+1;j<nums.length;j++)
//		           {
//		               if(nums[i]+nums[j]==target)
//		               {
//		                   return  new int[] {i,j};
//		               }
//		        }
//		        
//		    }
//		        return new int[] {0};   
//		}
//	

//		int[] a={1,2,3,4,5};
//		int left=0;
//		int right=a.length-1;
//		while(left<right)
//		{
//			while(a[left]%2!=0&&left<right)
//			{
//				left++;
//			}
//			while(a[right]%2==0&&left<right)
//			{
//				right--;
//			}
//			if(left<right)
//			{
//				int temp=a[left];
//				a[left]=a[right];
//				a[right]=temp;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
////	}
}

//		int[] a={1,2,3,4,5};
//
//	    int[] b=copyOfRange(a,1,2);
//       for(int i=0;i<b.length;i++)
//	{
//   		System.out.println(b[i]);
//	}
//		}
//	public static int[] copyOfRange(int[] original,int from,int to)
//	{
//		
//	       int[] b=new int[1];
//			for(int i=from;i<to;i++)
//		{
//			b[i-from]=original[i];
//		}
//		return b;
//	}
//}



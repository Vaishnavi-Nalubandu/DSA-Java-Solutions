class LC704
{
public static void main(String[] args)
{
int nums[] = {-1,0,3,5,9,12};
int target = 9;
int start = 0;
int end = nums.length-1;
int ans = -1;
while(start <= end)
{
int mid  = (start+end) / 2;
if(nums[mid] == target)
{
ans = mid;
break;
} else if(nums[mid]  < target) {
start = mid+1;
} else  {
end = mid-1;
} 
}
System.out.println(ans);
}
}
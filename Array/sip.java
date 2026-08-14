public class sip{
    public static void main(String [] args){
        int []nums={1,3,5,6};
        int left=0;
        int right=nums.length-1;
        target=5;
        while( left<= right){
            int mid= left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println("Target Found "+mid);
            }else{
                if(nums[mid]<target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                } 
                System.out.println("o");
                }
            }
        }
    }
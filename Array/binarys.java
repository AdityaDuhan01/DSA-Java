public class binarys{
    public static void main (String[]args){
        int nums[] = {2,4,6,8,10};
        int target=8;
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums.length){
                System.out.println("TARGET foUND");
            } else{
                int mid= left+ (right-left)/2;
                System.out.println(mid);
            }
        }


    }
}
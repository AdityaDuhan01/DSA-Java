public class  binarysearch{
    public static void main (String [] args){
        int []arr={2,5,8,12,16,23,38};
        int target=23;
        int left=0;
        int right=arr.length-1;
        while (left <= right){
            int mid= left + (right - left)/2;
            if(arr[mid]== target){
                System.out.println("The target is found: " +mid ); 
                break;
            }else {
            if( target > arr[mid]){
                left = mid+1;
            } else  if( target < arr[mid]){
                    right = mid-1;
                    System.out.println(" Found target" +mid);
                }
            }
        }
        }
        }
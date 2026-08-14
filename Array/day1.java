public class day1{
    public static void main(String [] args){
   int arr[]= {5,8,9,11,45};
   int smallest = arr[0];
     for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
      if( arr[i] < smallest ){
         smallest = arr[i];
      }
     } 
     System.out.println("The smallest no is:"+smallest);
   }}
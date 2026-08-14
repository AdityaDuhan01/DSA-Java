public class sumofarr {
    public static void main (String []args){
        int sum = 0,i;
        int arr[]= {11,34,67,88,90};
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
            System.out.println("Sum="+sum);
    }
}
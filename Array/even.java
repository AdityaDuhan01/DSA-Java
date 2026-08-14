public class even {
    public static void main (String[]args){
    int arr[]={11,34,67,88,90};
    int i; 
  int count=0;
    for(i=0;i<arr.length;i++){
    if(arr[i] %2 == 0){
        count++;
    System.out.println("Even count:"+count);
    }
    }
}
}
public class Main {
    //linear search
    public static int linearSearch(int[] arr, int key){
       for(int i=0; i<arr.length;i++){
           if(arr[i]==key){
               return i;
           }
       }
       return -1;
    }


    public static void main(String[] args) {
        int linear = linearSearch(new int[]{7,9,3,4,11,2,1},4);
        System.out.println(linear==-1?"element not found":"element found at index: "+linear);
    }
}

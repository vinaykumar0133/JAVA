package SORTING;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 2,5,34,2, 25, 22,12,12};
        //Bubbble Sort
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        //Selection Sort
        // for(int i=0;i<arr.length-1;i++){
        //     int small=arr[i];
        //     int index=i;
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[j]<small){
        //             small=arr[j];
        //             index=j;
        //         }
        //     }
        //     int temp=arr[i];
        //     arr[i]=small;
        //     arr[index]=temp;
        // }

        for(int i=1;i<arr.length;i++){
            int element=arr[i];
            int j=i-1;
            while(j>=0 && element<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
            
        }
        System.out.println("Array After Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

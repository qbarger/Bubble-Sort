
import java.util.Scanner;


public class myBubbleSort{

    

    public static void main(String[] args){
        System.out.println("This program will sort the array you enter from least to greatest.");
        System.out.println("Enter the length of your array...");
        
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int[] myArray = new int[x];
        s.close();
        int a = 0;
        for(a=0; a < x; a++){
        
        System.out.println("Enter an integer for your array...");    
        Scanner d = new Scanner(System.in);
        int y = d.nextInt();
        myArray[a] = y;
        d.close();
        
        
        
    }
     
    bubbleSort(myArray);

    System.out.println(java.util.Arrays.toString(myArray));

    }

   

    

    public static void bubbleSort(int[]A){

        for(int i=0; i<A.length-1; i++){

            for(int j = 0; j<A.length-i-1; j++){

                if(A[j]>A[j+1]){

                    swap(A, j, j+1);

                }

                }

            }

            

    }

     

    public static void swap(int[]A, int i, int j){

        int temp = A[i];

        A[i] = A[j];

        A[j] = temp;

    }

        

}

    

   


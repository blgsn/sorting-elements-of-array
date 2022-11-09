
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // creates an object named input 
        System.out.print("Dizinin boyutu n : ");//asks the user how many elements entered
        int number = input.nextInt(); //reading array number of elements               
        
        int[] array = new int[number]; // creates an object of array  
      //asks the user elements of array
        System.out.println("Dizinin elemanlarını giriniz : "); 
       
        for(int i=0; i<number; i++)  
        {  
        System.out.print(i+1 + ". Elemanı : ");
        //reading array elements from the user   
        array[i]=input.nextInt();  
        
        }  
        //calling sort method of the array class
        Arrays.sort(array);
        System.out.print("Sıralama : ");  
      //prints sorted array using the for loop  
        for (int i = 0; i < array.length; i++)  { 
        System.out.print(array[i] + " ");  
        }
     }  
}




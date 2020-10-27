public class Main {
 
    public static void printStars(int n) 
    { 
        int i, a; 
  
        for(i=0; i<n; i++) 
        { 
    
            for(a=0; a<=i; a++) 
            { 
                
                System.out.print("*"); 
            } 
  
            System.out.println(); 
        } 
   } 

    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}

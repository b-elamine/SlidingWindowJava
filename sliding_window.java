import java.util.ArrayList;
import java.util.Arrays;

public class sliding_window {

    //Sliding window algorithm with 1/2 of windows size overlapping 

    public static void slidingWindow(Double [] elements,
            int windows_size,
            ArrayList<Double []> all_windows) {
               
               int bound = (int)(elements.length)/(windows_size/2);
               if (elements.length <= windows_size) {
                all_windows.add(elements);
               } else {
                for (int i=0; i < elements.length; i++) {
                    if (all_windows.size()==bound){
                        break;
                    } else {
                        Double [] arr2 = Arrays.copyOfRange(
                            elements,
                            (int)(i*(windows_size/2)),
                        (int)(i*(windows_size/2))+windows_size);
                        
                        all_windows.add(arr2);
                    }
                }
               }
    }

    // A method for displaying our Arrays and not memory adresses.. 

    public static String arraytoString(Double [] var) {
            String result = "+";
            for (int i = 0; i < var.length; i++){
                result+= " " + var[i];
            }
            return result;
    }

    // Testing .. 

    public static void main(String[] args) {
        
        ArrayList<Double[]> all = new ArrayList<Double[]>();
        Double arr[] = {1.0,2.0,5.0,4.0,8.0,7.0,9.0,5.0,4.0,1.0,2.0,3.0,1.0,5.0,4.0,5.0,5.0,4.0,5.0,7.0};
        
        slidingWindow(arr, 4, all);
        System.out.println(all);
        for (int i = 0; i < all.size(); i++) {
            System.out.println(arraytoString(all.get(i)));  
         }
    }

    
}

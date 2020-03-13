package media;

import java.util.ArrayList;


public class Media {

   
    public static void main(String[] args) {
       
        int[] nums = new int [3];
       
       
        nums[0] = 8;
        nums[1] = 9;
        nums[2] = 7;
       
        int media = 0;
        for(int i = 0; i<nums.length; i++)
            media += nums [i];
        float total1 = (float) media / nums.length;
       
        System.out.println("A media 1 é: " +total1);
       
        int[] nums2 = new int [3];
       
        nums2[0] = 4;
        nums2[1] = 5;
        nums2[2] = 6;
       
        int media2 = 0;
        for(int i = 0; i<nums2.length; i++)
            media2 += nums2 [i];
        float total2 = (float) media2 / nums2.length;
       
        System.out.println("A media 2 é: " +total2);
       
        float total = (float) (total1 + total2)/2;
       
        System.out.println("A media final do dois hehe é: " +total);
       
    }
   
}

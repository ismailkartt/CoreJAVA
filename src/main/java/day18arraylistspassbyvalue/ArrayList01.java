package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Bir Integer  ArrayList deki 7 haric tum elemanlari 2 artiriniz...
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(28);
        ages.add(9);
        System.out.println(ages);
        for (Integer w : ages) {
            if(w==7){
                continue;
            }
            // w = w + 2;  Listler boyle update edilemezler..
            ages.set(ages.indexOf(w), w+2);
        }
        System.out.println(ages);
        //Example 2: Size verilen ArrayListte 8(inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz...
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        System.out.println(nums);
        for (Integer w : nums) {
            nums.set(nums.indexOf(w), w*2);
            if(w==8){
                break;
            }
        }
        System.out.println(nums);
    }
}


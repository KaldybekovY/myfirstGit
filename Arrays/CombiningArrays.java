package Arrays;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5};
        int[] nums2 = {6,7,8,9};
        int[] capacity = new int[nums1.length+nums2.length];
        for (int i = 0; i<nums1.length; i++){
            capacity[i]=nums1[i];
        }
        System.out.println(Arrays.toString(capacity));
            for (int k= nums1.length, c=0; k<capacity.length; k++, c++){
                capacity[k]=nums2[c];
            }
        System.out.println(Arrays.toString(capacity));
        }
        }


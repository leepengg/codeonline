package com.lipeng.leetcode;

/**
 * Created by peng on 8/2/16.
 */
public class SortColors {
    public void sortColors(int[] nums) {

        if (nums == null) {
            return;
        }

        if (nums.length == 1) {
            return;
        }

        int i = 0;
        int j = nums.length - 1;

        int last0 = 0;
        int last2 = j;
        while (i < j) {
            while (i < j && nums[i] == 0) {
                i++;
                nums[last0] = 0;
                last0++;
            }

            while (j > i && nums[j] == 2) {
                j--;
                nums[last2] = 2;
                last2--;
            }

            if (nums[i] == 2) {
                if (nums[j] == 0) {
                    nums[last0] = 0;
                    nums[last2] = 2;
                    last0++;
                    last2--;

                } else { //1
                    nums[last2] = 2;
                    last2--;
                }
            } else { // 1
                if (nums[j] == 0) {
                    nums[last0] = 0;

                    last0++;
                } else {

                }
            }
            i++;
            j--;

            if (i == j) {
                switch (nums[i]) {
                    case 0:
                        nums[last0] = 0;
                        last0++;
                        break;
                    case 2:
                        nums[last2] = 2;
                        last2--;
                        break;
                }
            }
        }

        for (i = last0; i <= last2; i++) {
            nums[i] = 1;
        }
    }

    public static void main(String[] argv) {
        int[] data = {1, 2, 0};

        new SortColors().sortColors(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

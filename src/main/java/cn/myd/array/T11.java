package cn.myd.array;

/**
 * @author myd
 * @date 2020/8/10  3:21
 */

public class T11 {

    public static int hh(int[] height){
        /**
         *
         * 思路：从数组的左右两端开始计算面积的值，数字小的，则向内移动这样不会错过最大值
         *
         *
         * leetcode：官方
         * 双指针代表的是 可以作为容器边界的所有位置的范围。
         * 在一开始，双指针指向数组的左右边界，
         * 表示 数组中所有的位置都可以作为容器的边界，
         * 因为我们还没有进行过任何尝试。
         * 在这之后，我们每次将 对应的数字较小的那个指针 往 另一个指针 的方向移动一个位置，
         * 就表示我们认为 这个指针不可能再作为容器的边界了。
         *
         *
         */
        int maxArea = 0;
        int area  =0;
        for(int i = 0,j = height.length-1 ;i !=j ;){
            if(height[i] < height[j]){
                area =height[i]*(j-i);
                i++;
            }else{
                area = height[j]*(j-i);
                j--;
            }
            maxArea  = maxArea > area?maxArea:area;
            System.out.println(maxArea+",i="+i+",j="+j);
        }


        return maxArea;

    }

}

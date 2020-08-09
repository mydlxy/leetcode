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

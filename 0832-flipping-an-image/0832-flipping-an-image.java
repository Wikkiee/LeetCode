class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length;i++){
            int[] temp = new int[image[i].length]; 
            for(int j = image[i].length-1;j>=0;j--){
                temp[(image[i].length-1) - j] = Math.abs(image[i][j] - 1); 
            }
            image[i] = temp;
        }
        return image;
    }
}
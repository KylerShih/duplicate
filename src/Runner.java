public class Runner {
    public static void main(String[] args) {


        int[][] numArr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("false");
        System.out.println(hasDup(numArr));
        int[][] numArr1 = {{1,4,3},{4,3,6},{1,4,9}};
        System.out.println("true");
        System.out.println(hasDup(numArr1));
        int[][] numArr2 = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println("true");
        System.out.println(hasDup(numArr2));
        int[][] numArr3 = {{1,2,3},{2,4,6},{3,3,3}};
        System.out.println("true");
        System.out.println(hasDup(numArr3));


    }
    public static boolean hasDup(int[][] arr){
        for(int c = 0;c<arr[0].length;c++){
            for(int r = 0;r< arr.length;r++){
              for(int i =0;i<arr.length;i++){
                if(r!=i){
                    if(arr[r][c]==arr[i][c]){
                        return true;
                    }
                }
              }
            }
        }
        return false;
    }
}

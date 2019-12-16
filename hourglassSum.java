    static int hourglassSum(int[][] arr) {
        int max=-100000;
        int val;
        for (int i = 0; i <=3 ; i++) {
            for (int j = 0; j <=3 ; j++) {
                val=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                System.out.println(val);
                    if (val>max)
                        max=val;
            }

        }
        return max;
    }
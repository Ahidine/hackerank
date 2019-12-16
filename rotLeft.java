    static int[] rotLeft(int[] a, int d) {
        List l= new ArrayList(Arrays.asList(a));
        System.out.println(l);
        int temp=0;
        for (int i = 0; i <d ; i++) {
            temp =a[0];
            for (int j = 0; j <a.length-1 ; j++) {
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
        }

    return a;
    }
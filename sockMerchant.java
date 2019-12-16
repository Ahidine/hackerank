    static int sockMerchant(int n, int[] ar) {
        int conteur=0;
        Set<Integer> liste = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            if (!liste.contains(ar[i])){
                liste.add(ar[i]);
            }
            else
            {
                liste.remove(ar[i]);
                conteur++;


            }
        }




        return conteur;
    }
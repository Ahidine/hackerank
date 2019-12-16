    static int countingValleys(int n, String s) {
        int indice =100;
        boolean helper = false;
        int conteur =0;
        for (int i = 0; i <s.length() ; i++) {
            if (indice>100)
                helper=true;
            if (s.charAt(i) =='U'){
                indice++;
            }
            else
            {
                indice--;
            }
            if (indice==100)
            {
                if (helper)
                {
                    helper=false;
                }
                else
                conteur++;
            }
        }
        return conteur;

    }
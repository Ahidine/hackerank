    static int jumpingOnClouds(int[] c) {
        int conteurs=0;
        for (int i = 0; i <c.length-1; i++) {
            System.out.println("indice ="+i+ "  element " +c[i]);
            //X1
            // si je le trouve j'incrémente  conteurs et i pour jumper le 1
            if (c[i+1]==1){
                conteurs++;
                i++;
            }
            //X01 || X00
            else
            if (i+2<=c.length-1) {
                // X00
                if (c[i + 2] == 0) {
                    conteurs++;
                    i++;
                } 
                //X01
                else {
                    conteurs++;
                }
            }
            // le dernier 00
            else
                conteurs++;

        }

        return conteurs;
    /*
       int conteurs=0;
        for (int i = 0; i <c.length-1; i++) {
          if (i+2<c.length && c[i+2]==0)
              i++;

            conteurs++;
        }

        return conteurs;
        */
    }
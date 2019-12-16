    static int makeAnagram(String a, String b) {
        int conteurs=0, helper=0,n,m;
        System.out.println(a.length());
        System.out.println(b.length());
        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j <b.length() ; j++) {
                if (a.charAt(i)==b.charAt(j))
                {
                   b.replaceFirst(b.charAt(j)+"", " ");
                   helper++;
                   break;

                }
            }

        }
        conteurs=(a.length() - helper) +(b.length()- helper);
        return conteurs;

    }
static long repeatedString(String s, long n) {
        long conteurs =0,helper=0, conteurPerString=0;
        // cb de a dans la chaine
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='a')
                conteurPerString++;
        }
        // cb de chaine de N
        helper = n/s.length();
        // calculer cb de a  peut on avoir dans helper
        // incremente conteur
        conteurs= conteurs+ (helper*conteurPerString);
        // calculer le reste 
        for (int i = 0 ; i <n-(helper*s.length()) ; i++) {
            if (s.charAt(i)=='a')
                conteurs++;
        }
        return conteurs;

    }
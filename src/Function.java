public class Function {

    public static String printerErrors(String s){
        int countWrong = 0;
        for(int i = 0; i < s.length(); i++){
            if(!(s.charAt(i)>='a' && s.charAt(i)<='m')){countWrong++;}
        }
        return countWrong +"/" + s.length();
    }

    public static int digital_root(int n) {
        int sum =0;
        do{
            sum += n%10;
            n = n/10;
        }while(n!=0);
        if(sum>=10){
            sum = digital_root(sum);
        }
        return sum;
    }

    public static boolean solution(String str, String ending) {
        int endingLength = ending.length();
        int strLength = str.length();
        if(endingLength>strLength) {return false;}
        String newStr = str.substring(strLength-endingLength, strLength);
        return newStr.equals(ending);

    }
    public static String getMiddle(String word) {
        int length = word.length();
        if(length == 0) return null;
        if(length%2 == 0) {
            return word.substring(length/2-1, length/2+1);
        } else {
            return Character.toString(word.charAt(length/2));
        }
    }

    public static boolean getXO (String str) {

        String strToLowerCase = str.toLowerCase();
        System.out.println(str.replace("o","").length());
        int oCounter=0;
        int xCounter=0;
        for(int i=0; i<strToLowerCase.length(); i++){
            if(strToLowerCase.charAt(i)=='x'){
                xCounter++;
            } else if(strToLowerCase.charAt(i)=='o'){
                oCounter++;
            }
        }
        return xCounter==oCounter;

    }

    public static String toJadenCase(String phrase) {


        if (phrase == null || phrase.length() == 0){
            return phrase;
        } else {
            StringBuilder sb = new StringBuilder();
            String[] words = phrase.split(" ");

            for (String word : words) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                sb.append(word);
                sb.append(" ");
            }
            return sb.toString().trim();
        }

    }
}

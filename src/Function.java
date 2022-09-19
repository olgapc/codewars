public class Function {

    /**
     * In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice and digital data communication channels, it still has its use in some applications around the world.
     * The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
     * The Morse code is case-insensitive, traditionally capital letters are used.
     * For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
     * NOTE: Extra spaces before or after the code have no meaning and should be ignored.
     * In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.
     * NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
     * <p>
     * The Morse code table is preloaded for you as a dictionary, feel free to use it:
     * Java: MorseCode.get(".--")
     *
     * @param morseCode a single space is used to separate the character codes and 3 spaces are used to separate words.
     * @return a decoded human-readable string
     */
    public static String decode(String morseCode) {
        StringBuilder sb = new StringBuilder();
        String[] words = morseCode.split("   ");
        for (String word : words) {
            String[] characters = word.split(" ");
            for (String character : characters) {
                sb.append(character); //sb.append(Morsecode.get(character))
            }
            sb.append(" ");
        }


        return sb.toString().trim();
    }


    /**
     * You live in the city of Cartesia where all roads are laid out in a perfect grid.
     * You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
     * The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
     * You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block,
     *
     * @param walk you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
     * @return boolean true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!)
     * and will, of course, return you to your starting point. Return false otherwise.
     */
    public static boolean isValid(char[] walk) {
        int[] position = new int[]{0, 0};
        if (walk.length != 10) {
            return false;
        } else {
            for (int i = 0; i < 10; i++) {
                switch (walk[i]) {
                    case 'n':
                        position[0]++;
                        break;
                    case 's':
                        position[0]--;
                        break;
                    case 'e':
                        position[1]++;
                        break;
                    case 'w':
                        position[1]--;
                        break;
                    default:
                        return false;
                }
            }

        }
        return (0 == position[0] && 0 == position[1]);
    }

    public static String printerErrors(String s) {
        int countWrong = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'm')) {
                countWrong++;
            }
        }
        return countWrong + "/" + s.length();
    }

    public static int digital_root(int n) {
        int sum = 0;
        do {
            sum += n % 10;
            n = n / 10;
        } while (n != 0);
        if (sum >= 10) {
            sum = digital_root(sum);
        }
        return sum;
    }

    public static boolean solution(String str, String ending) {
        int endingLength = ending.length();
        int strLength = str.length();
        if (endingLength > strLength) {
            return false;
        }
        String newStr = str.substring(strLength - endingLength, strLength);
        return newStr.equals(ending);

    }

    public static String getMiddle(String word) {
        int length = word.length();
        if (length == 0) return null;
        if (length % 2 == 0) {
            return word.substring(length / 2 - 1, length / 2 + 1);
        } else {
            return Character.toString(word.charAt(length / 2));
        }
    }

    public static boolean getXO(String str) {

        String strToLowerCase = str.toLowerCase();
        System.out.println(str.replace("o", "").length());
        int oCounter = 0;
        int xCounter = 0;
        for (int i = 0; i < strToLowerCase.length(); i++) {
            if (strToLowerCase.charAt(i) == 'x') {
                xCounter++;
            } else if (strToLowerCase.charAt(i) == 'o') {
                oCounter++;
            }
        }
        return xCounter == oCounter;

    }

    public static String toJadenCase(String phrase) {


        if (phrase == null || phrase.length() == 0) {
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

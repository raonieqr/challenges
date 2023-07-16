public class Kata {
    public static String expandedForm(int num) {
        if (num < 10)
            return Integer.toString(num);

        String numStr = Integer.toString(num);
        String aux = "";
        int len = numStr.length();

        for (int i = 0; i < len; i++) {
            if (i == (len - 1))
                aux += numStr.charAt(i);
            else if (numStr.charAt(i) == '0')
                continue;
            else {
                aux += numStr.charAt(i) + "0".repeat(len - (i + 1)) + " + ";
                if (numStr.substring(i + 1).matches("0+")) {
                    aux = aux.substring(0, aux.lastIndexOf(" + "));
                    break;
                }
            }
        }
        return aux;
    }
}


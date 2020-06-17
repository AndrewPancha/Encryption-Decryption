package encryptdecrypt.action;


public class UnicodeAlgo implements Algo {

    @Override
    public String decrypt(String data, int key) {
        return encrypt(data, 128 - (key % 128));
    }

    @Override
    public String encrypt(String data, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : data.toCharArray()) {
            if (character != ' ') {
                int newChar = ((int)character + key) % 255;
                result.append((char)newChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}

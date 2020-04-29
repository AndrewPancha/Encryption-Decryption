package encryptdecrypt.action;


public class UnicodeAlgo extends EncDecAlgo {

    @Override
    public String decrypt(String data, int key) {
        char[] arr = data.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int newChar = (int)arr[i] - key;
            arr[i] = (char) newChar;
        }

        return new String(arr);
    }

    @Override
    public String encrypt(String data, int key) {
        char[] arr = data.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int newChar = (int)arr[i] + key;
            arr[i] = (char) newChar;
        }

        return new String(arr);
    }
}

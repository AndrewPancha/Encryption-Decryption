package encryptdecrypt.action;

import encryptdecrypt.action.EncDec;

public class Enc implements EncDec {
    private int key;

    public Enc(int key) {
        this.key = key;
    }

    @Override
    public String action(String data) {
        char[] arr = data.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int newChar = (int)arr[i] + key;
            arr[i] = (char) newChar;
        }

        return new String(arr);
    }
}

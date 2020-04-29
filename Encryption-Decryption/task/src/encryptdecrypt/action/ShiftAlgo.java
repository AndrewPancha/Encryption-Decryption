package encryptdecrypt.action;

public class ShiftAlgo extends EncDecAlgo {

    @Override
    public String decrypt(String data, int key) {
        char[] arr = data.toCharArray();
        int mode = 0;
        int newChar = 0;
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 64 && arr[i] < 91) {
                newChar = lowerCase.charAt(lowerCase.indexOf(arr[i]));
                newChar += key % 26;
                arr[i] = lowerCase.charAt(newChar);
            } else {
                newChar = upperCase.charAt(upperCase.indexOf(arr[i]));
                newChar += key % 26;
                arr[i] = upperCase.charAt(newChar);
            }
        }

        return new String(arr);
    }

    @Override
    public String encrypt(String data, int key) {
        char[] arr = data.toCharArray();
        int mode = 0;
        int newChar = 0;
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 64 && arr[i] < 91) {
                newChar = lowerCase.charAt(lowerCase.indexOf(arr[i]));
                newChar -= key % 26;
                arr[i] = lowerCase.charAt(newChar);
            } else {
                newChar = upperCase.charAt(upperCase.indexOf(arr[i]));
                newChar -= key % 26;
                arr[i] = upperCase.charAt(newChar);
            }
        }

        return new String(arr);
    }
}

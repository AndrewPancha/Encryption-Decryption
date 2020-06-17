package encryptdecrypt.action;

public class ShiftAlgo implements Algo {

    @Override
    public String decrypt(String data, int key) {
        return encrypt(data, 26 - (key % 26));
    }

    @Override
    public String encrypt(String data, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : data.toCharArray()) {
            if (character != ' ') {
                if (Character.isLowerCase(character)) {
                    int originalAphPos = character - 'a';
                    int newIndex = (originalAphPos + key) % 26;
                    char newChar = (char)(newIndex + 'a');
                    result.append(newChar);
                }
                if (Character.isUpperCase(character)) {
                    int originalAphPos = character - 'A';
                    int newIndex = (originalAphPos + key) % 26;
                    char newChar = (char)(newIndex + 'A');
                    result.append(newChar);
                }
            } else {
                result.append(character);
            }

        }

        return result.toString();
    }
}

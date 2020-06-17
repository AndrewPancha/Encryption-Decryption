package encryptdecrypt.action;

public interface Algo {
    String encrypt(String data, int key);

    String decrypt(String data, int key);
}

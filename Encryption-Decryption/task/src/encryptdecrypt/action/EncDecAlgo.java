package encryptdecrypt.action;

public abstract class EncDecAlgo {

    abstract String encrypt(String data, int key);

    abstract String decrypt(String data, int key);
}

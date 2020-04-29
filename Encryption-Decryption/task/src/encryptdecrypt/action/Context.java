package encryptdecrypt.action;

public class Context {

    private EncDecAlgo encDecAlgo;

    public void setAlgorithm(String algo) {
        if ("unicode".equals(algo)) {
            encDecAlgo = new UnicodeAlgo();
        }
        if ("shift".equals(algo)) {
            encDecAlgo = new ShiftAlgo();
        }
    }

    public String action(int key, String mode, String data) {
        if ("enc".equals(mode)) {
            encDecAlgo.encrypt(data, key);
        }
        if ("dec".equals(mode)) {
            encDecAlgo.decrypt(data, key);
        }
        return null;
    }
}

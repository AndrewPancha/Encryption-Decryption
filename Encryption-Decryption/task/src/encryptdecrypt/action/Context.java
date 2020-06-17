package encryptdecrypt.action;

import encryptdecrypt.action.*;


public class Context {
    private Algo algorithm;

    public void setAlgorithm(String alg) {
        if ("shift".equals(alg)) {
            algorithm = new ShiftAlgo();
        }
        if ("unicode".equals(alg)) {
            algorithm = new UnicodeAlgo();
        }
    }

    public String action(int key, String mode, String data) {
        String result = "";
        if ("enc".equals(mode)) {
            result = algorithm.encrypt(data, key);
        }
        if ("dec".equals(mode)) {
            result = algorithm.decrypt(data, key);
        }

        return result;
    }
}

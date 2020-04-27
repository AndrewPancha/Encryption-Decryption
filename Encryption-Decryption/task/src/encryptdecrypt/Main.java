package encryptdecrypt;


import encryptdecrypt.action.Dec;
import encryptdecrypt.action.Enc;
import encryptdecrypt.action.EncDec;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static EncDec encDec;
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        String mode = "enc";
        String data = "";
        int key = 0;
        if (list.contains("-mode")) {
            mode = list.get(list.indexOf("-mode") + 1);
        }
        if (list.contains("-key")) {
            key = Integer.parseInt(list.get(list.indexOf("-key") + 1));
        }
        if (list.contains("-data")) {
            data = list.get(list.indexOf("-data") + 1);
        }

        encDec = mode.equals("enc") ? new Enc(key) : new Dec(key);
        String result = encDec.action(data);

    }
}

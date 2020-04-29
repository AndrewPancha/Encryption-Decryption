package encryptdecrypt;


import encryptdecrypt.action.Context;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList(args);
        String mode = "enc";
        String data = "";
        String alg = "shift";
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
        if (list.contains("-alg")) {
            alg = list.get(list.indexOf("-alg") + 1);
        }

        if (!data.isEmpty() && list.contains("-in")) {
            String in = list.get(list.indexOf("-in") + 1);
            try(InputStream fis = new FileInputStream(in)) {
                BufferedReader buf = new BufferedReader(new InputStreamReader(fis));
                data = buf.readLine();
            } catch (Exception e) {

            }
        }

        Context ctx = new Context();
        ctx.setAlgorithm(alg);
        String result = ctx.action(key, mode, data);


        if (list.contains("-out")) {
            String out = list.get(list.indexOf("-out") + 1);
            File file = new File(out);
            file.createNewFile();
            try(FileWriter fw = new FileWriter(file)) {
                fw.write(result);
            } catch (Exception e) {

            }
        } else {
            System.out.println(result);
        }




    }
}

package ejercicios;

import java.util.Scanner;

public class IPHex {
    public static String reqIpAddr = "";
    public static Scanner escan = new Scanner(System.in);

    public static String shieldsquare_IP2Hex() {
        System.out.println("Ingrese valor IP");
        reqIpAddr = escan.nextLine();
        String hex = "";
        String[] part = reqIpAddr.split("[\\.,]");
        if (part.length < 4) {
            return "00000000";
        }
        for (int i = 0; i < 4; i++) {
            int decimal = Integer.parseInt(part[i]);
            if (decimal < 16)
            {
                hex += "0" + String.format("%01X", decimal);
            } else {
                hex += String.format("%01X", decimal);
            }
        }
        return hex;
    }
}

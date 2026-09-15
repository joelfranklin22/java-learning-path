class Ip_Address_V4_V6 {
    public static void main(String[] args) {
        String queryIP = "256.256.256.256";
        System.out.print(validqueryIP(queryIP));
    }

    static String validqueryIP(String queryIP) {
        // queryIP V4 Valid Address
        if (queryIP.contains(".")) {
            String arr[] = queryIP.split("\\.", -1);
            if (arr.length != 4) {
                return "Neither";
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length() == 0) {
                        return "Neither";
                    }
                    if (arr[i].length() > 1 && arr[i].charAt(0) == '0') {
                        return "Neither";
                    }
                    int num;
                    try {
                        num = Integer.parseInt(arr[i]);
                    } catch (NumberFormatException e) {
                        return "Neither";

                    }
                    if (num < 0 || num > 255) {
                        return "Neither";

                    }
                }
            }
            return "IPV4";
        } else if (queryIP.contains(":")) {
            String[] arr = queryIP.split("\\:", -1);
            if (arr.length != 8) {
                return "Neither";
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length() == 0 || arr[i].length() > 4) {
                        return "neither";
                    }
                    for (int j = 0; j < arr[i].length(); j++) {
                        char ch = arr[i].charAt(j);
                        if (!HexaDecimal(ch)) {
                            return "Neither";
                        }
                    }
                }
            }
            return "IPV6";
        }
        return "Neither";
    }

    static boolean HexaDecimal(char ch) {
        if ((ch >= '0' && ch <= '9') ||
                (ch >= 'a' && ch <= 'f') ||
                (ch >= 'A' && ch <= 'F')) {

            return true;
        }
        return false;
    }
}

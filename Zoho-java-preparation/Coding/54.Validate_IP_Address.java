class Validate_IP_Address {
    public static void main(String[] args) {
        String Ip = "01.2.3.4";
        int count = 0;
        String[] arr = Ip.split("\\.", -1);
        if (arr.length != 4) {
            count = 1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() == 0) {
                    count = 1;
                    break;
                }
                if (arr[i].length() > 1 && arr[i].charAt(0) == '0') {
                    count = 1;
                    break;
                }
                int num;
                try {
                    num = Integer.parseInt(arr[i]);
                } catch (NumberFormatException e) {
                    count = 1;
                    break;
                }
                if (num < 0 || num > 255) {
                    count = 1;
                    break;
                }
            }
        }
        if (count == 0)
            System.out.println(true);
        else
            System.out.print(false);
    }
}

class test {
    public static void main(String[] args) {
        System.out.println("Hello World inside static main");
    }
}

void main() {
    System.out.println("Hello World inside void main");
    test.main(new String[]{});   // 👈 call it explicitly
}
package mypackage;

class Hi {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide command-line arguments.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}

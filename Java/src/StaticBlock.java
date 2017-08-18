class StaticBlock {


    /*Static block can be used to check conditions before execution of main begin,
     * Suppose we have developed an application which runs only on Windows operating system then we need
     * to check what operating system is installed on user machine. In our java code we check what operating
     * system user is using if user is using operating system other than "Windows" then the program terminates.
     */
    public static void main(String[] args) {
        System.out.println("You are using Windows_NT operating system.");
    }

    static {
        String os = System.getenv("OS");
        System.out.println(os);

        if (os.equals("Windows_NT") != true) {
            System.exit(1);
        }
    }
}
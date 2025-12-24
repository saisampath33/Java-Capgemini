class LocalAndGlobal {
    int global = 10;

    void show() {

        int local = 30;

        System.out.println("Local Variable: " + local);
        System.out.println("Instance/Global Variable: " + global);
    }
    public static void main(String[] args) {
        LocalAndGlobal obj = new LocalAndGlobal();
        obj.show();
		final int a = 20;
		System.out.println("Final Vraiable: " +a);
    }
}

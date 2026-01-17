package ObjectClass;

class finalize_method {

    @Override
    protected void finalize() {
        System.out.println("Object is destroyed");
    }

    public static void main(String[] args) {
    	finalize_method d = new finalize_method();
        d = null;   // object eligible for GC
        System.gc(); // request GC
    }
}

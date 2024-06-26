public class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

public class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }

    public static void main(String[] args) {
        B objB = new B();
        String result = objB.meth();
        System.out.println(result);  // This will print "Method is overridden in Extended class B"
    }
}

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0001 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0001 obj = new Central0001();
        System.out.println("main");
        obj.aaa();
    }
}

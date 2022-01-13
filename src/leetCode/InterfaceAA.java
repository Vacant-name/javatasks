package leetCode;

public class InterfaceAA {
    public static void main(String[] argv){
        System.out.println(new D().a());
    }
}
interface AA {
    int a();
}

class A implements AA {
    public int a() {
        return 1;
    }
}

class B implements AA {
    public int a() {
        return 1;
    }
}

class D implements AA {
    public int a() {
        return new A().a() + new B().a();
    }
}

import singleton.DoubleCheckedLocking;
import singleton.EagerInitialization;
import singleton.LazyInitialization;
import singleton.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Eager Initialization");
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();

        System.out.println(eagerInitialization1.hashCode());
        System.out.println(eagerInitialization2.hashCode());


        System.out.println("Lazy Initialization");
        LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
        System.out.println(lazyInitialization1.hashCode());
        System.out.println(lazyInitialization2.hashCode());

        System.out.println("ThreadSafeSingleton");

        ThreadSafeSingleton threadSafeSingleton1= ThreadSafeSingleton.getThreadSafeSingleton();
        ThreadSafeSingleton threadSafeSingleton2= ThreadSafeSingleton.getThreadSafeSingleton();
        System.out.println(threadSafeSingleton1.hashCode());
        System.out.println(threadSafeSingleton2.hashCode());

        System.out.println("DoubleCheckedLocking");

        DoubleCheckedLocking doubleCheckedLocking1= DoubleCheckedLocking.getDoubleCheckedLocking();
        DoubleCheckedLocking doubleCheckedLocking2= DoubleCheckedLocking.getDoubleCheckedLocking();
        System.out.println(doubleCheckedLocking1.hashCode());
        System.out.println(doubleCheckedLocking2.hashCode());
    }
}
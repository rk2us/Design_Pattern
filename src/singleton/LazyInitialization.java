package singleton;

public class LazyInitialization {

    private static LazyInitialization Instance;

    private LazyInitialization(){

    }

    public static LazyInitialization getInstance(){

        if (Instance == null) {

            Instance = new LazyInitialization();

        }
        return Instance;
    }
}

package pl.touk.sputnik;

public class Test {

    public boolean test = false;

    public int method() {
        String str = null;
        if (test) {
            return 1;
        }
        return str.toUpperCase().length();
    }

}

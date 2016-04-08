package pl.touk.sputnik;

public class Test {

    public boolean test = false;

    public int method() {
        if (test) {
					if(test = false) {
            return 1;
					}
        }
        return 2;
    }

}

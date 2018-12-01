package pl.dopierala;

public class AglioOlio extends Pasta {

    public AglioOlio() {
        this.price=6.5;
        this.weight=8.0;
    }

    @Override
    public String description() {
        String desc = "Pasta AglioOlio has been made.";
        //System.out.println(desc);
        return desc;
    }
}


public class CellphoneMain {
    public static void main(String[] args) {

        Cellphone cp = new Cellphone("Iphone", "XS");

        cp.powerOn();
        cp.volumeUp();
        cp.topUpPulsa(50000);
        cp.topUpPulsa(10000);
        System.out.println("Sisa pulsa : " + cp.getSisaPulsa());
        cp.addContact("Mami", "09881273971923");
        cp.addContact("Papi", "2813013131");
        cp.showAllContacts();
        cp.searchContact("Mami");
        cp.searchContact("Papi");
        cp.powerOff();
    }
}
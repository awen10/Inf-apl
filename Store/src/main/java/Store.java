
import java.util.ArrayList;
import java.util.*;

public class Store {

    private String name;
    private Stock stock;
    public List<CashRegister> CR;
    public List<Seller> seller;
    public List<Administrator> admin;

    public Store(String name) {
        this.name = name;
        CR = new ArrayList<CashRegister>();
        seller = new ArrayList<Seller>();
        admin = new ArrayList<Administrator>();
    }

    public void AddNewCashRegister(int crNo) {
        CR.add(new CashRegister(crNo));
    }

    public void AddNewSeller(String name, String phoneNo, String address) {
        seller.add(new Seller(name, phoneNo, address));
    }

    public void AddNewAdmin(String name, String phoneNo, String address) {
        admin.add(new Administrator(name, phoneNo, address));
    }
}

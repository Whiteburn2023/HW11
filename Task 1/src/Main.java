public class Main {
    public static void main(String[] args) {
        //Phone motorola = new Phone(79001234567, "nts-95", 130);
        Phone mobila = new Phone("79007654321", "sat44", 99, "Bob");
        Phone zvonilka = new Phone("79001234567", "nokia3310", 121,"Lusa");
        Phone.countryMadePhone = "China";

        mobila.receiveCall("Marly");
        zvonilka.receiveCall("Brendon");


    }
}

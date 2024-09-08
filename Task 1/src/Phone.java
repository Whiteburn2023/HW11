import java.util.Objects;

public class Phone {
    static String countryMadePhone;

    String numberPhone;
    String modelPhone;
    int weightPhone;
    String nameAbonent;

    public Phone() {
    }

    public Phone(String numberPhone, String modelPhone, int weightPhone, String nameAbonent) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
        this.nameAbonent = nameAbonent;
    }

    public void receiveCall(String nameAbonent){
        receiveCall(nameAbonent, numberPhone);
    }
    public void receiveCall(String nameAbonent,String numberPhone){
        System.out.println("Звонит абонент по имени " + nameAbonent + (Objects.equals(numberPhone, "") ? "" : " номером " + numberPhone));
    }


}


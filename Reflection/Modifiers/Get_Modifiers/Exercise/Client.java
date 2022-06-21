package Reflection.Modifiers.Get_Modifiers.Exercise;

public class Client {
     int id;
     String firstName;
     String lastNaame;
     String address;

    public Client(int id, String firstName, String lastNaame, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastNaame = lastNaame;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNaame() {
        return lastNaame;
    }

    public void setLastNaame(String lastNaame) {
        this.lastNaame = lastNaame;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNaame='" + lastNaame + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package sample;

public class Friend {
    private String name;
    private int age;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Friend(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name;
    }


}


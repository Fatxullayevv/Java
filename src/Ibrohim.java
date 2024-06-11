public class Ibrohim {
String name ;
String surname;

    public  Ibrohim() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Ibrohim{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               '}';
    }
}

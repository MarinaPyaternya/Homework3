package homework3;

public class Main {
    public static void main (String[] args){
        Destination destination = new Destination ();
        System.out.println(destination);
        Destination destination2 = new Destination("Ivan", "Ivanov", "student", 256641258);
        System.out.println(destination2);

        System.out.println(destination2.getName());
        System.out.println(destination2.getSurname());
        System.out.println(destination2.getSocialStatus());
        System.out.println(destination2.getNumberPhone());

        destination.setName("Mark");
        destination.setSurname("Tven");
        destination.setSocialStatus("Writer");
        destination.setNumberPhone(45688556);
        System.out.println(destination);
    }

}

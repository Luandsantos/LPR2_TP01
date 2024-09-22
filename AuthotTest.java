public class AuthotTest {
    public static void main(String[] args) {
        Author autor1 = new Author("Joseph", "josephazedo2@gmail.com", 'm');

        System.out.println(autor1.toString());

        autor1.setEmail("josephazevedo2@gmail.com");

        System.out.println(autor1.getName());
        System.out.println(autor1.getEmail());
        System.out.println(autor1.getGender());
    }
}

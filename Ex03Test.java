public class Ex03Test {
    public static void main(String[] args) {
        Person pessoa1 = new Person("Gabriel", "Limoeiro Rua 29");
        System.out.println(pessoa1.toString() + "\n");

        Student aluno1 = new Student("Victor", "Rua Marechal Deodoro 11", "Program 1", 3, 1200);
        System.out.println(aluno1.toString());
        aluno1.setAddress("Rua Marechal Deodoro 12");
        aluno1.setProgram("Program 2");
        aluno1.setFee(1100);
        System.out.println(aluno1.toString() + "\n");

        Student aluno2 = new Student("Christian", "Rua Dr. Hermerson 155", "Program 6", 2, 900);
        aluno2.getAddress();
        aluno2.getProgram();
        System.out.println("Ano do aluno 2: " + aluno2.getYear());
        System.out.println("Taxa do aluno 2: " + aluno2.getFee() + "\n");

        Staff staff1 = new Staff("Vinicius", "Rua Jardim Masqueiro 12", "Escola Nova Esperança", 1500);
        System.out.println(staff1.toString());
        staff1.setAddress("Rua Bom Caminho 24");
        staff1.setSchool("Escola Futuro Brilhante");
        staff1.setPay(1900);
        System.out.println(staff1.toString() + "\n");

        Staff staff2 = new Staff("Gustavo", "Rua Prédio Azul 1", "Escola Academia", 2500);
        staff2.getAddress();
        System.out.println("Escola do staff 2: " + staff2.getSchool());
        System.out.println("Pagamento do staff 2: " + staff2.getPay());

    }

}

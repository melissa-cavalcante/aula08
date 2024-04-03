public class App {
    public static void main(String[] args) throws Exception {
        //toda vez é criado um construtor é obrigatório preencher os dados na sequência criada no construtor
        //Aluno alice = new Aluno(2321024, "melissa", "111.222.333-44");
        //Aluno alan = new Aluno();
        Turma t = new Turma();
        t.validaPeriodo("Noturno");

        System.out.println(t.getPeriodo());

        //alice.setRa(123);//set para atribuir um valor ao ra
        //alice.setNome("Alice Silva");
        //alice.setCpf("111.222.333-44");
        //String nome = alice.getNome();
        

        //System.out.println(alice.getRa());//get é feito atraves do system
        //System.out.println(nome);
        //System.out.println(alan.getNome());
        //System.out.println(alice.getCpf());
    }
}

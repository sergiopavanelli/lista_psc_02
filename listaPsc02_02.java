import java.util.Scanner;

public class listaPsc02_02 {
    public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

String nome;
String senha;

do {

    System.out.println("Digite o nome de usuário:");
    nome = teclado.nextLine();
    System.out.println("Digite a senha:");
    senha = teclado.nextLine();

    if (nome.equals(senha)) {

    System.out.println("A senha não pode ser igual ao nome do usário!");

}

} while (nome.equals(senha));

teclado.close();

    System.out.println("Usuário e senha cadastrados com sucesso.");

}
}

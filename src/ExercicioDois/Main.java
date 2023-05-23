package ExercicioDois;

public class Main {
    public static void main(String[] args) {

        Bliblioteca livro = new Bliblioteca();
        livro.registrarLivro(12131415);

        Bliblioteca livro2 = new Bliblioteca();
        livro2.registrarLivro(20212345, "Escravidão");

        Bliblioteca livro3 = new Bliblioteca();
        livro3.registrarLivro(12132023,"Mais esperto que o diabo", "Autoajuda");

        Bliblioteca livro4 = new Bliblioteca();
        livro4.registrarLivro(25272829, "Minha história", "biografia", "Michelle Obama");



    }
}
package ExercicioDois;

public class Bliblioteca {
    public String nomeLivro;
    public int isbn;
    public String genero;
    public String nomeAutor;

    public void registrarLivro(int isbn){
        System.out.println("O livro foi registrado com isbn: " + isbn);
    }

    public void registrarLivro(int isbn, String nomeLivro){
        System.out.println("O livro foi registrado com isbn: " + isbn + " e o nome: " + nomeLivro);
    }
    public void registrarLivro(int isbn, String nomeLivro, String genero){
        System.out.println("O livro foi registrado com isbn: " + isbn + ", nome: " + nomeLivro + " e genero: " + genero);
    }
    public void registrarLivro(int isbn, String nomeLivro, String genero, String nomeAutor){
        System.out.println("O livro foi registrado com todos os atributos");
    }


}

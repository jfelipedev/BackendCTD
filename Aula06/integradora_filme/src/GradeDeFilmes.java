public class GradeDeFilmes implements IGradeDeFilmes{

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        Filme f = null;

        switch (nomeDoFilme) {
            case "The Batman":
                f = new Filme("The Batman", "Argentina", "www.thebatman.com");
                break;
            case "His House":
                f = new Filme("His House", "Brasil", "www.hishouser.com");
                break;
            case "Navillera":
                f = new Filme("Navillera", "Colombia", "www.navillera.com");
                break;
            case "Love of Siam":
                f = new Filme("Love of Siam", "Brasil", "www.loveofsiam.com");
                break;
        }
        return f;
    }
}
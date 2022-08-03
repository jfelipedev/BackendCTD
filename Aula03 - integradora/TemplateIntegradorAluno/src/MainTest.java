import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;

    Estagiario estg1, estg2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);

        estg1 = new Estagiario("Felipe");
        estg1.vender(10);

        estg2 = new Estagiario("Mayara");
        estg2.vender(10);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
        System.out.println(estg1.mostrarCategoria());
        System.out.println(estg2.mostrarCategoria());

        assertEquals("O vendedor Pedro tem 20 pontos e esta na categoria Aprendiz",func1.mostrarCategoria());
        assertEquals("O vendedor Maria tem 5 pontos e esta na categoria Novato",func2.mostrarCategoria());
        assertEquals("O vendedor Ramon tem 60 pontos e esta na categoria Mestre",afi1.mostrarCategoria());
        assertEquals("O vendedor Paulo tem 15 pontos e esta na categoria Novato",afi2.mostrarCategoria());
        assertEquals("O vendedor José tem 0 pontos e esta na categoria Novato",afi3.mostrarCategoria());
        assertEquals("O vendedor Felipe tem 50 pontos e esta na categoria Estagiario Experiente",estg1.mostrarCategoria());
        assertEquals("O vendedor Mayara tem 50 pontos e esta na categoria Estagiario Experiente",estg2.mostrarCategoria());
    }


}
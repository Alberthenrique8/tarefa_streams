package br.com.Albert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeiroTest {

    @Test
    public void CriandoTest() {

        Pessoas p = new Pessoas("Ana", "Mulher");

        assertEquals("Ana", p.getNome());
        assertEqauls("Mulher",p.getSexo());
    }

    private void assertEqauls(String mulher, String sexo) {
    }
}

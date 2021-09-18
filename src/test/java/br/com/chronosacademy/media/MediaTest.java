package br.com.chronosacademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {

    @Test
    public void validaAprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(7.6, 8.0);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(3.7, 7.0);
        assertEquals("Reprovado", resultado);
    }
}
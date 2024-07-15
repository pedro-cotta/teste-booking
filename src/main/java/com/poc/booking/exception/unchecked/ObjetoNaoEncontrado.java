package com.poc.booking.exception.unchecked;

public class ObjetoNaoEncontrado extends RuntimeException {

    public ObjetoNaoEncontrado(String mensagem) {
        super(mensagem);
    }

}

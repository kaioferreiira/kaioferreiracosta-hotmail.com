package br.com.wallet.business.exception.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String s) {
        super(s);
    }
}

package org.jinn.coca.interpreters.lox;

public class RuntimeError extends RuntimeException{
    final Token token;

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public RuntimeError(String message, Token token) {
        super(message);
        this.token = token;
    }
}

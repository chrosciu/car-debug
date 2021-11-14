package com.chrosciu;

import java.util.Scanner;

class InputReader {
    private final Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    public boolean hasToken() {
        return scanner.hasNext();
    }

    public String getToken() {
        return scanner.next();
    }
}

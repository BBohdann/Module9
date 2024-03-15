package org.example;

import httpmanager.HttpImageStatusCli;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new HttpImageStatusCli().askStatus();
    }
}

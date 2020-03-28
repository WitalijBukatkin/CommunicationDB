package ru.argustelecom.task.witalijbukatkin;

import static ru.argustelecom.task.witalijbukatkin.util.EntityManagerUtil.*;

public class Main {

    public static void main(String[] args) {
        if(getEntityManager().isOpen()) {
            run();
        }

        shutdown();
    }

    public static void run(){

    }
}

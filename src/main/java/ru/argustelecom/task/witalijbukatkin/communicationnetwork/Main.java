/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.communicationnetwork;

import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Connector;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Link;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity.Node;
import ru.argustelecom.task.witalijbukatkin.communicationnetwork.util.EntityManagerUtil;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        if(EntityManagerUtil.getEntityManager().isOpen()) {
            run();
        }

        EntityManagerUtil.shutdown();
    }

    public static void run(){
        Stream.of(Node.class, Connector.class, Link.class)
                .forEach(type -> {
                    System.out.println("------- " + type.getSimpleName().toUpperCase() + " --------");

                    EntityManagerUtil.getEntityManager()
                            .createQuery("FROM " + type.getSimpleName(), type)
                            .getResultList()
                            .forEach(System.out::println);

                    System.out.println("\n");
                });
    }
}

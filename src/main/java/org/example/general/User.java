package org.example.general;

public interface User {
    boolean isUnknown();
    boolean isAstronaut();
    boolean isCommander();

    Rank getRank();
}

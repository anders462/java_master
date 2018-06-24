package com.example.game;

import java.util.List;

public interface ISaveAble {
    List write();
    void read(List<String> savedValues);
}

package org.example.comments.ch03.c1_remove_superfluous_comment.problem;

import org.example.general.Supply;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    // 필드(하나만 있음)
    List<Supply> supplies = new ArrayList<>(); // 제품 리스트

    // 메서드
    int countContaminatedSupplies() {
        // TODO: 필드가 이미 초기화 되었는지(널이 아닌지) 검증한다

        int contaminatedCounter = 0; // 카운터
        // 제품이 없으면 변질도 없다는 뜻이다
        for(Supply supply : supplies) { // FOR 시작
            if (supply.isContaminated()) {
                contaminatedCounter++; // 카운터를 증가시킨다
            } // 제품이 변질되었으면 IF 끕
        } // FOR 끝

        // 변질된 제품 개수를 반환하다.
        return contaminatedCounter; // 유의해 처리한다!
    }
} // Inventory 클래스 끝
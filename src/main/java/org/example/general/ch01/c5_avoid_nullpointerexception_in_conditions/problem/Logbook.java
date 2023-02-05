package org.example.general.ch01.avoid_nullpointerexception_in_conditions_1_5.problem;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

// Logbook은 파일에 메시지를 기록합니다. location 인수로 명시한 파일 시스템 내 특정 파일에 로그 메시지를 정리하죠.
// 메시지가 올바른지 확인해야 하니 매개변수 검증을 수행해야 합니다.
// 매개변수 검증이 필요

/*
* 관련 지식
* 1.Dir Path File IO(NIO)
* 2.Exception
* 3.String Method
*
 */
public class Logbook {

    // 아래 메서드는 유효성 검사를 일부 수행하고 있습니다. 하지만 두 가지 심각한 문제를 안고 있음
    // 1. null 참조를 올바르게 확인하지 않습니다. location이 null이면 Files.isDirectory()는 별다를 설명없이 NullPointerException
    //   과 함께 실패합니다., message 가  null이면 ?
    void writeMessage(String message, Path location) throws IOException {
        if (Files.isDirectory(location)) {
            throw new IllegalArgumentException("The path is invalid!");
        }
        if (message.trim().equals("") || message == null) {
            throw new IllegalArgumentException(("the message is invalid"));
        }
        String entry = LocalDate.now() + ": " + message;
        Files.write(location, Collections.singleton(entry),
                StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}

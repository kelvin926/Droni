package com.lalaalal.droni;

import androidx.annotation.Nullable;

public class DroniException extends Exception {
    public static final String NO_RESPONSE = "응답 없음 ㅠ";
    public static final String CONNECTION_FAILED = "연결 실패 ㅠ";

    private String msg;

    public DroniException(String msg) {
        this.msg = msg;
    }

    @Nullable
    @Override
    public String getMessage() {
        return "" + msg;
    }
}

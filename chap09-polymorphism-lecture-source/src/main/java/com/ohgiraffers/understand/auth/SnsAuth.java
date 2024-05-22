package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO);
}

package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class NaverAuth implements SnsAuth{

    MemberDTO memberDTO1 = new MemberDTO("naver","naver");
    @Override
    public boolean login(MemberDTO memberDTO) {
        if (memberDTO1.getId().equals(memberDTO.getId()) && memberDTO1.getPwd().equals(memberDTO.getPwd())){
            return true;
        }else{
            return false;
        }
    }
}

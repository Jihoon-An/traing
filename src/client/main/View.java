package client.main;

import java.util.Scanner;

public class View {


    public void view() {

        System.out.println("<<로그인 회원가입>>");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("3. 정보조회");
        System.out.println("0. 종료");

        if(menu == 1) {
            System.out.println("<<로그인>>");

            System.out.print("아이디 : ");

            System.out.print("비밀번호 : ");



        }else if(menu == 2) {
            System.out.println("<<회원가입>>");

            System.out.print("아이디 : ");

            System.out.print("비밀번호 : ");

            System.out.print("이름 : ");



        }else if(menu == 3) {
            System.out.println("<<정보조회>>");


        }else if(menu == 0) {
            System.exit(0);

        }else {
            System.out.println("메뉴를 다시 확인해주세요.");
        }
    }
}
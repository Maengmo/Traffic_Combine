package com.test.user;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import com.test.project.Main;

public class user_MypageService {
   
   public static void myPage() {
      
      //회원 정보 출력
      Scanner scan = new Scanner(System.in);
      boolean loop = true;
      
      
      while (loop) {
         
         String sel = MypageUI.mainUI();
         
         if (sel.equals("1")) {
            System.out.println();
            System.out.print("탈퇴 하시겠습니까? (y/n) : ");
            sel = scan.nextLine();
            
            if (sel.equals("y")) {
               
               System.out.println();
               user_data.userWithdraw(user_Service.LOGIN_NOW);
               user_data.save();
               System.out.println("[ 탈퇴 완료 ]");
               System.out.println("처음 화면으로 돌아가고 싶다면 Enter를 누르세요");
               String back = scan.nextLine();
               
               if (back.equals("")) {
                  //처음화면으로
                  loop=false;
                  com.test.project.Main.main(null);

               }
               
            } else if (sel.equals("n")) {
               System.out.println();
               System.out.println("** 이전 화면으로 돌아갑니다. **");
            }
         } else if (sel.equals("")) {
            
            loop = false;
            
         } else {
            System.out.println();
            System.out.println("다른 숫자를 입력해주세요. ");
            
         }
      }
   }

}

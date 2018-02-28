package com.firdavs.messaging.oop.p1;

import com.firdavs.messaging.oop.p2.C2;

public class B1 {
    public static void main(String[] args) {
        System.out.println("A1.default member "+A1.defaultMember);
        System.out.println("C1.default member "+C1.defaultMember);

        System.out.println("A1.protected member "+A1.protectedMember);
        System.out.println("C1.protected member "+C1.protectedMember );
        System.out.println("C2.protected member "+ C2.protectedMember );

        System.out.println("A1.public member "+A1.publicMember );
        System.out.println("C1.ublic member "+C1.publicMember);



    }
}

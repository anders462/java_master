package com.andben;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;

        timsPhone = new DeskPhone(12345678);

        timsPhone.powerOn();
        timsPhone.answer();
        timsPhone.callPhone(12345678);
        boolean ringing = timsPhone.isRinging();
        if (ringing) {
            System.out.println("Tim's phone ringing");
        }

      timsPhone = new MobilePhone(41581012);

      timsPhone.powerOn();
      timsPhone.callPhone(41581012);
      timsPhone.answer();


    }
}

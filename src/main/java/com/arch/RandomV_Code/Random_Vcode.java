package com.arch.RandomV_Code;

import java.util.Random;

public class Random_Vcode {	

    Random V_Codes;

    public String Genetate()
    {
        String Code;
        Random f =new Random();
        int t= f.nextInt();
        System.out.println(t);
        for (int s=0;s>t;s++)
{
    t= f.nextInt();

}

        if(t<0){
            t=t+999999999;
        }

        Code=Integer.toString(t);
        return  Code;
    }

}

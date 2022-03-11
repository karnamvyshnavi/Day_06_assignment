package com.bridgelabz;

public class Couponcode {
        public static void main(String args[]) {
            char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
            int max = 100000000;
            int random = (int)(Math.random()*max);
            System.out.println(random);
            StringBuffer buff = new StringBuffer();
            while (random > 0){
              buff.append(chars[random % chars.length]) ;
                random /= chars.length;
                System.out.println("chars length is"+" "+chars.length);
                System.out.println("random is"+" "+random);
            }
            String coupen = buff.toString();
            System.out.println("Coupen code : "+coupen);
        }

}

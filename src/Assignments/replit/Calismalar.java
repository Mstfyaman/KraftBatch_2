package Assignments.replit;

import java.util.*;

public class Calismalar {


    public static void main(String[] args) {


        String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";

        String[] samsungArr = str.split("samsung,'");
       // System.out.print(Arrays.toString(samsungArr));
        Map<String,String> samsungMap= new TreeMap<>();

        for (int i = 1; i < samsungArr.length; i++) {
            String[] samsungArr2 = samsungArr[i].split("',");
            samsungMap.put(samsungArr2[1],samsungArr2[0]);
        }

        Iterator<String> iterator = samsungMap.keySet().iterator();
        Iterator<String> iterator1 = samsungMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println("samsung,'"+iterator1.next()+"',"+iterator.next());
        }


    }
}









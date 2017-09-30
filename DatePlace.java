package com.company;

import java.util.*;

public class DatePlace {

    String yes = "Y";
    String no = "N";

    public void getDestinations(){
        String[] arr = new String[3];
        arr[0] = "Movie Theater";
        arr[1] = "Aquarium";
        arr[2] = "Hookah Lounge";


        //public void yes(String x){
        int i = 0;
        while(i < arr.length){
            //if(arr[i].equals)
            System.out.println(arr[i]);
            i++;

        }
        System.out.print("Choose place: ");
        Scanner scan= new Scanner(System.in);
        String place= scan.nextLine();
        choose(place, arr);


    }

    public void choose(String place,String[] array){
        for(int i=0;i < array.length;i++){
            if(array[i].equals(place)){
                System.out.print("yes i choose this place to go out with you:"+array[i]);
            }
        }

    }

}
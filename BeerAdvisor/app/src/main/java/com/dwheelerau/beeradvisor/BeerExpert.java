package com.dwheelerau.beeradvisor;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Dave on 16-Jan-16.
 */
public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack amber");
            brands.add("Red moose");
        }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}

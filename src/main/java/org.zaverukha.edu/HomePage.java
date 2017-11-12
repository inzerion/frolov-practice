package org.zaverukha.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alexanderzaverukha on 11/12/17.
 */
public class HomePage {
    List<String> news = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");

    public  List<String> getNews(){
        return this.news;
    }
 }

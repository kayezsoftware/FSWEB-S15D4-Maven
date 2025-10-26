package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object element) {
        // Aynı elemana izin verme
        if(!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    public void sort(){
        // İçerik sayılardan oluşuyorsa doğru sıralar, String ise alfabetik sıralar
        Collections.sort((ArrayList) this);
    }

    @Override
    public boolean remove(Object element){
        // Elemanı listeden tamamen sil
        boolean removed = super.remove(element);

        // Tekrar eden benzer elemanlar varsa hepsini sil
        while(super.remove(element)){}

        // Listeyi yeniden sırala
        this.sort();

        return removed;
    }
}

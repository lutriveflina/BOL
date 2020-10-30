package com.ol.binus;

import java.util.Comparator;

public class MahasiswaComporator implements Comparator<Mahasiswa> {

    @Override
    public int compare(Mahasiswa o1, Mahasiswa o2) {
        int comparingIpk = Double.compare(o2.getIpk(), o1.getIpk());
        int comparingName = o1.getNama().compareTo(o2.getNama());
        int comparingNim = o1.getNim().compareTo(o2.getNim());

        if (comparingIpk == 0)// jika nilai IPK sama maka akan dilakukan komparasi berdasarkan nama sesuai urutan abjad
            return comparingName;
        else if (comparingName == 0) //jika nama sama akan dilakukan komparasi berdasarkan nim.
            return comparingNim;
        else
            return comparingIpk;
    }
}

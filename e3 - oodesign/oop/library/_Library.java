package com.nbicocchi.exercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class _Library {
    ArrayList<_Rent> rents;

    //  constructor
    public _Library() {
        rents = new ArrayList<>();
    }

    //  -- custom --
    public boolean addRent(_Rent rent) {
        return rents.add(rent);
    }

    public boolean removeRent(_Rent rent) {
        return rents.remove(rent);
    }

    public ArrayList<_Rent> getExpired(LocalDate now) {
        ArrayList<_Rent> expRents = new ArrayList<>();

        for (_Rent rent : rents)
            if (rent.isExpired(now))
                expRents.add(rent);

        return expRents;
    }


}

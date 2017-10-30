package com.example.cspeir.collegeapp;

import android.nfc.Tag;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;

/**
 * Created by bleitzel on 10/20/2017.
 */

public class Family {
    private static final String Tag = Family.class.getName();
    private static ArrayList<FamilyMember> mFamily;
    private Family sFamily;

    private Family() {
        mFamily = new ArrayList<>();
        Guardian mom = new Guardian("my", "Mom");
        Guardian dad = new Guardian("my", "Dad");
        mFamily.add(mom);
        mFamily.add(dad);
    }
    public Family get() {
        if (sFamily == null) {
            sFamily = new Family();
        }

        return sFamily;
    }
    private void setFamily(ArrayList<FamilyMember> familylist){

    }
    public ArrayList<FamilyMember> getFamily(){
        return mFamily;
    }
}

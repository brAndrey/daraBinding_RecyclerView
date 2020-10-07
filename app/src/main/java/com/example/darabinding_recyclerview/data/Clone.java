package com.example.darabinding_recyclerview.data;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.darabinding_recyclerview.BR;

public class Clone extends BaseObservable {

        private int nomber;
        private String name;
        private int age;
        private String adress;
        private boolean sex;

        public Clone() {
        }

        public Clone(int nomber, String name, int age, String adress, boolean sex) {
            this.nomber = nomber;
            this.name = name;
            this.age = age;
            this.adress = adress;
            this.sex = sex;
        }

        public int getNomber() {return nomber;}

        public void setNomber(int nomber) {
            this.nomber = nomber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            Log.e("adress "," "+adress);
            this.adress = adress;
        }

        @Bindable
        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
            Log.e("setSex "," "+sex);
            notifyPropertyChanged(BR.sex);
        }

        @Override
    public String toString() {
        return "Clone{" +
                "nomber=" + nomber +
                ", name=" + name +
                ",age =" + age +
                ",adress =" +adress +
                ", sex=" + sex+
                '}';

    }

}

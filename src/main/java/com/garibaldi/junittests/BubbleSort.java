package com.garibaldi.junittests;

import java.util.List;


public class BubbleSort {

    int[] list;

    public BubbleSort(int[] list) {
        this.list = list;
    }

    public void sort() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = i + 1; j < this.list.length; j++) {
                if (this.list[j] < this.list[i]) {
                    int aux = list[j];
                    this.list[j] = this.list[i];
                    this.list[i] = aux;
                }
            }
        }
    }

}


package example.s181860011.code;

import example.Sorter;

public class InsertionSorter implements Sorter{
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]<a[j]){
                    swap(i, j);
                }
            }
        }


    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}

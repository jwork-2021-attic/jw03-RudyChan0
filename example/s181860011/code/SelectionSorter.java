package example.s181860011.code;

import example.Sorter;

public class SelectionSorter implements Sorter{
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
        for(int i=0;i<a.length-1;i++){
            int min=a[i];
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    index=j;
                    min=a[j];
                }
            }
            swap(i, index);
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}

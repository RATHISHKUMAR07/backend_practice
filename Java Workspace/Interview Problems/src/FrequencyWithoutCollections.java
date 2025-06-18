class Data1 {
    int val;
    int count;
    int pos;

    Data1(int val, int count, int pos) {
        this.val = val;
        this.count = count;
        this.pos = pos;
    }
}

public class FrequencyWithoutCollections {
    private Data1[] dataStore;
    private int size;

    public FrequencyWithoutCollections() {
        dataStore = new Data1[10]; // initial capacity
        size = 0;
    }

    private void ensureCapacity() {
        if (size == dataStore.length) {
            // Resize the array when it reaches capacity
            Data1[] newDataStore = new Data1[dataStore.length * 2];
            System.arraycopy(dataStore, 0, newDataStore, 0, dataStore.length);
            dataStore = newDataStore;
        }
    }

    private int findIndex(int value) {
        for (int i = 0; i < size; i++) {
            if (dataStore[i].val == value) {
                return i;
            }
        }
        return -1;
    }

    public void updateOrAddData(int value, int position) {
        int index = findIndex(value);
        if (index != -1) { // Value exists
            dataStore[index].count++;
        } else { // New value
            ensureCapacity();
            dataStore[size++] = new Data1(value, 1, position);
        }
    }

    public void sortData() {
        // Simple insertion sort
        for (int i = 0; i < size; i++) {
            Data1 key = dataStore[i];
            int j = i - 1;

            while (j >= 0 && (dataStore[j].count < key.count ||
                   (dataStore[j].count == key.count && dataStore[j].pos > key.pos))) {
                dataStore[j + 1] = dataStore[j];
                j--;
            }
            dataStore[j + 1] = key;
        }
        
   
    }

    public void printData() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < dataStore[i].count; j++) {
                System.out.print(dataStore[i].val + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	FrequencyWithoutCollections f = new FrequencyWithoutCollections();
//		int arr[] = {-1,4,3,3,1,5,-1021033,101,101,22,3,1010101,500,500,2,3,3,1,4,1000,770,4,4,6,2};
    	int arr[] = {5,2,3,3,1,4,4,4,6,2};
        for (int i = 0; i < arr.length; i++) {
            f.updateOrAddData(arr[i], i);
        }

        f.sortData();
        f.printData();
    }
}

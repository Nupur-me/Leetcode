class MyHashMap {
    
    LinkedList<Entry>[] bucket;
    final int SIZE = 1009; // larger prime number
 
    class Entry{
            int key;
            int val;
            public Entry(int key, int val){
                this.key = key;
                this.val = val;
            }
        }
 
    public MyHashMap() {
        bucket = new LinkedList[SIZE];
        for (int i = 0;i<bucket.length;i++)
            bucket[i] = new LinkedList<Entry>();
    }
    
  
    public void put(int key, int value) {
        int index = getHash(key); 
        LinkedList<Entry> entryLink = bucket[index]; 
        if (get(key) != -1) remove(key);   
        Entry entry = new Entry(key, value); 
        entryLink.add(entry);    
    }
    
    
    public int get(int key) {
        int index = getHash(key);
        LinkedList<Entry> entryLink = bucket[index]; 
        Iterator<Entry> it = entryLink.iterator();
        while(it.hasNext()){
           Entry entry = it.next();
           if(entry.key == key) return entry.val;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getHash(key);
        LinkedList<Entry> entryLink = bucket[index]; 
        Iterator<Entry> it = entryLink.iterator();
        while(it.hasNext()){
           Entry entry = it.next();
           if(entry.key == key) it.remove();
        }
    }
    
    public int getHash(int key){
        return key % SIZE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
class MyHashMap {
    private int size = 1000001;
    Pair<Integer,Integer>[] hashMapList;
    public MyHashMap() {
        this.hashMapList = new Pair[size];
    }
    
    public void put(int key, int value) {
        hashMapList[hash(key)] = new Pair(key,value);
    }
    
    public int get(int key) {
        Pair val = hashMapList[hash(key)];
        if(val != null){
            int value = (int) val.getValue();
            return value;
        }
        return -1;
    }
    
    public void remove(int key) {
        hashMapList[hash(key)] = new Pair(-1,-1);
    }
    public int hash(int key){
        return key;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
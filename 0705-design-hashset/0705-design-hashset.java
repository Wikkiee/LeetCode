class MyHashSet {
    
    HashSet myHashSet;

    public MyHashSet() {
        this.myHashSet = new HashSet();
    }
    
    public void add(int key) {
        this.myHashSet.add(key);
    }
    
    public void remove(int key) {
        this.myHashSet.remove(key);
    }
    
    public boolean contains(int key) {
        if(this.myHashSet.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
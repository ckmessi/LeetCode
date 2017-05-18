// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

    public int nextValue = 0;
    public boolean reachNext = false;
    public Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.

        this.nextValue = 0;
        this.reachNext = false;
        this.iter = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(this.reachNext == false){
            this.nextValue = this.iter.next();
            this.reachNext = true;
        }
        return this.nextValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(this.reachNext == false){
            return this.iter.next();
        }
        else{
            this.reachNext = false;
            return this.nextValue;
        }
    }

    @Override
    public boolean hasNext() {
        if(this.reachNext == true){
            return true;
        }
        else{
            return this.iter.hasNext();
        }
    }
}

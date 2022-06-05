package com.company.FeedAnimals;


public class ZooCages implements Container{

    Object[] items;

    public ZooCages(Object[] items) {
        this.items = items;
        System.out.println(items.toString());
    }

    @Override
    public Iterator getIterator() {
        return new itemsIterator();
    }

    private class itemsIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if ( index < items.length ) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return items[index++];
        }


    }
}
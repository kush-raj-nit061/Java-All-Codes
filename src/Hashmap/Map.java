package Hashmap;

import java.util.*;

public class Map<K,V> {
    ArrayList <MapNode<K,V>> buckets;
    int count;
    int numBuckets;

    public Map(){
        buckets = new ArrayList<>();
        numBuckets = 5;
        for(int i = 0;i<numBuckets;i++){
            buckets.add(null);
        }
    }
    public void doubleCount(int size){
        for(int i = numBuckets;i<size*2;i++){
            buckets.add(null);
        }
        this.numBuckets *= 2;
    }

    public int getBucketIndex(K key){
        int hc = key.hashCode();
        return hc%numBuckets;
    }
    public void insert(K key,V value){
        if(count/numBuckets>0.7){
            doubleCount(numBuckets);
        }
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode<>(key,value);
        newNode.next = head;
        buckets.set(bucketIndex,newNode);
        count++;

    }

    private int size(){
        return count;
    }

    public V getValue(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeKey(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head!=null){
            if(head.key.equals(key)){
                if(prev != null){
                    prev.next = head.next;
                }else{
                    buckets.set(bucketIndex,head.next);
                }
            }
            prev = head;
            head = head.next;

        }
        return  null;
    }


}

class MapNode<K,V>{
    K key;
    V value;
    MapNode <K,V> next;
    public MapNode(K key, V value){
        this.key = key;
        this.value = value;

    }
}

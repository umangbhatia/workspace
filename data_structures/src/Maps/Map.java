package Maps;

import java.lang.reflect.Array;
import java.util.ArrayList;

import data_structures.Node;

public class Map<K,V> {
	ArrayList<Node<MapPair<K, V>>> buckets;
	int size;
	public Map(){
		buckets = new ArrayList<>();
		for(int i=0; i<4;i++){
			buckets.add(null);
		}
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public V find(K key) {
		int bucketIndex = getBucketIndex(key);
		Node<MapPair<K, V>> temp = buckets.get(bucketIndex);
		while(temp!=null){
			if(temp.data.key.equals(key)){
				return temp.data.value;
			}
			temp = temp.next;
		}
		return null;
	}
	public void put(K key,V value){
		int bucketIndex = getBucketIndex(key);
		Node<MapPair<K, V>> temp = buckets.get(bucketIndex);
		MapPair<K, V> pair = new MapPair<>();
		pair.key = key;
		pair.value = value;
		Node<MapPair<K, V>> newNode = new Node<MapPair<K,V>>(pair);
		Node<MapPair<K, V>> prev = null;
		if(temp==null){
			buckets.set(bucketIndex, newNode);
			size++;
			return;
		}else{
		while(temp!=null){
			if(temp.data.key.equals(key)){
				temp.data.value = value;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		prev.next = newNode;
		size++;
		}
		double loadFactor = size*1.0/buckets.size();
		if(loadFactor>=0.75){
			rehash();
		}
		
	}
	private void rehash() {
		// TODO Auto-generated method stub
		size=0;
		ArrayList<Node<MapPair<K, V>>> old = new ArrayList<>();
		for(int i=0;i<buckets.size();i++){
			old.add(buckets.get(i));
		}
		for(int i=old.size();i<2*old.size();i++){
			buckets.set(i-old.size(), null);
			buckets.add(null);
		}
		for(int i=0;i<old.size();i++){
			Node<MapPair<K, V>> newNode = old.get(i);
			
			while(newNode!=null){
				put(newNode.data.key, newNode.data.value);
				newNode = newNode.next;
			}
		}	
	}
	public void remove(K key){
		int bucketIndex = getBucketIndex(key);
		Node<MapPair<K, V>> temp = buckets.get(bucketIndex);
		Node<MapPair<K, V>> head = temp;
		Node<MapPair<K, V>> prev = null;
		if(temp.data.key.equals(key)){
			buckets.set(bucketIndex, head.next);
			return;
		}
		while(temp!=null){
			if(temp.data.key.equals(key)){
				prev.next=temp.next;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}
	private int getBucketIndex(K key){
		int hashCode = key.hashCode();
		int bucketIndex = hashCode%buckets.size();
		return bucketIndex;
	}
	public static void main(String[] args) {
		Map<String, Integer> map = new Map<>();
		map.put("abc", 10);
		map.put("def", 20);
		map.put("d", 20);
		map.put("ef", 20);
		System.out.println(map.size);
//		System.out.println(map.find("def"));
		
	}
}


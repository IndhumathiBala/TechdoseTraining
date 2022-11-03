import java.util.Random;
class RandomizedSet {
    Map<Integer,Integer>map;
    List<Integer>list;
    Random rand=new Random();
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        map.put(val,list.size());
        list.add(val);
        return true;
        
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        map.put(list.get(list.size()-1),map.get(val));
        list.set(map.get(val),list.get(list.size()-1));
        list.remove(list.size()-1);
        map.remove(val);
        return true;
        
    }    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

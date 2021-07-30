import java.util.*;

public class ToyTCPStream {
    /** IDEA:  
     * 
     * @reveive(int chunk, byte[] data)
     *   to store the `chunkId` vs data corresponding to
     *   that chunk in HashMap.
     * 
     * **/
    HashMap<Integer, byte[]> chunkMap;
    ToyTCPStream(){
        chunkMap = new HashMap<Integer, byte[]>();
    }

    public void receive(int chunkId, byte[] data){
        /**
         * store recived data belonging to chunkId in chunkMap;
         **/
        chunkMap.put(chunkId, data);
    }

    public int read(List<Byte> data){
        /** 
         * If chunkMap has some data, then transfer than data in 
         * correct ordering (increasing chunkId) into data arr. 
         **/
        int dataSize=0; // size of data.
        List<Integer> chunkIds = new ArrayList<Integer>(); 
        for(int id : chunkMap.keySet()){
            chunkIds.add(id);
        }
        // sort chunkId in increasing order.
        Collections.sort(chunkIds);
        
        // Iterate over the chunksId, get the data correspoding to that
        // chunk, and add it to data list.
        for(int chunkId: chunkIds){
            byte[] _data = chunkMap.get(chunkId);
            dataSize += _data.length; // update size 
            for(byte curr : _data){
                data.add(curr);
            }
        }
        return dataSize;
    }
}

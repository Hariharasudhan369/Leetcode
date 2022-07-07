class Solution {
    public int minimumCardPickup(int[] cards) {
       HashMap<Integer, Integer> occurance = new HashMap<>();
		int min = cards.length +1;
        if(min==1){
            return 1;
        }
		for (int i=0;i<cards.length;i++){

			if(occurance.containsKey(cards[i])) {
				int size = i - occurance.get(cards[i]) + 1;
				if(size < min) {
					min = size;
				}
                occurance.replace(cards[i], i);
			}
			else {
				occurance.put(cards[i], i);
			}
		}
		return min == cards.length +1 ? -1 : min ;
    }
}
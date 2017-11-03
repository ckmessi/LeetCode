class Twitter {

    private HashMap<Integer, HashSet<Integer>> followList;
    private HashMap<Integer, List<Integer>> tweetList;
    public static int tweetSerialCount = 0;
    private HashMap<Integer, Integer> tweetSerialMap;
    
    /** Initialize your data structure here. */
    public Twitter() {
        this.followList = new HashMap<Integer, HashSet<Integer>>();
        this.tweetList = new HashMap<Integer, List<Integer>>();
        this.tweetSerialMap = new HashMap<Integer, Integer>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        Twitter.tweetSerialCount++;
        this.tweetSerialMap.put(tweetId, Twitter.tweetSerialCount);
        if(this.tweetList.containsKey(userId) == false){
            this.tweetList.put(userId, new ArrayList<Integer>());
        }
        this.tweetList.get(userId).add(0, tweetId);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> candidateList = new ArrayList();
        candidateList.add(userId);
        if(this.followList.containsKey(userId) == true){
            Iterator<Integer> iter = this.followList.get(userId).iterator();
            while(iter.hasNext()){
                candidateList.add(iter.next());
            }
        }
        List<Integer> candidateTweetList = new ArrayList<Integer>();
        for(int i = 0; i < candidateList.size(); i++){
            int candidate = candidateList.get(i);
            if(this.tweetList.containsKey(candidate) == true){
                candidateTweetList.addAll(this.tweetList.get(candidate));
            }
        }
        
        List<Integer> list = this.fetchTopTen(candidateTweetList);
        return list;        
    }
    private List<Integer> fetchTopTen(List<Integer> list){
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            int item = list.get(i);
            if(res.size() < 10){
                this.insertSortedList(res, item);
            }
            else{
                if(this.tweetSerialMap.get(item) > this.tweetSerialMap.get(res.get(9))){
                    this.insertSortedList(res, item);
                    res.remove(10);
                }
            }
        }
        return res;
    }
    private void insertSortedList(List<Integer> list, int num){
        int pos = list.size() - 1;
        while(pos >= 0){
            if(this.tweetSerialMap.get(list.get(pos)) < this.tweetSerialMap.get(num)){
                pos--;
            }
            else{
                break;
            }
        }
        list.add(pos + 1, num);
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId){
            return;
        }
        if(this.followList.containsKey(followerId) == false){
            this.followList.put(followerId, new HashSet<Integer>());
        }
        this.followList.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(this.followList.containsKey(followerId) == false){
            return;
        }
        this.followList.get(followerId).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */

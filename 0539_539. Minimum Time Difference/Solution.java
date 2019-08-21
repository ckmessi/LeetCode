class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutesList = new ArrayList<Integer>();
        for(int i = 0; i < timePoints.size(); i++){
            String time = timePoints.get(i);
            String[] array = time.split(":");
            int totalMinutes = Integer.parseInt(array[0]) * 60 + Integer.parseInt(array[1]);
            minutesList.add(totalMinutes);
        }
        Collections.sort(minutesList);
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < minutesList.size(); i++){
            int diff = Math.abs(minutesList.get(i) - minutesList.get((i+1) % minutesList.size()));
            diff = Math.min(diff, 24*60 - diff);
            minDifference = Math.min(minDifference, diff);
        }
        return minDifference;
    }
}

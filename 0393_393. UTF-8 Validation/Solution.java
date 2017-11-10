class Solution {
    public boolean validUtf8(int[] data) {
        if(data.length == 0){
            return true;
        }
        
        for(int i = 0; i < data.length; i++){
            int num = data[i];
            int type = this.getUtf8Type(num);
            if(type == 0){
                continue;
            }
            else if (type > 1 && type <= 4){
                for(int j = 1; j < type; j++){
                    i++;
                    if(i >= data.length){
                        return false;
                    }
                    int type2 = this.getUtf8Type(data[i]);
                    if(type2 != 1){
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public int getUtf8Type(int num){
        num = num & 0xff;
        if((num & 0x80) == 0){
            return 0;
        }
        else if ((num & 0xc0 | 0x80) == 0x80){
            return 1;
        }
        else if ((num & 0xe0 | 0xc0) == 0xc0){
            return 2;
        }
        else if ((num & 0xf0 | 0xe0) == 0xe0){
            return 3;
        }
        else if ((num & 0xf8 | 0xf0) == 0xf0){
            return 4;
        }
        else {
            return -1;
        }
    }
    
    
}

class Solution {
    public String intToRoman(int num) {
    int value[] = {1000, 900 , 500, 400, 100, 90 , 50, 40, 10 , 9,5,4,1};
     String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    String s = "";
    for(int i =0; i < value.length ; i++){
        if(num >= value[i]){
             int c = num/value[i];
             for(int j =0; j<c;j++){
                     s = s + roman[i];
             }
            //  num = num % value[i]*c;
            num = num % (value[i] * c);

        }
        else{
            continue;
        }
    }
    return s;
        
    }

        
    }

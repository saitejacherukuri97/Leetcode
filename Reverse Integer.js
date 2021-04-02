/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    // Using primitive method of breaking down the number
    var abs_num = Math.abs(x);
    var res = 0;
    while(abs_num > 0){
        var reminder = abs_num % 10; //2
        res = res * 10 + reminder; //21
        abs_num = Math.floor(abs_num/10); //1
    }
    
    res = res * Math.sign(x);
    if (res < -1 * Math.pow(2, 31) || res > Math.pow(2, 31)-1) return 0;
    else return res;
    
//     //Using In built Javascript functions
//     var res = parseInt(x.toString().split('').reverse().join('')) * Math.sign(x);
    
//     if (res < -1 * Math.pow(2, 31) || res > Math.pow(2, 31)-1) return 0;
//     else return res;
};

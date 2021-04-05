/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function(dividend, divisor) {
    
    //logarithmic solution
    // we know log(a/b) = log(a) - log(b)
    // hence exp(log(a/b)) = exp(log(a) - log(b))
    // which will result a/b = exp(log(a) - log(b))
    
//     var dividend_sign = Math.sign(dividend);
//     var divisor_sign = Math.sign(divisor);
//     divisor = Math.abs(divisor);
//     dividend = Math.abs(dividend);
//     if(dividend == 0 || divisor > dividend) return 0;
    
//     var res = Math.floor(Math.exp(Math.log(dividend) - Math.log(divisor)));
    
//     res = (dividend_sign==divisor_sign) ? res : (-1)*res;
    
//     if (res < (-1)*Math.pow(2, 31) || res > Math.pow(2, 31)-1) return Math.pow(2, 31)-1;
//     else return res;
    
    //logarithmic increment solution 
    //we keep doubling the total number of a's we can subtract, there by making large       calculations logarithmic instead of linear. I.e. we check if we can subtract one a, then 2 a's, then 4 a's, then 8 a's, all the way until we cannot subtract anymore
    
    var dividend_sign = Math.sign(dividend);
    var divisor_sign = Math.sign(divisor);
    divisor = Math.abs(divisor);
    dividend = Math.abs(dividend);
    var res = 0;
    if(dividend == 0 || divisor > dividend) return 0;
    
    while (divisor <= dividend){
        var value = divisor;
        var multiple = 1;
        while (value + value <= dividend){
            value += value;
            multiple += multiple;
        }
        dividend = dividend - value;
        res += multiple;
    }
    
    res = (dividend_sign==divisor_sign) ? res : (-1)*res;
    
    if (res < (-1)*Math.pow(2, 31) || res > Math.pow(2, 31)-1) return Math.pow(2, 31)-1;
    else return res;
    
};
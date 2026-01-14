class Solution {
    String[] uptoTwenty = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] th = { "", "Thousand", "Million","Billion"};
    String[] t = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public String helper(int n) {
        if (n == 0)
            return "";
        if (n < 20)
            return uptoTwenty[n]+" ";
        if (n < 100)
            return t[n / 10] + " " + helper(n % 10);

        return uptoTwenty[n / 100] + " Hundred " + helper(n % 100);
    }

    public String numberToWords(int num) {
        if(num==0) return "Zero";
    String result = "";
    int i = 0;

    while (num > 0) {
    if (num % 1000 != 0) {
        result = helper(num % 1000) + th[i] + " " + result;
    }
    num /= 1000;
    i++;
    }
    return result.trim();
}
}
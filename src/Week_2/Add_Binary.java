package Week_2;

public class Add_Binary {
    public static void main(String[] args){
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
        System.out.println(addBinary1(a,b));
    }

    private static String addBinary1(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i--) - '0';
            }
            if (j>=0){
                sum+=b.charAt(j--) - '0';
            }
            sb.insert(0,sum%2);
            carry = sum/2;
        }
        if (carry>0){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}

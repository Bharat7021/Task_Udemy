public class Leetcode238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
    // public int[] productExceptSelf(int[] nums) {
    //     int[] res = new int[nums.length];
    //     for(int i = 0; i < nums.length; i++){
    //         res[i] = prefixProduct(nums, i) * suffixProduct(nums, i);
    //     }
    //     return res;
    // }
    // public int prefixProduct(int[] nums, int index){
    //     if(index == 0) return 1;
    //     int preProd = 1;
    //     for(int i = 0; i < index; i++){
    //         preProd *= nums[i];
    //     }
    //     return preProd;
    // }
    // public int suffixProduct(int[] nums, int index){
    //     if(index == nums.length - 1) return 1;
    //     int sufProd = 1;
    //     for(int i = index + 1; i < nums.length; i++){
    //         sufProd *= nums[i];
    //     }
    //     return sufProd;
    // }
}

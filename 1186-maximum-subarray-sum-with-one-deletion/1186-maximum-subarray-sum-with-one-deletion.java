class Solution {
    public int maximumSum(int[] arr) {
       
        int onedelete = -1;
        int nodelete = arr[0];
        int n = arr.length;
        int res = arr[0];


        for(int i =1 ; i<n ; i++){
         int oldnodelete = nodelete;
         int oldonedelete = onedelete;
         nodelete =Math.max(
             arr[i],
             oldnodelete + arr[i]
           );

        onedelete = Math.max(oldonedelete + arr[i] , oldnodelete);
        res = Math.max(res , Math.max(nodelete , onedelete));
        }
return res;
    }
}
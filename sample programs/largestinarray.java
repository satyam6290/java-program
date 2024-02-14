class largestinarray {
    public static int getLargest(int []a,int total){
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(a[i] > a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;  
                }
               
            }
        }
        return a[total-1];
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={23,56,78,97,67};
        System.out.println("largest:"+getLargest(a,6));
        System.out.println("largest:"+getLargest(b,5));
    }
    
}

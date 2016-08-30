 Scanner sc=new Scanner(System.in);int n=sc.nextInt();
         int i;int[] a=new int[n];int[] b=new int[n];int count=0;
         for(i=0;i<n;i++){
             a[i]=sc.nextInt();
             b[i]=a[i];
              }
        Arrays.sort(a);
    for( i=0;i<n;i++){
    if(a[i]==b[i]){
        count++;}
        else {
            System.out.println("not sorted array");
            break;
        }
    }if(count==n){
        System.out.println("sorted array");
    } 
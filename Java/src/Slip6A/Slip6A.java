class Slip6A
{
    public static void main(String[] args)
   {int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int result[][] = new int[3][3];
	int i=0,j=0;
	// code to tranpose a matrix
        for(i = 0 ; i< 3; i++)  
	{
		for(j = 0 ; j<3;j++)
		{		
		result[i][j]=mat[j][i];
		}
	}
	// display matrix
	System.out.println("The contents of the matrix are");
	for(i = 0 ; i <3; i++)
	{
		for(j = 0 ; j<3;j++)
		{
		System.out.print(mat[i][j] + " ");
		}
	System.out.println("");
	}
	// display transpose
	System.out.println("The transpose of the matrix is");
	for(i = 0 ; i <3; i++)
	{
		for(j = 0 ; j<3;j++)
		{
		System.out.print(result[i][j] + " ");
		}
	System.out.println("");
	}
   }
}



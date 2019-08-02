class multi
{
	public static void main(String args[])
	{
		int i,j,k;
		int arr1[][]=new int[2][2];
		arr1[0][0]=2;
		arr1[0][1]=2;
		arr1[1][0]=2;
		arr1[1][1]=2;
		int arr2[][]=new int[2][3];
		arr2[0][0]=2;
		arr2[0][1]=2;
		arr2[0][2]=2;
		arr2[1][0]=2;
		arr2[1][1]=2;
		arr2[1][2]=2;
		int result[][]=new int[2][3];
			/*for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}*/
		for (i=0;i<2;i++ )
		{
			for(j=0;j<3;j++)
			{
				result[i][j]=0;
				for(k=0;k<2;k++)
				{
	result[i][j]=result[i][j]+arr1[i][k]*arr2[k][j];
		}
	}
}
for(i=0;i<2;i++)
		{
	for(j=0;j<3;j++)
			{
		System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
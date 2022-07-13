class MagicBox
{
	public static void main(String arg[])
	{
		int size=Integer.parseInt(arg[0]);
		int[][] arr= new int[size][size];
		int lim=size-1;
		int half=lim/2;
		int row=0;
		int col=half;
		int n=1;
		arr[row][col]=n;
		n++;
		row--;
		col++;
		for(;n!=(size*size);n++,row--,col++)
		{
			if(row<0)
				row=lim;
			if(col>lim)
				row=0;
			if(arr[row][col]!=0)
			{
				row+=2;
				col--;
				arr[row][col]=n;
				continue;
			}
			if(row<0&&col>lim)
			{
				row=1;
				col=lim;
			}
			arr[row][col]=n;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}
}
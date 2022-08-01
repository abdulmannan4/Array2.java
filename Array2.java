public class Array2
	{
void ave(int m[][],int row,int col)
{
for(int i=0;i<row;i++)
{
for(int j=0 ;j<col;j++)
		{
System.out.println(m[i][j]);
		}
}
	}
public static void main (String args[])
		{
int arr[][]={{2,3},{4,5}};
Array2 obj=new Array2();
obj.ave(arr,2,2);
	}
	}
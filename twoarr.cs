using System;

class Two
{
    public static void Main(string[] args)
    {
        // Read dimensions of the array
        int v = Convert.ToInt32(Console.ReadLine());
        int k = Convert.ToInt32(Console.ReadLine());

        // Initialize the 2D array
        int[,] a = new int[v, k];

        // Print the dimensions of the array
        Console.WriteLine("Array dimensions: {0} x {1}", v, k);

        // Read values into the array
        for (int i = 0; i < a.GetLength(0); i++)
        {
            for (int j = 0; j < a.GetLength(1); j++) // Use GetLength(1) for the second dimension
            {
                Console.WriteLine("Enter value for a[{0},{1}]:", i, j);
                a[i, j] = Convert.ToInt32(Console.ReadLine());
            }
        }

        // Print the values in the array
        for (int i = 0; i < a.GetLength(0); i++)
        {
            for (int j = 0; j < a.GetLength(1); j++) // Use GetLength(1) for the second dimension
            {
                Console.WriteLine("a[{0},{1}]={2}", i, j, a[i, j]);
            }
        }
    }
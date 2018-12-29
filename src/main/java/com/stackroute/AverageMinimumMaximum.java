package com.stackroute;

public class AverageMinimumMaximum
    {
        public int getData(int arr[])
        {

        }


    public int min(int arr[], int num)
    {
        int i;
        int min = arr[0];
        for (i = 0; i < num; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public int max(int arr[], int num)
    {
        int j;
        int max = arr[0];
        for (j = 0; j < num; j++)
        {
            if (arr[j] > max)
            {
                max = arr[j];
            }
        }
        return max;
    }

    public double avg(int arr[], int num)
    {
        int i;
        int avg;
        int temp = 0;
        for (i = 0; i < num; i++)
        {
            temp = arr[i] + temp;
        }
        avg = temp / num;
        return avg;
    }
    }
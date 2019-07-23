package javaapplication2;
public class JavaApplication2 {
    public static int getMinValue ( int arrIn [ ] )
    {
        int minValue = arrIn[0];
        for( int i = 1 ; i < arrIn.length ; i++ )
        {
            if( arrIn [ i ] < minValue )
            {
                minValue = arrIn[ i ] ;
            }
        }
        
        
        
        return minValue;
    }
    
    public static String getRunnerByIndex( int indexRunner )
    {
        String RunnerNames[ ] = {"Emir", "Emre", "Said", "Ekrem", "Selman"} ;
        return RunnerNames[indexRunner];
    }
    public static void main(String[] args)
    {
        int test[] = {1, 2, 3, 4, 5} ;
        
        System.out.println( " Min Value = " + getMinValue( test ) );
        int RunnerArray[] = {18, 16, 25, 15, 17};
        int FastTime = getMinValue(RunnerArray);
        System.out.println(FastTime);
        int FastIndex = getMinIndex (RunnerArray);
        System.out.println(FastIndex);
    }
    
    public static int getMinIndex ( int arrIn [ ] )
    {
        int minValue = arrIn[0];
        int minIndex = 0;
        for( int i = 1 ; i < arrIn.length ; i++ )
        {
            if( arrIn [ i ] < minValue )
            {
                minValue = arrIn[ i ] ;
                minIndex = 1;
            }
        }
        
        
        
        return minIndex;
    }
    
    
    
}

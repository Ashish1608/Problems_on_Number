// import java.lang.*;
import java.util.*;

class Numbers
{
  private int iNum;
  
  public Numbers(int iNo)             // Parameterised constructor to initialize the characteristics
  {
    this.iNum = iNo;
  }

  public void DisplayFactors()        // function to display factors of a given number
  {
    int iCnt = 0;

    if (this.iNum < 0) 
    {
      this.iNum = -this.iNum;
    }

    for (iCnt = 1; iCnt <= (this.iNum / 2); iCnt++) // Time Complexity = O(N/2)
    {
      if ((this.iNum % iCnt) == 0) 
      {
        System.out.println(iCnt);
      }
    }
  }

  public void DisplayNonFactors()     // function to display non-factors of a given number
  {
    int iCnt = 0;

    if (this.iNum < 0) 
    {
      this.iNum = -this.iNum;
    }

    for (iCnt = 1; iCnt < this.iNum; iCnt++) // Time Complexity = O(N)
    {
      if ((this.iNum % iCnt) != 0) 
      {
        System.out.println(iCnt);
      }
    }
  }
  
  public int SumFactors()             // function to return sum of factors of a given number
  {
    int iSum = 0;
    int iCnt = 0;

    if (this.iNum < 0) 
    {
      this.iNum = -this.iNum;
    }

    for (iCnt = 1; iCnt <= (this.iNum / 2); iCnt++) // Time Complexity = O(N/2)
    {
      if ((this.iNum % iCnt) == 0) 
      {
        iSum = iSum + iCnt;
      }
    }

    return iSum;
  }
   
  public boolean CheckPerfect()       // function to check whether a given number is perfect or not
  {
    int iAns = 0;
    iAns = this.SumFactors();

    if (iAns == this.iNum) 
    {
      return true;
    } 
    else 
    {
      return false;
    }
  }
  
  public int SumNaturalNumbers()      // function to return the sum of natural numbers upto a given number
  {
    int iCnt = 0;
    int iSum = 0;

    for (iCnt = 1; iCnt <= this.iNum; iCnt++) {
      iSum = iSum + iCnt;
    }

    return iSum;
  }
  
  public float AvgNaturalNumbers()    // function to return the sum of natural numbers upto a given number
  {
    int iSum = 0;
    float fAvg = 0.0f;

    iSum = this.SumNaturalNumbers();

    fAvg = (float) iSum / (this.iNum); // typecasting from int to float to get the result as a float

    return fAvg;
  }
  
  public int SumEvenNumbers()         // function to return the sum of first N even numbers
  {
    int iCnt = 0;
    int iSum = 0;

    for (iCnt = 1; iCnt <= this.iNum; iCnt++) {
      iSum = iSum + (2 * iCnt);
    }

    return iSum;
  }
  
  public int SumOddNumbers()         // function to return the sum of first N odd numbers
  {
    int iCnt = 0;
    int iSum = 0;

    for (iCnt = 0; iCnt < this.iNum; iCnt++) {
      iSum = iSum + ((2 * iCnt) + 1);
    }

    return iSum;
  }
  
  public boolean CheckPrime()       // function to check whether a given number is prime or not
  {
    int iCnt = 0;

    if (this.iNum <= 1) {
      return false;
    }

    for (iCnt = 2; (iCnt * iCnt) <= (this.iNum); iCnt++) // Time complexity O(sqrt(N))
    {
      if ((this.iNum % iCnt) == 0) {
        return false;
      }
    }

    return true;
  }

  public long power(int iPower)
  {
    long lAns = 1;
    int iCnt = 0;

    for (iCnt = 1; iCnt <= iPower; iCnt++) 
    {
      lAns = lAns * this.iNum;
    }

    return lAns;
  }
  
  public boolean checkArmstrong()
  {
    int iSum = 0;
    int iTemp = this.iNum;
    int iDigCnt = 0;
    int iDigit = 0;
    int iMult = 1;
    int iCnt = 0;

    // calculating number of digits in the number
    while (iTemp != 0)
    {
      iDigCnt++;
      iTemp = iTemp / 10;
    }

    iTemp = this.iNum;

    while (iTemp != 0)
    {
      iDigit = iTemp % 10;

      for(iCnt = 1; iCnt <= iDigCnt; iCnt++)
      {
        iMult = iMult * iDigit;
      }

      iSum = iSum + iMult;

      iMult = 1;

      iTemp = iTemp / 10;
    }

    if(iSum == this.iNum)
    {
      return true;
    }
    else 
    {
      return false;
    }

  }
}

class ProblemsOnNumbers
{
  public static void main(String args[])
  {
    Scanner sObj = new Scanner(System.in);
    // long lRet = 0;
    // int iRet = 0;
    boolean bRet = false;
    int iValue = 0;
    
    System.out.println("Enter the number :");
    iValue = sObj.nextInt();

    Numbers nObj = new Numbers(iValue);
    
   /* System.out.println("\nFactors of "+ iValue + " are :");
    nObj.DisplayFactors(); */

   /* bRet = nObj.CheckPerfect();

    if(bRet == true)
    {
      System.out.println("\n" + iValue + " is a Perfect Number.");
    }
    else
    {
      System.out.println("\n" + iValue + " is not a Perfect Number.");
    } */

   /* float fAvg = nObj.AvgNaturalNumbers();
    System.out.println("\nAverage of all natural numbers upto " + iValue + " is " + fAvg);  */

   /* boolean isPrime = true;
   
   isPrime = nObj.CheckPrime();
   
   if (isPrime == true)
   {
     System.out.println("\n" + iValue + " is a Prime Number.");
   }
   else
   {
     System.out.println("\n" + iValue + " is Not a Prime Number.");
   } */

   bRet = nObj.checkArmstrong();

   if (bRet == true)
   {
     System.out.println(iValue + " is the Armstrong Number.");
   }
   else
   {
    System.out.println(iValue + " is Not the Armstrong Number.");
   }

    sObj.close();
  }
}


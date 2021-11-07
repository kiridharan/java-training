import java.io.*;
import java.util.*;
class Count {

static int countOccurrences(String str, String word)
{
	// split the string by spaces in a
	String a[] = str.split(" ");

	// search for pattern in a
	int count = 0;
	for (int i = 0; i < a.length; i++)
	{
	// if match found increase count
	if (word.equals(a[i]))
		count++;
	}

	return count;
}

// Driver code
public static void main(String args[])
{
    Scanner num = new Scanner(System.in);
    System.out.println("Enter your Whole String : ");
    String number = num.nextLine();
    Scanner word = new Scanner(System.in);
    System.out.println("Enter your word need to count in String : ");
    String words = word.nextLine();

    System.out.println(countOccurrences(number, words));
}
}

/*This code is contributed by Nikita Tiwari.*/

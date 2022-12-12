import java.util.ArrayList;

public class Keyboard
{
    public int characterCounter(String input)
    {
        int charNum = 0;
        for(int i = 0; i <input.length(); i++)
        {
            if(input.charAt(i)!=' ')
            {
                charNum++;
            }
        }
        return charNum;

    }

    public int wordCounter(String input)
    {
        int wordCount = 0;
        String [] strArray = input.split(" ");
        wordCount = strArray.length;
        return wordCount;
    }

    public int spaceCounter(String input)
    {
        int spaceCount = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if(Character.isWhitespace(input.charAt(i)))
            {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public ArrayList<String> alphabetCounter(String input)
    {
        input = input.toUpperCase();
        char [] charString = input.toCharArray();
        char [] charAlphabet = new char[]{'A', 'B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P','Q','R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z'};
        ArrayList<String> counter = new ArrayList<String>();

        for(int i = 0; i < 26; i++)
        {
            int count = 0;
            for(int j = 0; j < charString.length; j++)
            {
                if(charAlphabet[i] == charString[j])
                {
                    count++;
                }
            }
            counter.add(count+"");
        }
        return counter;
    }

    public int MinLength(String[] inputAll)
    {
        int minLengthString = 10;
        for(String string : inputAll)
        {
            if (string.length() < minLengthString)
            {
                minLengthString = string.length();
            }
        }
        return minLengthString;
    }

    public int MaxLength(String [] inputAll)
    {
        int maxLengthString = 0;
        for(int i = 0; i < inputAll.length; i++)
        {
            String string = inputAll[i];
            if(string.length() > maxLengthString)
            {

                maxLengthString = string.length();
            }
        }
        return maxLengthString;
    }

    public int TotalLength(String [] inputAll)
    {
        int totalLength = 0;
        for(int i = 0; i < inputAll.length; i++)
        {
            totalLength += inputAll[i].length();
        }
        return totalLength;
    }

}


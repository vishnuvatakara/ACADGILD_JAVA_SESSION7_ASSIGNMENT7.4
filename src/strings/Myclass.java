package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Myclass
{
public static void groupAnagramWords ()
{	//input string
	String[] words = {"listen", "pot", "part","opt","trap","silent","top","this","hello","hits","what","shit"};

	HashMap<Integer,List>hm = new HashMap<Integer,List>(); //craeting hashmap class object hm with integer key and value of list

	for(String val:words){
		int hash = getHash(val); //calling function to get hash value of word
		List wordList = new ArrayList (); //create an arraylist named as wordlist

		if (hm.containsKey(hash)) //check the hash value key already in mapping
			{
			wordList = hm.get(hash);//
			wordList.add(val); //add string value into list
			hm.put(hash,wordList );////performing mapping
			}
		else
		{
			wordList.add(val); //add string value into list
			hm.put(hash, wordList);//performing mapping
		}
	}

System.out.println(hm.toString());
}

static int getHash(String val)	
{//calculating hash value
char[] c = val.toCharArray();
int hash = 0;
for(char ch:c){
String sc = String.valueOf(ch);
hash=hash+sc.hashCode();
}
return hash;
}
public static void main(String args[])
{
	Myclass obj=new Myclass();
	groupAnagramWords();
}
}
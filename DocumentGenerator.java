package org.mahout.assignment5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DocumentGenerator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String doc,wordid,vocab,line;
		int count;
		ArrayList<String> words=new ArrayList<String>();
		ArrayList<String> doclist=new ArrayList<String>();
		
		
		FileReader fr=new FileReader("/home/Downloads/vocab.nips.txt");
		BufferedReader br=new BufferedReader(fr);
		while((line=br.readLine())!=null)
		{
			words.add(line);
		}
		fr.close();
		br.close();
		System.out.println("number of words in vocab is :"+words.size());
		fr=new FileReader("/home/Downloads/docword.nips.txt");
		br=new BufferedReader(fr);
		br.readLine();
		br.readLine();
		br.readLine();
		//System.out.println(br.readLine());
		while((line=br.readLine())!=null)
		{
			doclist.add(line);
		}
		File file = null;
		for(int i=0;i<doclist.size();i++)
		{
			doc=doclist.get(i).split(" ")[0];
			System.out.println("document is: "+doc);
			wordid=doclist.get(i).split(" ")[1];
			System.out.println("wordid is: "+wordid);
			count=Integer.parseInt(doclist.get(i).split(" ")[2]);
			System.out.println("Count is "+count);
			file=new File("/home/assignment5/"+doc+".txt");
			if(!(file.exists()))
			{
				file.createNewFile();
				
			}
			System.out.println("file name is "+file.getName());
			FileWriter fileWritter = new FileWriter(file,true);
	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	        for(int j=0;j<count;j++)
	        {
	        	bufferWritter.write(words.get(Integer.parseInt(wordid)-1)+ " ");	
	        }
	        System.out.println("The word written is "+words.get(Integer.parseInt(wordid)-1));
	       bufferWritter.close();
		}
	}

}

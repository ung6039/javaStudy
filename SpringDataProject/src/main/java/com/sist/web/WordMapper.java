package com.sist.web;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
 	LongWritable => long
 	Text => String
 	IntWritable => int
 	
 	
 	=> 줄 번호
 	Java java =====> (java,1) => Sort => [Java,1,1],[Oracle,1,1]
 					(Java,1)
 					(Oracle,1)
 					(Oracle,1)
 					(Ajax,1)
 					
 	1. java Java Oracle Oracle ajax => (java,1)
 	
 		
 */

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
//	private final IntWritable one = new IntWritable(1);
//	private Text keyValue = new Text();

	private final IntWritable one = new IntWritable();
	private Text keyValue = new Text();

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		
		StringTokenizer st = new StringTokenizer(value.toString());
		while(st.hasMoreTokens()){
			keyValue.set(st.nextToken());
			context.write(keyValue, one);
		}
	}
	
	
	
	
	
}

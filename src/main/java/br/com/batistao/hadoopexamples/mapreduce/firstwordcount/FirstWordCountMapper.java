package br.com.batistao.hadoopexamples.mapreduce.firstwordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class FirstWordCountMapper extends Mapper<Object, Text, Text, IntWritable> {

    private final IntWritable ONE = new IntWritable(1);
    private Text word = new Text();

    @Override
    protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        if(isNotBlank(line)) {
            String firstLetter = String.valueOf(line.charAt(0));
            word.set(firstLetter.toLowerCase());
        } else {
            word.set("EMPTY");
        }

        context.write(word, ONE);
    }
}

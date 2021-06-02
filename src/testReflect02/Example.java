package testReflect02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Tree extends HashMap<String, Tree>{}
public class Example {
    public static Tree buildWordTreeFromSentences(List<String> sentencesList){
        Tree root = new Tree();
        for(String sentence: sentencesList){
            Tree base = root;
            for(String word: sentence.split(" ")){
                if(!base.containsKey(word)){
                    base.put(word, new Tree());
                }else{
                    base = base.get(word);
                }

            }


        }
        return root;
    }

    public static void main(String[] args) {
        Tree tree = buildWordTreeFromSentences(Arrays.asList("Hello world", "Hello there"));
        System.out.println(tree);
    }

}

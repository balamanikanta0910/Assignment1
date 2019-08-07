import java.util.*;

public class RnaTranscription {

    public static void main(String args[])
    {
        String s = new RnaTranscription().transcribe("CATG");
        System.out.print(s);
    }

    String transcribe(String dnaStrand) {

        HashMap<Character,Character> map = new HashMap<>();
        map.put('C','G');
        map.put('G','C');
        map.put('T','A');
        map.put('A','U');

        String rna = new String("");

        for(int i=0; i<dnaStrand.length(); i++)
        rna += map.get(dnaStrand.charAt(i));

        return rna;
    }

}

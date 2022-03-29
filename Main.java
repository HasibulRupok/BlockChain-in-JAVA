import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<block> blockChain = new ArrayList<>();

        blockChain.add(new block("First Block", "null"));
        blockChain.add(new block("Second Block", blockChain.get(blockChain.size() -1).hash));
        blockChain.add(new block("Third Block", blockChain.get(blockChain.size() -1).hash));
        blockChain.add(new block("Fourth Block", blockChain.get(blockChain.size() -1).hash));

        isValid valid = new isValid(blockChain);
        valid.isValidChain();

    }

}

import java.util.Date;

public class block {
    private String data;
    public String hash;
    public String previousHash;
    private long timeSTamp;

    public block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeSTamp = new Date().getTime();

        this.hash = calculateHash();
    }
    public String calculateHash(){
        String newHash =  crypto.sha256(previousHash+timeSTamp+data);
        return newHash;
    }
}

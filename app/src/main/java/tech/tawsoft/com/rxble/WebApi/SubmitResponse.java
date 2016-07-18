package tech.tawsoft.com.rxble.WebApi;

public class SubmitResponse {

    String id;
    String nfcid;
    String weight;
    String user;

    public String getNfcid() {
        return nfcid;

    }

    public void setNfcid(String nfcid) {
        this.nfcid = nfcid;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUser() {
        return user;
    }

    public String setUser(String user) {
        this.user = user;
        return user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

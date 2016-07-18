package tech.tawsoft.com.rxble;

import com.orm.SugarRecord;

/**
 * Created by server 2 on 7/15/2016.
 */
public class ScaleData extends SugarRecord {


    String nfcid;
    String weight;
    String user;

    public ScaleData() {




    }

    public ScaleData (String nfcid,String weight,String user){


        this.nfcid = nfcid;
        this.weight = weight;
        this.user = user;

    }


}

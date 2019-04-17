package org.smartregister.repository;

import org.smartregister.p2p.model.DataType;

import java.util.TreeSet;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 11/04/2019
 */

public abstract class BaseP2PTransferDao {

    protected DataType client = new DataType("client", DataType.Type.NON_MEDIA, 3);
    protected DataType event = new DataType("event", DataType.Type.NON_MEDIA, 2);
    protected DataType profilePic = new DataType("profile-pic", DataType.Type.MEDIA, 1);

    protected TreeSet<DataType> dataTypes;

    public BaseP2PTransferDao() {
        dataTypes = new TreeSet<>();

        dataTypes.add(client);
        dataTypes.add(event);
        dataTypes.add(profilePic);
    }
}

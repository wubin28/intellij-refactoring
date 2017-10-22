package com.wubinben.intellij.makeMethodStatic;

public class ConnectionPool {
    public int i;
    public int j;

    public void getConnection() {
        getConnection(this);
    }

    public static void getConnection(ConnectionPool connectionPool) {
        int k = connectionPool.i + connectionPool.j;
        //...
    }
}

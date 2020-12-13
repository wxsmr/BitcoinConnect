package com.btc.connect;


import java.util.ArrayList;
import java.util.List;

public class BlockData {
    private String hash;
    private long confirmations;
    private long strippedsize;
    private long size;
    private long weight;
    private int version;
    private String versionHex;
    private String merkleroot;
    private List<String> tx =new ArrayList<>();
    private long time;
    private long mediantime;
    private long nonce;
    private String bits;
    private long difficulty;
    private String chainwork;
    private int getVersion;
}

package com.graphql.learning.pojo;

import java.util.List;

public class Customer implements IUser{

    String id;
    String name;
    List<String> purchaseHistory;

    public Customer(String id, String name, List<String> purchaseHistory) {
        this.id = id;
        this.name = name;
        this.purchaseHistory = purchaseHistory;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<String> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}

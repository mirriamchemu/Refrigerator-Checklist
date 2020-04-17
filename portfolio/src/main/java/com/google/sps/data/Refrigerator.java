// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the subtraction game, where players take turns subtracting from 21 to reach 0.
 *
 * <p>Note: The private variables in this class are converted into JSON.
 */
public class Refrigerator {
    //refrigerator fields
    private String id;
    private User owner;
    private ArrayList<Item> items;
    private ArrayList<User> users;

    //class constructor
    public Refrigerator(String id, User owner, ArrayList<Item> items, ArrayList<User> users) {
        this.id = id;
        this.owner = owner;
        this.items = items;
        this.users = users;
        users.add(owner);
    }

    //getter and setter methods
    public String getID(){
        return id;
    }

    public User getOwner(){
        return owner;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public void setID(String idNumber){
        id = idNumber;
    }

    public void setOwner(User newOwner){
        owner = newOwner;
    }

    public void addNewItem(Item newItem){
        items.add(newItem);
    }

    public void addUser(User newUser){
        users.add(newUser)
    }

    //method for getting the expiry date of a single item in the fridge
    public String getExpiryDate(Item item){
        String expiry_date = "";
        for(int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                expiry_date = items.get(i).getExpiryDate();
            }
        }
        return expiry_date;
    }

    //method for getting expiry dates of all the items in the fridge
    public HashMap<String, String> getItemsExpiryDates() {
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < items.size(); i++) {
            map.put(items.get(i).getName(), items.get(i).getCategory());
        }
        return map;
    }

    //method for getting items of a certain category
    public ArrayList<Items> getCategoryItems(String category){
        ArrayList<Items> categoryItems = new ArrayList<>();
        for(int i = 0; i < items.size(); i++) {
            if (items.get(i).getCategory().equals(category)) {
                categoryItems.add(items.get(i));
            }
        }
        return categoryItems;
    }
}

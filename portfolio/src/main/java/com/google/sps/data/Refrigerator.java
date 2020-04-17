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
    private int id;
    private String owner;
    private ArrayList<Item> items;

    //class constructor
    public Refrigerator(int id, String owner, ArrayList<Item> items) {
        this.id = id;
        this.owner = owner;
        this.items = items;
    }

    //getter and setter methods
    public int getID(){
        return id;
    }

    public String getOwner(){
        return owner;
    }

    public void setID(int idNumber){
        id = idNumber;
    }

    public void setOwner(String newOwner){
        owner = newOwner;
    }

    public void addNewItem(Item newItem){
        items.add(newItem);
    }
}

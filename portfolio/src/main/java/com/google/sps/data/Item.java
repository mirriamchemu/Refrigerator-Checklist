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
public class Item {
    //refrigerator fields
    private String name;
    private String category;
    private String entry_date;
    private String expiry_date;
    private User entry_user;

    //class constructor
    public Item(String name, String category, String entry_date,
     String expiry_date, User user) {
        this.name = name;
        this.category = category;
        this.entry_date = entry_date;
        this.expiry_date = expiry_date;
        this.entry_user = user;
    }

    //getter and setter methods
    public int getname(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public String getExpiryDate(){
        return expiry_date;
    }
}

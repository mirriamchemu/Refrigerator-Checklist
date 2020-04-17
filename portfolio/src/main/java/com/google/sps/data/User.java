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
public class User {
    //refrigerator fields
    private String name;
    private String email_address;
    private String password;

    //class constructor
    public User(String name, String email, String password) {
        this.name = name;
        this.email_address = email;
        this.password = password;
    }

    //getter and setter methods
    public int getName(){
        return name;
    }

    public String getEmail(){
        return email_address;
    }

    public String getPassword(){
        return password;
    }

    public void setEmail(String newEmail){
        email_address = newEmail;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }
}
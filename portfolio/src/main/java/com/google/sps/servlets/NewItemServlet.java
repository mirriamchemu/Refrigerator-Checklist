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

package com.google.sps.servlets;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import java.io.IOException;
import com.google.sps.data.Refrigerator;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet responsible for creating new tasks. */
@WebServlet("/new-item")
public class NewTaskServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String name = request.getParameter("name");
    String category = request.getParameter("category");
    String entry_date = request.getParameter("entry_date");
    String expiry_date = request.getParameter("expiry_date");
    String entry_user_name = request.getParameter("name");

    //access the User database
    Query query = new Query("User");
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    PreparedQuery results = datastore.prepare(query);
     
    User user = null;
    for (Entity entity : results.asIterable()) {
      String name = (String) entity.getProperty("name");
      if (name.equals(entry_user_name)) {          
          user = entity;
      }
    }

    Entity ItemEntity = new Entity("Item");
    ItemEntity.setProperty("name", name);
    ItemEntity.setProperty("category", category);
    ItemEntity.setProperty("entry_date", entry_date);
    ItemEntity.setProperty("expiry_date", expiry_date);
    ItemEntity.setProperty("User", user);

    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    datastore.put(ItemEntity);

    response.sendRedirect("/index.html");
  }
}
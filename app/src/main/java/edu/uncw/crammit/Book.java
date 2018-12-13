//        Copyright 2018 Lucas Layman Licensed under the
//        Educational Community License, Version 2.0 (the "License"); you may
//        not use this file except in compliance with the License. You may
//        obtain a copy of the License at
//
//        http://www.osedu.org/licenses/ECL-2.0
//
//        Unless required by applicable law or agreed to in writing,
//        software distributed under the License is distributed on an "AS IS"
//        BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
//        or implied. See the License for the specific language governing
//        permissions and limitations under the License.


package edu.uncw.crammit;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Book {

    @Id
    private long id;

    String title;
    String courseNumber;
    String description;
    int year;

    Book(String title, String courseNumber, String description, int year) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

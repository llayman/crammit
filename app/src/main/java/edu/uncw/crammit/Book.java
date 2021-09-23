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

public class Book {

    static final Book[] books = {
            new Book("Elements of Computing Systems", "CSC 242", "Not really a textbook. More of a handbook.", 2012, R.drawable.elements_of_computing_systems),
            new Book("Introduction to Algorithms", "CSC 380", "The gold standard for algorithms textbooks.", 2009, R.drawable.intro_to_algorthims),
            new Book("Head First Android Development", "CSC 315", "A book with step-by-step instructions for creating awesome apps.", 2017, R.drawable.head_first),
            new Book("Plato's Symposium", "PAR 101", "Recent translation of the bedrock of Western Philosophy", 1956, R.drawable.symposium),
            new Book("Hamlet (Penguin Classics)", "COM 116", "Alas, poor Yorick, I knew him well!", 1995, R.drawable.hamlet),
            new Book("They Say/I Say with Readings", "ENG 101", "The basics of writing styles", 2018, R.drawable.they_say),
            new Book("Introduction to Psychology", "PSY 105", "Everything from neurons to neuroses. Learn how the brain works.", 2017, R.drawable.intro_to_psych),
            new Book("Introducing Anthropology", "ANT 105", "Ever wonder how to study people and civilizations? Wonder no more.", 2011, R.drawable.intro_anthro)
    };

    final String title;
    final String courseNumber;
    final String description;
    final int year;
    final int imageResourceId;

    Book(String title, String courseNumber, String description, int year, int imageResourceId) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.year = year;
        this.imageResourceId = imageResourceId;
    }
}

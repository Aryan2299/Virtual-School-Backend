package com.digitalteaching.digitalteaching.list;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class NTreeTest {
    public LinkedHashMap<Object, Object> getTest() {


        String workbook1 = "WorkBook 1";
        String workbook2 = "WorkBook 2";

        String module1 = "Module 1";
        ArrayList subModule1 = new ArrayList() {{
            add(workbook1);
            add(workbook2);
        }};

        String module2 = "Module 2";
        ArrayList subModule2 = new ArrayList() {{
            add(workbook1);
            add(workbook2);
        }};

        String module3 = "Module 3";
        ArrayList subModule3 = new ArrayList() {{
            add(workbook1);
            add(workbook2);
        }};

        String module4 = "Module 4";
        ArrayList subModule4 = new ArrayList() {{
            add(workbook1);
            add(workbook2);
        }};

        String module5 = "Module 5";
        ArrayList subModule5 = new ArrayList() {{
            add(workbook1);
            add(workbook2);
        }};


        String lesson1 = "Lesson 1";
        ArrayList subLesson1  = new ArrayList() {{
            add(module1);
            add(module2);
            add(module3);
            add(module4);
            add(module5);
        }};

        String lesson2 = "Lesson 2";
        ArrayList subLesson2 = new ArrayList() {{
            add(module1);
            add(module2);
            add(module3);
            add(module4);
            add(module5);
        }};

        String lesson3 = "Lesson 3";
        ArrayList subLesson3 = new ArrayList() {{
            add(module1);
            add(module2);
            add(module3);
            add(module4);
            add(module5);
        }};

        String lesson4 = "Lesson 4";
        ArrayList subLesson4  = new ArrayList() {{
            add(module1);
            add(module2);
            add(module3);
            add(module4);
            add(module5);
        }};

        String lesson5 = "Lesson 5";
        ArrayList subLesson5 = new ArrayList() {{
            add(module1);
            add(module2);
            add(module3);
            add(module4);
            add(module5);
        }};


        String subject1 = "English";
        ArrayList subSubject1 = new ArrayList() {{
            add(lesson1);
            add(lesson2);
            add(lesson3);
            add(lesson4);
        }};

        String subject2 = "Maths";
        ArrayList subSubject2 = new ArrayList() {{
            add(lesson1);
            add(lesson2);
            add(lesson3);
        }};

        String subject3 = "Physics";
        ArrayList subSubject3 = new ArrayList() {{
            add(lesson1);
            add(lesson2);
            add(lesson3);
            add(lesson4);
            add(lesson5);
        }};

        String subject4 = "Chemistry";
        ArrayList subSubject4 = new ArrayList() {{
            add(lesson1);
            add(lesson2);
            add(lesson3);
        }};

        ArrayList subSubject5 = new ArrayList() {{
            add(lesson1);
            add(lesson2);
        }};
        String subject5 = "Biology";


        String folder4 = "Folder 4";
        ArrayList subFolder4 = new ArrayList() {{
            add(subject1);
            add(subject2);
            add(subject5);
        }};

        String folder3 = "Folder 3";
        ArrayList subFolder3 = new ArrayList() {{
            add(subject4);
        }};

        String folder2 = "Folder 2";
        ArrayList subFolder2 = new ArrayList() {{
            add(subject3);
            add(subject2);
        }};

        String folder1 = "Folder 1";
        ArrayList subFolder1 = new ArrayList() {{
            add(subject1);
            add(subject2);
        }};

        String folders = "Folders";
        ArrayList subFolders = new ArrayList() {{
            add(folder1);
            add(folder2);
            add(folder3);
            add(folder4);
        }};

        String root = "Teacher";
        ArrayList subRoots = new ArrayList() {{
            add(folders);
        }};

        NTree newTree = new NTree();
        newTree.addNewNode(root, subRoots);
        newTree.addNewNode(folders, subFolders);
        newTree.addNewNode(folder1, subFolder1);
        newTree.addNewNode(folder2, subFolder2);
        newTree.addNewNode(folder3, subFolder3);
        newTree.addNewNode(folder4, subFolder4);
        newTree.addNewNode(subject1, subSubject1);
        newTree.addNewNode(subject2, subSubject2);
        newTree.addNewNode(subject3, subSubject3);
        newTree.addNewNode(subject4, subSubject4);
        newTree.addNewNode(subject5, subSubject5);
        newTree.addNewNode(lesson1, subLesson1);
        newTree.addNewNode(lesson2, subLesson2);
        newTree.addNewNode(lesson3, subLesson3);
        newTree.addNewNode(lesson4, subLesson4);
        newTree.addNewNode(lesson5, subLesson5);
        newTree.addNewNode(module1, subModule1);
        newTree.addNewNode(module2, subModule2);
        newTree.addNewNode(module3, subModule3);
        newTree.addNewNode(module4, subModule4);
        newTree.addNewNode(module5, subModule5);

        return newTree.getNodes();
    }

    public static void main(String[] args) {
        NTreeTest test = new NTreeTest();
        System.out.println(test.getTest());
    }
}

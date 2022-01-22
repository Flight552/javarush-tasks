package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "ZergZerg";
        zerg2.name = "Zerg2";
        zerg3.name = "KryaKrya";
        zerg4.name = "Zerg2332";
        zerg5.name = "KryaKrya3243";
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.name = "fsadfs";
        protoss2.name = "asdf";
        protoss3.name = "fasdf";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        terran1.name = "ytyrt";
        terran2.name = "ytr";
        terran3.name = "ytryr";
        terran4.name = "yttt";



    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

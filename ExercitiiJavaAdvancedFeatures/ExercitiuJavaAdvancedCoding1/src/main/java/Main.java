import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Inventar:
        //O sa avem nevoie de 2 fisiere text
        //O sa avem nevoie de clasele: -  Person ( clasa abstracta )
        //       Trainer
        // -Trainee
        // -Exceptia MaximumNumberOfStudentsReached
        // -SoftwareDevelopmentAcademy : contine o colectie (set) de grupe (folosim singleton)
        // -Group
        //O sa folosim colectia set pentru Trainee si mai avem nevoie de 3 colectii

        try {
            String filePathTrainees1 = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierTrainees1.txt";
            String filePathTrainees2 = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierTrainees2.txt";
            String filePathTrainees3 = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierTrainees3.txt";
            String filePathGroups = "C:\\Users\\codru\\RepositoryCursJavaGalati\\FisierGrupe.txt";

            FileReader fileReaderTrainees1 = new FileReader(filePathTrainees1);
            FileReader fileReaderTrainees2 = new FileReader(filePathTrainees2);
            FileReader fileReaderTrainees3 = new FileReader(filePathTrainees3);
            FileReader fileReaderGroups = new FileReader(filePathGroups);

            BufferedReader bufferedReaderTrainees1 = new BufferedReader(fileReaderTrainees1);
            BufferedReader bufferedReaderTrainees2 = new BufferedReader(fileReaderTrainees2);
            BufferedReader bufferedReaderTrainees3 = new BufferedReader(fileReaderTrainees3);
            BufferedReader bufferedReaderGroups = new BufferedReader(fileReaderGroups);

            //Ne ocupam de studentii din grupa1
            Set<Trainee> traineesGroup1 = new HashSet<Trainee>();
            String text = bufferedReaderTrainees1.readLine();
            while (text != null && !(text.isEmpty())) {
                System.out.println("Afisam linia " + text);
                String[] arrayCuvinte = text.split(";");
                Trainee trainee = new Trainee(arrayCuvinte[0], arrayCuvinte[1], Integer.valueOf(arrayCuvinte[2]), Boolean.valueOf(arrayCuvinte[3]));
                if(traineesGroup1.size() == 5){
                    throw new MaximumNumberOfStudentsReached("Numarul studentilor din grupa 1 este prea mare");
                }else {
                    traineesGroup1.add(trainee);
                }
                text = bufferedReaderTrainees1.readLine();
            }

            System.out.println("Afisam studentii din grupa1");
            for (Trainee trainee : traineesGroup1) {
                System.out.println(trainee);
            }
            //Ne ocupam de studentii din grupa2
            Set<Trainee> traineesGroup2 = new HashSet<Trainee>();
            String text2 = bufferedReaderTrainees2.readLine();
            while (text2 != null && !text2.isEmpty()) {
                System.out.println("Afisam linia " + text2);
                String[] arrayCuvinte = text2.split(";");
                Trainee trainee = new Trainee(arrayCuvinte[0], arrayCuvinte[1], Integer.valueOf(arrayCuvinte[2]), Boolean.valueOf(arrayCuvinte[3]));
                if(traineesGroup2.size() == 5){
                    throw new MaximumNumberOfStudentsReached("Numarul studentilor din grupa 2 este prea mare");
                }else{
                    traineesGroup2.add(trainee);
                }
                text2 = bufferedReaderTrainees2.readLine();
            }
            System.out.println("Afisam studentii din grupa2");
            for (Trainee trainee : traineesGroup2) {
                System.out.println(trainee);
            }
            //Ne ocupam de studentii din grupa3
            Set<Trainee> traineesGroup3 = new HashSet<Trainee>();
            String text3 = bufferedReaderTrainees3.readLine();
            while (text3 != null && !text3.isEmpty()) {
                System.out.println("Afisam linia " + text3);
                String[] arrayCuvinte = text3.split(";");
                Trainee trainee = new Trainee(arrayCuvinte[0], arrayCuvinte[1], Integer.valueOf(arrayCuvinte[2]), Boolean.valueOf(arrayCuvinte[3]));
                if(traineesGroup3.size() == 5){
                    throw new MaximumNumberOfStudentsReached("Numarul studentilor din grupa 3 este prea mare");
                }else{
                    traineesGroup3.add(trainee);
                }
                text3 = bufferedReaderTrainees3.readLine();
            }
            System.out.println("Afisam studentii din grupa3");
            for (Trainee trainee : traineesGroup3) {
                System.out.println(trainee);
            }
            Set<Group> groups = new HashSet<Group>();
            String text4 = bufferedReaderGroups.readLine();
            while (text4 != null && !text4.isEmpty()) {
                System.out.println("Afisam linia " + text4);
                String[] arrayCuvinte = text4.split(";");
                Trainer trainer = new Trainer(arrayCuvinte[1], arrayCuvinte[2], 30, true);
                Group group = new Group(arrayCuvinte[0], trainer);
                if (trainer.getName().equals("Alex")) {
                    group.setGroupTrainees(traineesGroup1);
                }
                if (trainer.getName().equals("Ion")) {
                    group.setGroupTrainees(traineesGroup2);
                }
                if (trainer.getName().equals("Lica")) {
                    group.setGroupTrainees(traineesGroup3);
                }
                groups.add(group);

                text4 = bufferedReaderGroups.readLine();

            }
            System.out.println("Afisam grupele");
            for (Group group : groups) {
                System.out.println(group);
            }
            SoftwareDevelopmentAcademy softwareDevelopmentAcademy = SoftwareDevelopmentAcademy.getInstance();
            softwareDevelopmentAcademy.setGroups(groups);

            //Afisam grupele care au numar maxim de studenti
            Set<Group> groupSet = softwareDevelopmentAcademy.getGroups();
            for(Group group: groupSet){
                if(group.getGroupTrainees().size() == 5){
                    System.out.println("Afisam grupele care au numar maxim de studenti " + group);
                }
            }

            //Afisam din grupe studentii care au peste 25 de ani
            Set<Group> groupSet1 = softwareDevelopmentAcademy.getGroups();
            for(Group group : groupSet1){
                for(Trainee trainee : group.getGroupTrainees()){
                    if(Year.now().getValue()-trainee.getAge() < 25){
                        System.out.println(trainee);
                    }
                }
            }

            //Afisam toti studentii care mai au cunostinte de programare
            Set<Group> groupSet2 = softwareDevelopmentAcademy.getGroups();
            for(Group group : groupSet2){
                for(Trainee trainee : group.getGroupTrainees()){
                    if(trainee.isKnowPrograming() == true){
                        System.out.println(trainee);
                    }
                }
            }

            //Afisam grupa care are cei mai multi studenti care nu au cunostinte de programare
            //pas 1 : trebuie sa numaram studentii fara cunostinte de programare
            //pas 2 : trebuie sa departajam fiecare grupa cu numarul de studenti care nu au cunostinte de programare
            //pas 3 : creem o colectie Map care care sa tina grupa si numarul studentilor care nu au cunostinte de programare
            //pas 4 :
            Set<Group> groupSet3 = softwareDevelopmentAcademy.getGroups();
            System.out.println("Afisam grupa care are numarul de studenti care nu au cunostinte de programare");
            Map<Group, Integer> groupMap = new HashMap<Group, Integer>();
            for(Group group : groupSet3){
                int traineeNumbers = 0;
                for(Trainee trainee : group.getGroupTrainees()){
                    if(trainee.isKnowPrograming() == false){
                        traineeNumbers++;
                    }
                }
                groupMap.put(group,traineeNumbers);
            }
            //Pas 4:Presupunem prin reducere la absurd ca numarul maxim de studenti fara cunostinte de programare este 0
            //maximumNumberOfTrainees si este 0, iar grupa cu numarul maxim de studenti este defauld
            Group groupWithMaxNumberOfTrainees = new Group();
            Integer maximumNumberOfTrainees = 0;
            for(Group group : groupMap.keySet()){
                //Declaram o variabila Integer pentru a lua valoarea pentru grupa curenta
                Integer currentNumberOfTrainees =groupMap.get(group);
                if(currentNumberOfTrainees > maximumNumberOfTrainees){
                    //MaximumNumberOfTrainees devine currentNumberOfTrainees
                    maximumNumberOfTrainees = currentNumberOfTrainees;
                    //Actualizam grupa groupNumberOfTrainees
                    groupWithMaxNumberOfTrainees = group;
                }
            }
            System.out.println("Afisam grupa cu numarul maxim de trainees " + groupWithMaxNumberOfTrainees);

         //Sa se afiseze grupa care are cei mai putini studenti sub 20 de ani
         Set<Group> groupSet4 = softwareDevelopmentAcademy.getGroups();
            System.out.println("Afisam grupa cu studentii care care au sub 20 de ani");

            Map<Group,Integer> groupMap2 = new HashMap<Group, Integer>();
            for(Group group : groupSet4){
                int traineeNumbers = 0;
                for(Trainee trainee : group.getGroupTrainees()){
                    if(Year.now().getValue()-trainee.getAge() < 20){
                        traineeNumbers ++;
                    }
                }
                groupMap2.put(group, traineeNumbers);
            }

            Group groupNumberOfTraineesUnder20 = new Group();
            Integer minimumNumbersOfTraineesUnder20 = 0;
            for(Group group : groupMap2.keySet()){
                Integer currentNumberOfTraineesUnder20 = groupMap2.get(group);
                if(currentNumberOfTraineesUnder20 > minimumNumbersOfTraineesUnder20){
                    minimumNumbersOfTraineesUnder20 = currentNumberOfTraineesUnder20;
                    groupNumberOfTraineesUnder20 = group;
                }
            }
            System.out.println("Afisam grupa cu numarul minim de trainees  sub 20 de ani " + groupNumberOfTraineesUnder20);






        }catch(MaximumNumberOfStudentsReached e){
            System.out.println("Sunt prea multi studenti");
        }catch(FileNotFoundException e){
            System.out.println("Nu am gasit fisierul " + e.getMessage());
        }catch(IOException e){
            System.out.println("A aparut o alta exceptie " + e.getMessage());
        }
    }
}
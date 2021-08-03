package ru.alcoholists.hackers.HackMeV2.model.filestructure.folder;

import org.springframework.stereotype.Component;

@Component
public class Folder implements FolderInterface {

    String folderName;
    String folderAuthorities;
    Folder[] folderChildren;
    Folder folderParent;


    @Override
    public void changeDir() {

    }

    @Override
    public void deleteElement() {

    }

    @Override
    public void copyElement() {

    }

    @Override
    public void changeName() {

    }

    @Override
    public void grantAuthorities() {

    }

    @Override
    public void move() {

    }
}

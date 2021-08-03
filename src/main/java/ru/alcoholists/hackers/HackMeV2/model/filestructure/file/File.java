package ru.alcoholists.hackers.HackMeV2.model.filestructure.file;

import org.springframework.stereotype.Component;

@Component
public class File implements FileInterface {

    String fileName;
    String fileAbsPath;
    long fileSize;
    String fileAuthorities;


    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

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

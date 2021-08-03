package ru.alcoholists.hackers.HackMeV2.model.filestructure.folder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.StructureInterface;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class Folder implements FolderInterface {

    @NonNull
    String folderName;
    @NonNull
    String folderAuthorities;
    @NonNull
    List<StructureInterface> folderChildren;

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

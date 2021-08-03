package ru.alcoholists.hackers.HackMeV2.model.filestructure.file;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.folder.Folder;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.folder.FolderInterface;

@RequiredArgsConstructor
@Getter
@Setter
public class File implements FileInterface {

    @NonNull
    String fileName;

    @NonNull
    String fileContents;

    @NonNull
    String fileAuthorities;

    FolderInterface fileParent;

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

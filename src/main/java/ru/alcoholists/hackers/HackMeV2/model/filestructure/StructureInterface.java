package ru.alcoholists.hackers.HackMeV2.model.filestructure;

import ru.alcoholists.hackers.HackMeV2.model.Computer;

import java.util.List;

public interface StructureInterface {

    void delete();
    StructureInterface clone();
    void setName(String name);
    void setAuthorities(String authorities);
    void setParent(Folder parent);
    void move(String newPath);
    String getName();
    Folder getParent();
    Computer getHost();
    String getAuthorities();

    default List<StructureInterface> getChildren() {
        return List.of(this);
    }
}

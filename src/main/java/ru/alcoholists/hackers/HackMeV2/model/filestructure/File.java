package ru.alcoholists.hackers.HackMeV2.model.filestructure;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class File extends AbstractStructure {
    private String contents;

    public File(String name, String authorities, Folder parent) {
        super(name, authorities, parent, parent.getHost());
    }

    @Override
    public List<StructureInterface> getChildren() {
        return super.getChildren();
    }
}

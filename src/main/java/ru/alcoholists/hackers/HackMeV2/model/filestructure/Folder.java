package ru.alcoholists.hackers.HackMeV2.model.filestructure;

import lombok.NonNull;
import ru.alcoholists.hackers.HackMeV2.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractStructure {
    @NonNull
    private final List<StructureInterface> children;

    public Folder(String name, String authorities, List<StructureInterface> children, Folder parent) {
        super(name, authorities, parent, parent.getHost());
        this.children = children;
    }

    public Folder(String name, String authorities, List<StructureInterface> children, Folder parent, Computer host) {
        super(name, authorities, parent, host);
        this.children = children;
    }

    public void addChild(StructureInterface child) {
        if (this.children.contains(child))
            throw new IllegalStateException(child + " has already been added into this folder");

        child.setParent(this);
        this.children.add(child);
    }

    public void removeChild(StructureInterface child) {
        if (!this.children.contains(child))
            throw new IllegalStateException(child + " is not present in the folder");

        child.setParent(null);
        this.children.remove(child);
    }

    @Override
    public List<StructureInterface> getChildren() {
        List<StructureInterface> result = new ArrayList<>(children);
        result.addAll(super.getChildren());
        return result;
    }
}

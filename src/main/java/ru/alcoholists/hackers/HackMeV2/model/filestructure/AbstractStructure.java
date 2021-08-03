package ru.alcoholists.hackers.HackMeV2.model.filestructure;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.SneakyThrows;
import ru.alcoholists.hackers.HackMeV2.model.Computer;
import ru.alcoholists.hackers.HackMeV2.util.FileSystemUtils;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@Setter
public abstract class AbstractStructure implements StructureInterface, Cloneable {
    private static final FileSystemUtils fileSystemUtils = FileSystemUtils.getInstance();

    @NotNull
    private Folder parent;

    @NonNull
    private String name;

    @NotNull
    private Computer host;

    @NonNull
    private String authorities;

    protected AbstractStructure(String name, String authorities, Folder parent, Computer host) {
        this.name = name;
        this.authorities = authorities;
        this.parent = parent;
        this.host = host;
    }

    @Override
    public void move(String newPath) {
        StructureInterface structureInterface = fileSystemUtils.parsePath(newPath, this.getHost().getRootFolder());

        if (structureInterface.getClass().equals(File.class))
            throw new IllegalArgumentException("Path should specify a directory, not a file");

        this.parent.removeChild(this);
        Folder folder = (Folder) structureInterface;
        folder.addChild(this);
    }

    @Override
    public void delete() {
        this.parent.removeChild(this);
        this.parent = null;
        this.host = null;
    }

    @Override
    @SneakyThrows
    public AbstractStructure clone() {
        AbstractStructure abstractStructure = (AbstractStructure) super.clone();
        abstractStructure.setName(name + " (Copy)");
        return abstractStructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AbstractStructure that = (AbstractStructure) o;
        return Objects.equals(parent, that.parent)
                && name.equals(that.name)
                && host.equals(that.host)
                && authorities.equals(that.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, name, host, authorities);
    }
}

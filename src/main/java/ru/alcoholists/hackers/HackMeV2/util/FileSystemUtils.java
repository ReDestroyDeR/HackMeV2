package ru.alcoholists.hackers.HackMeV2.util;

import org.springframework.stereotype.Service;
import ru.alcoholists.hackers.HackMeV2.model.Computer;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.File;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.Folder;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.StructureInterface;


public class FileSystemUtils {
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();

    public static FileSystemUtils getInstance() {
        return INSTANCE;
    }

    private FileSystemUtils() {}

    public String getFileSystemToken() {
        return "/";
    }

    public StructureInterface parsePath(String absolutePath, Folder target) {
        String name = absolutePath.split(this.getFileSystemToken())[1];
        int length = name.length();

        if (length <= 1)
            return target;

        StructureInterface[] files = (StructureInterface[]) target
                .getChildren()
                .stream()
                .filter(structureInterface -> structureInterface.getName().equals(name))
                .toArray();

        if (files.length > 1)
            throw new UnknownError(
                    "More than one result found during parsing of path " +
                            absolutePath + " on folder " + target);

        StructureInterface result = files[0];
        if (result.getClass().equals(File.class))
            return result;

        return parsePath(absolutePath.substring(length), (Folder) result);
    }
}

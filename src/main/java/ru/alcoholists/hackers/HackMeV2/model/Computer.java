package ru.alcoholists.hackers.HackMeV2.model;


import ru.alcoholists.hackers.HackMeV2.dto.OperationResult;
import ru.alcoholists.hackers.HackMeV2.model.command.Command;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.StructureInterface;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.folder.Folder;
import ru.alcoholists.hackers.HackMeV2.model.net.Ip;
import ru.alcoholists.hackers.HackMeV2.model.net.Port;

import java.util.Set;

public interface Computer {


    Ip getIp();
    Set<Port> getAvailablePorts();
    OperationResult<Boolean> connect();
    OperationResult<Boolean> execute(Command command);
}

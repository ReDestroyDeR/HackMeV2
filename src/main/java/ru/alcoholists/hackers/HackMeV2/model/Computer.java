package ru.alcoholists.hackers.HackMeV2.model;


import ru.alcoholists.hackers.HackMeV2.dto.OperationResult;
import ru.alcoholists.hackers.HackMeV2.model.command.Command;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.Folder;
import ru.alcoholists.hackers.HackMeV2.model.net.Ip;
import ru.alcoholists.hackers.HackMeV2.model.net.Port;

import java.util.Set;

public interface Computer {
    Folder getRootFolder();
    Ip getIp();
    Set<Port> getAvailablePorts();
    OperationResult<Boolean> connect();
    OperationResult<Object> execute(Command command);
}

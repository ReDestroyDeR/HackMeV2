package ru.alcoholists.hackers.HackMeV2.model;

import ru.alcoholists.hackers.HackMeV2.dto.OperationResult;
import ru.alcoholists.hackers.HackMeV2.model.command.Command;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.folder.Folder;
import ru.alcoholists.hackers.HackMeV2.model.filestructure.folder.FolderInterface;
import ru.alcoholists.hackers.HackMeV2.model.net.Ip;
import ru.alcoholists.hackers.HackMeV2.model.net.Port;

import java.util.Set;

public abstract class AbstractComputer implements Computer {
    protected Ip ip;
    protected Set<Port> ports;
    protected final FolderInterface rootFolder;

    private AbstractComputer(Ip ip, Set<Port> ports) {
        this.ip = ip;
        this.ports = ports;
        this.rootFolder = new Folder();
    }

    @Override
    public FolderInterface getRootFolder() {
        return rootFolder;
    }

    @Override
    public Ip getIp() {
        return ip;
    }

    @Override
    public Set<Port> getAvailablePorts() {
        return ports;
    }

    @Override
    public OperationResult<Boolean> connect() {
        return (getAvailablePorts().stream().anyMatch(port -> !port.isAvailable()))
                ? new OperationResult<>(
                        "Can't connect to " + getIp() +
                                " Have closed available ports: " + getAvailablePorts().toString(),
                false
                )
                : new OperationResult<>(
                "Connected to " + getIp(),
                true
        );
    }

    @Override
    public OperationResult<Object> execute(Command command) {
        return new OperationResult<>(
                "Executed " + command.toString() + " on " + this.getIp(),
                command.execute()
        );
    }
}

package commands;

import exceptions.WrongAmountOfElementsException;

/**
 * The RemoveHeadCommand class represents a command to remove an element from a collection by its id.
 * This command is used to remove an organization from the collection based on its id.
 */
public class RemoveHeadCommand extends AbstractCommand {
    private final Receiver receiver;

    /**
     * Constructs a RemoveHeadCommand with the specified receiver.
     *
     * @param receiver the receiver used to execute the command
     */
    public RemoveHeadCommand(Receiver receiver) {
        super("remove_head", "remove a head element");
        this.receiver = receiver;
    }

    /**
     * Executes the remove_by_id command, removing an element from the collection by its id.
     *
     * @param arg the command arguments
     * @throws WrongAmountOfElementsException if the number of arguments is incorrect
     */
    @Override
    public void execute(String[] arg) throws WrongAmountOfElementsException {
        if (arg.length == 0) throw new WrongAmountOfElementsException();
        receiver.removeHead();
    }

    /**
     * Displays information about the remove_by_id command.
     */
    @Override
    public void getCommandInformation() {
        System.out.println(super.toString());
    }
}

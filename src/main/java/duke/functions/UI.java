package duke.functions;

import duke.ToDoList;
import duke.exceptions.IndexDukeException;
import duke.tasks.Task;

/**
 * A class that contains different static methods to print messages for user interfaces.
 */
public class UI {
    private static final String startEndDivider = "____________________________________________________________\n";
    private static final String mainDivider = "@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n";
    private static final String errorDivider =  "!!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!!\n";

    private UI() {
    }

    /**
     * Prints the welcome message, the very first message that the user sees when Duke runs.
     */
    public static void welcomeMsg() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println(startEndDivider + "What can the Duke help you with today?\n" + startEndDivider);
    }

    /**
     * Prints the exit message, the last message that the user sees before the Duke program ends.
     */
    public static void exitMsg() {
        System.out.println(startEndDivider + "Goodbye, feel free to call the Duke again whenever you need.\n"
                + startEndDivider);
    }

    /**
     * Prints a message indicating a Task object has been either added into a ToDoList object or
     * deleted from a ToDoList object.
     *
     * @param ls The ToDoList object that the specified operation has occurred on.
     * @param task The Task object that has been added or deleted.
     * @param command The type of operation that was applied on the ToDoList object.
     */
    public static void taskAddDelete(ToDoList ls, Task task, String command) {
        System.out.println(mainDivider + "The Duke has " + command + " the following task:\n"
                + " - " + task + "\n"
                + "You now have " + ls.getToDoCount() + " task!\n" + mainDivider);
    }

    /**
     * Prints a message indicating a Task object in a ToDoList has been either marked or unmarked.
     *
     * @param ls The ToDoList object that the specified operation has occurred on.
     * @param index The position of the Task object on the ToDoList object that
     *              the specified operation is applied on.
     * @param command The type of operation that was applied on the Task object.
     */
    public static void taskMarking(ToDoList ls, int index, String command) throws IndexDukeException {
        System.out.println(mainDivider + "The Duke has " + command + " the following task:\n"
                + " - " + ls.getTask(index) + "\n" + mainDivider);
    }

    /**
     * Prints a message that shows the list of Task objects and their state
     * (whether marked or unmarked) in a ToDoList object.
     *
     * @param ls The ToDoList object that the list is to be printed from.
     */
    public static void listMsg(ToDoList ls) {
        System.out.println(mainDivider + "TO DO LIST:\n" + ls + mainDivider);
    }

    public static void errorMsg(String msg) {
        System.out.println("!!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!!\n"
                + msg + "\n"
                +  "!!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!!\n");
    }
}

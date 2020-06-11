package ru.job4j.tracker;


import ru.job4j.tracker.actions.*;

/**
 * Created by Sergey
 */
public class StartUI {


    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            try {
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            } catch (ArrayIndexOutOfBoundsException e) {
            }



        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new ShowAllItemsAction(), new ReplaceAction(), new DeleteAction(), new FindByIdAction(), new FindByNameAction(), new ExitAction()
        };

        new StartUI().init(input, tracker, actions);
    }


}




package br.ulbra.project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DailyActivities {

    private String task;
    public ArrayList<String> list;

    public DailyActivities() {
        list = new ArrayList();
    }

    public void save(String element) {

        if (element.equals("") || element.equals(null) || element.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type something");
        } else {
            list.add(element);
            JOptionPane.showMessageDialog(null, element + ", saved sucessfully");
        }
    }
//do you want to sort by primary key or name?//

    public String listing() {
        String element = "Task List \n";
        if (list.isEmpty()) {
            return "no tasks to do";
        } else {
            for (int i = 0; i < list.size(); i++) {
                element += (i + 1) + " - " + list.get(i) + "\n";
            }
            return element;
        }
    }
// falta fazer fazer alguma coisa 

    public void alter(int i, String newElement) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "list is empty");

        } // caso de problema, nao sempre
        else if (i > list.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "non-existent task");

        } else {
            list.set(i, newElement);
            JOptionPane.showMessageDialog(null, "altered sucessfully");

        }
    }

    public void erase(int i) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "list is empty");

        } else if (i > list.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "non-existent task");

        } else {
            list.remove(i);
            JOptionPane.showMessageDialog(null, "deleted sucessfully");
        }

    }

    public void clear() {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "list is already empty");
        } else {
            int options = JOptionPane.YES_NO_OPTION;

            int doubt
                    = JOptionPane.showConfirmDialog(null, "are you sure that you want to clear your list?", "confirmation", options);
            if (doubt == JOptionPane.YES_OPTION) {
                list.clear();
            } else {
                JOptionPane.showMessageDialog(null, "your list still here");
            }

        }
    }

    public void quantity(int number) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "you dont have tasks");

        } else {
            number = list.size();
            JOptionPane.showMessageDialog(null, "the list have " + number + " tasks");
        }

    }
//automaticamente atualizar a lista//

    public void orderList() {
        String element = "Task List \n";
        for (int i = 0; i < list.size(); i++) {
            element += (i + i) + " - " + list.get(i) + "\n";
            list.sort(null);
        }
    }

    public void checkVoid() {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "you've done all your tasks");
        } else {
            JOptionPane.showMessageDialog(null, "you have tasks to do");
        }
    }

     // Método para mover uma tarefa para o topo
    public void moveToTop(int i) {
        if (i >= 0 && i < list.size()) {
            String task = list.remove(i);  // Remove a tarefa do índice especificado
            list.add(0, task);  // Adiciona a tarefa no topo (índice 0)
        }
    }

    // Método para mover uma tarefa para baixo
    public void moveDown(int i) {
        if (i >= 0 && i < list.size() - 1) {
            String task = list.remove(i);  // Remove a tarefa do índice especificado
            list.add(i + 1, task);  // Adiciona a tarefa na próxima posição
        }
    }
}

//how to put to send using enter in a textbox

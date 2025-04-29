package suggestion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ChatBoxWithSuggestion extends JFrame {
	private static final long serialVersionUID = 1L;
    private JTextField inputField;
    private JTextArea chatArea;
    private JList<String> suggestionList;
    private DefaultListModel<String> listModel;
    private JScrollPane suggestionPane;

    private List<String> dictionary;

    public ChatBoxWithSuggestion() {
        setTitle("ChatBox with Suggestion");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        bottomPanel.add(inputField, BorderLayout.CENTER);

        listModel = new DefaultListModel<>();
        suggestionList = new JList<>(listModel);
        suggestionPane = new JScrollPane(suggestionList);
        suggestionPane.setPreferredSize(new Dimension(150, 80));
        bottomPanel.add(suggestionPane, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);

        dictionary = new ArrayList<>();
        dictionary.add("Hello");
        dictionary.add("How are you?");
        dictionary.add("Help");
        dictionary.add("Hey");
        dictionary.add("Goodbye");
        dictionary.add("Good night");

        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = inputField.getText();
                updateSuggestions(text);

                // Nếu nhấn Enter thì gửi tin nhắn
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });

        suggestionList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    String selected = suggestionList.getSelectedValue();
                    inputField.setText(selected);
                }
            }
        });
    }

    private void updateSuggestions(String input) {
        listModel.clear();
        if (input.isEmpty()) return;

        for (String word : dictionary) {
            if (word.toLowerCase().startsWith(input.toLowerCase())) {
                listModel.addElement(word);
            }
        }
    }

    private void sendMessage() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            chatArea.append("You: " + message + "\n");
            inputField.setText("");
            listModel.clear();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChatBoxWithSuggestion().setVisible(true);
        });
    }
}

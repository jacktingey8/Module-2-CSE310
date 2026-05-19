import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GUITerminal extends JFrame {

    private JTextArea outputArea;
    private JTextField inputField;

    public GUITerminal() {
        // Set up the window frame
        setTitle("Java GUI Terminal Mirror");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        outputArea = new JTextArea();
        outputArea.setEditable(false); // User shouldn't type directly into output
        outputArea.setBackground(Color.BLACK);
        outputArea.setForeground(Color.GREEN); // Classic hacker green text
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(outputArea);

        inputField = new JTextField();
        inputField.setBackground(Color.DARK_GRAY);
        inputField.setForeground(Color.WHITE);
        inputField.setCaretColor(Color.WHITE);
        inputField.setFont(new Font("Monospaced", Font.PLAIN, 12));

        // Layout arrangement
        setLayout(new BorderLayout());
        // add(scrollPane, BorderLayout_CENTER);
        add(inputField, BorderLayout.SOUTH);

        // Redirect System.out and System.err to the JTextArea
        redirectSystemStreams();

        // Handle user input when they press 'Enter'
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                
                // Echo the input to System.out (which will now appear in our GUI)
                System.out.println("> " + text);
                
                // Clear the input field for the next command
                inputField.setText("");
                
                // Example: Process the input commands
                processCommand(text);
            }
        });
    }

    // Helper method to route System.out to the JTextArea
    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                updateOutput(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateOutput(new String(b, off, len));
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }

    // Thread-safe wrapper to append text to JTextArea
    private void updateOutput(String text) {
        SwingUtilities.invokeLater(() -> {
            outputArea.append(text);
            // Auto-scroll to the bottom
            outputArea.setCaretPosition(outputArea.getDocument().getLength());
        });
    }

    // Dummy command processor to simulate real terminal interaction
    private void processCommand(String command) {
        switch (command.trim().toLowerCase()) {
            case "help":
                System.out.println("Available commands: help, hello, clear, exit");
                break;
            case "hello":
                System.out.println("Hello from the inner Java runtime!");
                break;
            case "clear":
                outputArea.setText("");
                break;
            case "exit":
                System.out.println("Closing application...");
                System.exit(0);
                break;
            default:
                System.out.println("Unknown command: " + command);
                break;
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            GUITerminal terminal = new GUITerminal();
            terminal.setVisible(true);
            
            // Initial boot text
            System.out.println("Terminal Mirror System Initialized.");
            System.out.println("Type 'help' to see available commands.");
            System.out.println("----------------------------------------");
        });
    }
}
    


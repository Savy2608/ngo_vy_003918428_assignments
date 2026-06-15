package ui.ServiceCenter;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Central place for the colours, fonts and component factories that give every
 * panel the same look as the approved design mock-up (light-lavender chrome,
 * periwinkle work areas, bold serif text and flat white rectangular buttons).
 *
 * @author vyngo
 */
public final class UiTheme {

    private UiTheme() { }

    // ---- Palette ----
    public static final Color LAVENDER   = new Color(204, 204, 245); // headers / page background
    public static final Color PERIWINKLE = new Color(130, 130, 240); // work areas / sub-panels
    public static final Color FIELD_BG   = Color.WHITE;
    public static final Color TEXT       = Color.BLACK;

    // ---- Fonts (serif to match the mock-up) ----
    public static final Font TITLE_FONT    = new Font(Font.SERIF, Font.BOLD, 28);
    public static final Font SUBTITLE_FONT = new Font(Font.SERIF, Font.BOLD, 18);
    public static final Font LABEL_FONT    = new Font(Font.SERIF, Font.BOLD, 14);
    public static final Font BUTTON_FONT   = new Font(Font.SERIF, Font.BOLD, 13);
    public static final Font FIELD_FONT    = new Font(Font.SERIF, Font.PLAIN, 14);

    public static JLabel title(String text) {
        JLabel l = new JLabel(text, SwingConstants.CENTER);
        l.setFont(TITLE_FONT);
        l.setForeground(TEXT);
        return l;
    }

    public static JLabel subtitle(String text) {
        JLabel l = new JLabel(text, SwingConstants.CENTER);
        l.setFont(SUBTITLE_FONT);
        l.setForeground(TEXT);
        return l;
    }

    public static JLabel label(String text) {
        JLabel l = new JLabel(text);
        l.setFont(LABEL_FONT);
        l.setForeground(TEXT);
        return l;
    }

    /** Flat white rectangular button with bold serif text, matching the mock-up. */
    public static JButton button(String text) {
        JButton b = new JButton(text);
        b.setFont(BUTTON_FONT);
        b.setForeground(TEXT);
        b.setBackground(Color.WHITE);
        b.setOpaque(true);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(120, 120, 120), 1),
                BorderFactory.createEmptyBorder(6, 18, 6, 18)));
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return b;
    }

    public static JTextField field(int columns) {
        JTextField f = new JTextField(columns);
        f.setFont(FIELD_FONT);
        f.setBackground(FIELD_BG);
        f.setBorder(new LineBorder(new Color(150, 150, 150), 1));
        return f;
    }

    /** A read-only field used to display auto-generated IDs. */
    public static JTextField readOnlyField(int columns) {
        JTextField f = field(columns);
        f.setEditable(false);
        f.setBackground(new Color(238, 238, 238));
        return f;
    }
}

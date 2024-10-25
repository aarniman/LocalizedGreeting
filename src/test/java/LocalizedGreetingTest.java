
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

public class LocalizedGreetingTest {

    @Test
    public void testEnglishGreeting() {
        Locale locale = new Locale("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello! Welcome to the world of Java.", greeting);
    }

    @Test
    public void testSpanishGreeting() {
        Locale locale = new Locale("es", "ES");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("¡Hola! Bienvenido al mundo de Java.", greeting);
    }

    @Test
    public void testFrenchGreeting() {
        Locale locale = new Locale("fr", "FR");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Bonjour! Bienvenue dans le monde de Java.", greeting);
    }

    @Test
    public void testFarsiGreeting() {
        Locale locale = new Locale("fa", "IR");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("سلام! به برنامه ما خوش آمدید", greeting);
    }

    @Test
    public void testJapaneseGreeting() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("こんにちは！ Java の世界へようこそ。", greeting);
    }

    @Test
    public void testInvalidChoiceDefaultsToEnglish() {
        Locale locale = new Locale("en", "US"); // Simulate default choice
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello! Welcome to the world of Java.", greeting); // Expected default is English
    }

}

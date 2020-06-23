import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.List;


public class Bot462 extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public void onUpdatesReceived(List<Update> updates) {

    }
    @Override
    public String getBotUsername() {
        return "mostafa462bot";
    }
    @Override
    public String getBotToken() {
        return "1282705480:AAGANNnWBozSdVLHtKIhdQUgGeCPep2sy0A";
    }
}

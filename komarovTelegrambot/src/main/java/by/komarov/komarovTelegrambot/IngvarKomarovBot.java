package by.komarov.komarovTelegrambot;

import by.komarov.komarovTelegrambot.komarovTelegrambotService.RequestDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;


@Component
public class IngvarKomarovBot extends TelegramLongPollingBot {
    @Autowired
    RequestDispatcher requestDispatcher;

    @Override
    public String getBotToken() {
        return "1240356999:AAHAvcsO3NJiMg-8voYyz7YBSCyynMf0Au0";
    }

    @Override
    public String getBotUsername() {
        return "IngvarKomarovBot";
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        requestDispatcher.dispatch((Update) updates);

    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message.hasText()){
                String text = message.getText();       
                if(text.equals("/start")){
                    String response = "Привет, " + message.getFrom().getFirstName() + ". Это бот. Можно что то спрашивать, но пока он ничего толком не ответит)";
                    sendMsg(message, response);
                }
            }
        }
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message.hasText()){
                String text = message.getText();
                switch (text) {
                    case "/Что это?": {
                        String response = "Это бот. Можно что то спрашивать, но пока он ничего толком не ответит)";
                        sendMsg(message, response);
                        break;
                    }
                    case "/Bye": {
                        String response = "Ok, bye";
                        sendMsg(message, response);
                        break;
                    }
                    case "/Что сделать на ужин?": {
                        String response = "На ночь есть вредно!";
                        sendMsg(message, response);
                        break;
                    }
                    case "/Какой фильм глянуть?": {
                        String response = "Смотря какое настроение у тебя сегодня";
                        sendMsg(message, response);
                        break;
                    }
                    case "/Хорошее": {
                        String response = "Тогда глянь что нибудь что заставит посмотреть на мир по другому, например фильм Лифт, ну или сам выбери https://rezka.ag/films/best/ ";
                        sendMsg(message, response);
                        break;
                    }
                    case "/Плохое": {
                        String response = "Тогда глянь что нибудь из комедий, Начало времен довольно не плохая";
                        sendMsg(message, response);
                        break;
                    }
                }
             }
        }
    }




    public void sendMsg (Message message, String response){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(response);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
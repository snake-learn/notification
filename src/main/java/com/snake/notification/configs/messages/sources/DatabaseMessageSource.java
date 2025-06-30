package com.snake.notification.configs.messages.sources;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

public class DatabaseMessageSource implements MessageSource {
    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return code;
    }

    @Override
    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
        return code;
    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
        return "";
    }
}

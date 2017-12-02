package es.hedasoft.service.impl;

import es.hedasoft.service.ServiceBook;
import org.springframework.stereotype.Service;

@Service
public class ServiceBookImpl implements ServiceBook
{
    @Override
    public Boolean checkTitle(String title)
    {
        return title != null && !title.isEmpty();
    }
}

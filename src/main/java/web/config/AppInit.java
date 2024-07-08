package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
Практическая задача

Условие:

    Перейдем к созданию рабочего web-приложения. Все ключевые моменты были рассмотрены в предыдущих задачах. Теперь вам
требуется их сопоставить и связать в один проект.
    Используя наработки по mvc и hibernate соберите CRUD-приложение.

Задание:

    1. Написать CRUD-приложение. Использовать Spring MVC + Hibernate.
    2. Должен быть класс User с произвольными полями (id, name и т.п.).
    3. В приложении должна быть страница, на которую выводятся все юзеры с возможностью добавлять, удалять и изменять
       юзера.
    4. Конфигурация Spring через JavaConfig и аннотации, по аналогии с предыдущими проектами. Без использования xml. Без
       Spring Boot.
    5. Внесите изменения в конфигурацию для работы с базой данных. Вместо SessionFactory должен использоваться
       EntityManager.
    6. Используйте только GET/POST маппинги
    7. Используйте ReqestParam аннотацию, использование аннотации PathVariable запрещено
*/

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
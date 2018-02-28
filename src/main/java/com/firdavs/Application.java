package com.firdavs;

import com.firdavs.persistence.data.HibernateUtil;
import com.firdavs.persistence.entitites.User;
import org.hibernate.Session;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Application {
    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        User user= new User();
//        user.setFirstName("Alim");
//        user.setLastName("Haydarov");
//        user.setBirthDate(new Date());
//        user.setCreatedBy("Me");
//        user.setCreatedDate(new Date());
//        user.setEmailAddress("firdavs888@mail.ru");
//        user.setLastUpdatedBy("Me");
//        user.setLastUpdatedDate(new Date());
//        session.save(user);
//        session.getTransaction().commit();
//        session.beginTransaction();
//        User dbUser=(User) session.get(User.class, user.getUserId());
//        dbUser.setFirstName("Firdavs");
//        session.update(dbUser);
//        session.getTransaction().commit();
//
//        session.close();
//        System.out.println("Session closed");
//        HibernateUtil.shutdown();

        Session session= HibernateUtil.getSessionFactory().openSession();
            try {
                session.beginTransaction();
                User user=new User();
                user.setBirthDate(getMyBirthday());
                user.setCreatedBy("Fred");
                user.setCreatedDate(new Date());
                user.setEmailAddress("firdavs888@mail.ru");
                user.setFirstName("Firdavs");
                user.setLastName("Khaydarov");
                user.setLastUpdatedBy("Fred");
                user.setLastUpdatedDate(new Date());

                session.save(user);
                session.getTransaction().commit();
                session.refresh(user);
                System.out.println(user.getAge());
                session.close();





            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                session.close();
                HibernateUtil.getSessionFactory().close();
            }



        //------------------------------------------------------------
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        TimeTest timeTest=new TimeTest(new Date());
//        session.beginTransaction();
//        session.save(timeTest);
//        session.getTransaction().commit();
//        session.refresh(timeTest);
//        System.out.println(timeTest);
//        session.close();
//        HibernateUtil.shutdown();






    }

    private static Date getMyBirthday() {
        Calendar calendar=Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.set(Calendar.MONTH,6);
        calendar.set(Calendar.YEAR,1982);
        calendar.set(Calendar.DATE,8);


        return calendar.getTime();

    }
}

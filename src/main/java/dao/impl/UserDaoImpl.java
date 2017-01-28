package dao.impl;

import dao.UserDao;
import dao.util.EntityManagerUtil;
import domain.User;
import dto.UserDTO;

import javax.persistence.EntityManager;

/**
 * @author Stepan
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean saveUser(String firstName, String login, String password) {
        EntityManager em = null;
        try  {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            User user = new User();
            user.setFirstName(firstName);
            user.setLogin(login);
            user.setPassword(password);
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            return false;
        }
        finally {
            if(em != null)
               em.close();
        }
        return true;
    }

    @Override
    public UserDTO getUserByLogin(String login) {
        User user = null;
        EntityManager em = null ;
        try  {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            user = em.createQuery("from domain.User u where login=:login", User.class)
                    .setParameter("login", login).getSingleResult();
            em.getTransaction().commit();
        }
        finally {
            if(em != null)
                em.close();
        }
        if (user == null)
            return null;
        else
            return new UserDTO(user.getId(), user.getFirstName(), user.getLogin(), user.getPassword());
    }
}

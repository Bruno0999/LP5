/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author u08774796151
 */
public class UsuariosDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public void update(Object object) {
         session.beginTransaction();
        session.update(object);
        session.beginTransaction().commit();    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.beginTransaction().commit();     }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

package com.treinamento.teste;


import com.treinamento.dao.*;

import javax.persistence.EntityManager;

public class FindAll {

    public static void main(String[] args) {
        // obtém o entity manager
        EntityManager em = JPAUtil.getEntityManager();

        EmpresaDAO empresaDAO= new EmpresaDAO(em);
        UnidadeDAO unidadeDAO=new UnidadeDAO(em);
        CursoDAO cursoDAO= new CursoDAO(em);
        DisciplinaDAO disciplinaDAO=new DisciplinaDAO(em);
        PeriodoCursoDAO periodoCursoDAO=new PeriodoCursoDAO(em);
        AlunoDAO alunoDAO= new AlunoDAO(em);
        ProfessorDAO professorDAO=new ProfessorDAO(em);

       empresaDAO.findAll2();





        em.close();














    }
}

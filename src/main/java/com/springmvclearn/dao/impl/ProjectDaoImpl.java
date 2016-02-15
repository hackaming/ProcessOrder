package com.springmvclearn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvclearn.dao.ProjectDao;
import com.springmvclearn.model.Project;

@Component("ProjectDao")
public class ProjectDaoImpl implements ProjectDao {
	@Resource
	private HibernateTemplate hibernatetemplate;

	@Override
	public void addProject(Project project) {
		hibernatetemplate.save(project);

	}

	@Override
	public void deleteProject(Project project) {
		hibernatetemplate.delete(project);
		

	}

	@Override
	public void deleteProjectById(int id) {
		hibernatetemplate.delete(this.findById(id));
	}

	@Override
	public List<Project> findAll() {
		return (ArrayList<Project>) hibernatetemplate.find("from Project");
	}

	@Override
	public Project findById(int id) { //may need to change to a list becuase the return type is a list
		return (Project)hibernatetemplate.find("from Project where id="+"'"+id+"'").get(0);
		
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

}

package com.udemy.servletdemo.mvctwo;

public class Student
{
    private String _firstName;
    private String _lastName;
    private String _email;
    
    public Student(String _firstName, String _lastName, String _email)
    {
        super();
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._email = _email;
    }

    public String get_firstName()
    {
        return _firstName;
    }

    public void set_firstName(String _firstName)
    {
        this._firstName = _firstName;
    }

    public String get_lastName()
    {
        return _lastName;
    }

    public void set_lastName(String _lastName)
    {
        this._lastName = _lastName;
    }

    public String get_email()
    {
        return _email;
    }

    public void set_email(String _email)
    {
        this._email = _email;
    }
    
    
}

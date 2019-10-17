package com.clase.listview;

import java.io.Serializable;

public class Situacion implements Serializable {
    private float n1;
    private float n2;
    private float n3;
    private float n4;
    private float promedio;
    private String situacion;
    private String asignatura;

    public Situacion() {

    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Situacion(float n1, float n2, float n3, float n4, float promedio, String situacion, String asignatura) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.promedio = promedio;
        this.situacion = situacion;
        this.asignatura = asignatura;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getN4() {
        return n4;
    }

    public void setN4(float n4) {
        this.n4 = n4;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public float promedio(String asignatura, float n1, float n2, float n3, float n4)
    {
        float r;
        if(asignatura.equals("CALCULO"))
        {
            r= n1*0.15f + n2*0.25f + n3*0.25f+n4*0.35f;
        }
        else
        {
            if(asignatura.equals("PROGRAMACION"))
            {
                r=(n1*0.20f+n2*0.25f+n3*0.30f+n4*0.25f);
            }
            else
            {
                r=(n1*0.10f+n2*0.20f+n3*0.30f+n4*0.40f);
            }
        }
        return r;
    }

    public String situacion(String asignatura, float promedio)
    {
        String r;
        if(asignatura.equals("CALCULO"))
        {
            if(promedio>=40)
            {
                r="APRUEBA";
            }
            else
            {
                r="REPRUEBA";
            }
        }
        else
        {
            if(asignatura.equals("PROGRAMACION"))
            {
                if(promedio>=50)
                {
                    r="APRUEBA";
                }
                else
                {
                    r="REPRUEBA";
                }
            }
            else
            {
                if(promedio>=50)
                {
                    r="APRUEBA";
                }
                else
                {
                    if(promedio>=40 && promedio<50)
                    {
                        r="RENDIR EXAMEN";
                    }
                    else
                    {
                        r="REPRUEBA";
                    }
                }
            }
        }
        return r;
    }
}

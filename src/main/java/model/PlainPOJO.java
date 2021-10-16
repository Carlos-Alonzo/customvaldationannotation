package model;

import validation.FirstCapLetter;

import javax.validation.constraints.NotNull;

public class PlainPOJO
{
    @NotNull
    @FirstCapLetter
    private String name;
    private int instanceId;

    private PlainPOJO (int id, String name)
    {
        this.instanceId = id;
        this.name = name;
    }
    public static PlainPOJO newInstance(int id, String name)
    {
        return new PlainPOJO(id, name);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getInstanceId()
    {
        return instanceId;
    }
    public void setInstanceId(int instanceId)
    {
        this.instanceId = instanceId;
    }
}

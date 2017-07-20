package net.flow9.rxandroidbasic08.domain;

/**
 * Created by pc on 7/20/2017.
 */

public class Data
{
    private RealtimeWeatherStation RealtimeWeatherStation;

    public RealtimeWeatherStation getRealtimeWeatherStation ()
    {
        return RealtimeWeatherStation;
    }

    public void setRealtimeWeatherStation (RealtimeWeatherStation RealtimeWeatherStation)
    {
        this.RealtimeWeatherStation = RealtimeWeatherStation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RealtimeWeatherStation = "+RealtimeWeatherStation+"]";
    }
}
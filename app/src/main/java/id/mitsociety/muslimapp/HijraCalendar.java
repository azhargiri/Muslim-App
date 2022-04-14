package id.mitsociety.muslimapp;

import org.arabeyes.itl.hijri.ConvertedDate;
import org.arabeyes.itl.hijri.Hijri;
import org.arabeyes.itl.hijri.UmmAlqura;

import java.util.Date;
import java.util.Locale;

public class HijraCalendar {
    public static ConvertedDate fromGregorian(double lat, double lng, Date gDate, Locale locale)
    {
        UmmAlqura uqCalculator = new UmmAlqura(locale);
        ConvertedDate uDate = uqCalculator.g2h(gDate);
        return uDate;
    }
}

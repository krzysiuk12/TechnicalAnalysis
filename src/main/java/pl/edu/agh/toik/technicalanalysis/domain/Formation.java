package pl.edu.agh.toik.technicalanalysis.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by Krzysztof Kicinger on 2015-05-10.
 */
public class Formation {

    private final Date startDate;
    private final Date endDate;
    private final FormationType type;
    private final List<Candle> candles;

    public Formation(Date startDate, Date endDate, FormationType type, List<Candle> candles) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.candles = candles;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public FormationType getType() {
        return type;
    }

    public List<Candle> getCandles() {
        return candles;
    }

}

package pl.edu.agh.toik.technicalanalysis.chart;

import pl.edu.agh.toik.technicalanalysis.domain.Candle;
import pl.edu.agh.toik.technicalanalysis.domain.Formation;
import pl.edu.agh.toik.technicalanalysis.domain.ListedCompany;

import java.util.Date;
import java.util.List;

/**
 * Created by Krzysztof Kicinger on 2015-05-14.
 */
public class CandlestickChart {

    private ListedCompany listedCompany;
    private List<Candle> candles;
    private List<Formation> formations;
    private Date startDate;
    private Date endDate;

    public CandlestickChart() {
    }

    public ListedCompany getListedCompany() {
        return listedCompany;
    }

    public void setListedCompany(ListedCompany listedCompany) {
        this.listedCompany = listedCompany;
    }

    public List<Candle> getCandles() {
        return candles;
    }

    public void setCandles(List<Candle> candles) {
        this.candles = candles;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
